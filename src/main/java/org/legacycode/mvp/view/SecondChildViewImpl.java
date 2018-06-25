package org.legacycode.mvp.view;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.legacycode.mvp.presenter.SecondChildPresenter;
import org.legacycode.mvp.view.table.UserTable;
import org.legacycode.mvp.view.table.UserTableImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondChildViewImpl extends JPanel implements SecondChildView {

	private static final long serialVersionUID = 1;

	@SuppressWarnings("unused")
	/** In this class the parent is not used. This is only for example. **/
	private transient MainFrameView parentView;
	private JButton secondChildButton = new JButton();

	private JLabel secondChildLabel = new JLabel();
	private transient SecondChildPresenter secondChildPresenter;
	private UserTableImpl secondChildUserTable = new UserTableImpl();

	@Override
	public void addSecondChildButtonListener(ActionListener l) {
		secondChildButton.addActionListener(l);
	}

	@Override
	public UserTable getSecondChildUserTable() {
		return this.secondChildUserTable;
	}

	@PostConstruct
	public void init() {
		add(secondChildLabel);
		add(secondChildButton);
		add(secondChildUserTable);

		// set table event in view
		secondChildUserTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				secondChildPresenter.showSecondChildInfoDialog();
			}
		});
	}

	@Override
	public void refresh() {
		revalidate();
		repaint();
	}

	@Override
	@Autowired
	public void setParentView(MainFrameView v) {
		this.parentView = v;
	}

	@Override
	public void setSecondChildButtonText(String buttonText) {
		secondChildButton.setText(buttonText);
	}

	@Override
	public void setSecondChildLabelText(String labelText) {
		secondChildLabel.setText(labelText);
	}

	@Autowired
	@Override
	public void setSecondChildPresenter(SecondChildPresenter secondChildPresenter) {
		this.secondChildPresenter = secondChildPresenter;
	}

	/**
	 * This messagebox should show how to handle relationship to parent.
	 * 
	 * @param message
	 *            that will be shown in a dialob box.
	 */
	@Override
	public void showSecondChildInfoDialog(String message) {
		JOptionPane.showMessageDialog((JFrame) parentView, message);
	}

}
