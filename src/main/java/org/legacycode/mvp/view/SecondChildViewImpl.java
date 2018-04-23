package org.legacycode.mvp.view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import org.legacycode.mvp.entity.User;
import org.legacycode.mvp.view.tablemodel.UserTableModel;
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
	private JTable secondChildTable = new JTable();
	private UserTableModel userTableModel;

	public SecondChildViewImpl() {
		add(secondChildLabel);
		add(secondChildButton);
		add(secondChildTable);
	}

	@Override
	public void addSecondChildButtonListener(ActionListener l) {
		secondChildButton.addActionListener(l);
	}

	@Override
	public void addSecondChildTableMouseListener(MouseListener listSelectionListener) {
		secondChildTable.addMouseListener(listSelectionListener);
	}

	@Override
	public int getSecondChildTableSelectedRow() {
		return secondChildTable.getSelectedRow();
	}

	@Override
	public User getSecondChildTableUser(int row) {
		return userTableModel.getUser(row);
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

	@Override
	public void setSecondChildTableData(List<User> users) {
		userTableModel = new UserTableModel(users);
		secondChildTable.setModel(userTableModel);
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
