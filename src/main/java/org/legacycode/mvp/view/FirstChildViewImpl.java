package org.legacycode.mvp.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstChildViewImpl extends JPanel implements FirstChildView {

	private static final long serialVersionUID = 1;
	private JButton firstChildButton = new JButton();
	private JLabel firstChildLabel = new JLabel();
	private transient MainFrameView parentView;

	@Autowired
	public FirstChildViewImpl() {
		add(firstChildLabel);
		add(firstChildButton);
	}

	@Override
	public void addFirstChildButtonListener(ActionListener l) {
		firstChildButton.addActionListener(l);
	}

	@Override
	public void refresh() {
		revalidate();
		repaint();
	}

	@Override
	public void setFirstChildButtonText(String buttonText) {
		firstChildButton.setText(buttonText);
	}

	@Override
	public void setFirstChildLabelText(String labelText) {
		firstChildLabel.setText(labelText);
	}

	@Override
	@Autowired
	public void setParentView(MainFrameView v) {
		this.parentView = v;
	}

	/**
	 * This messagebox should show how to handle relationship to parent.
	 * 
	 * @param message
	 *            that will be shown in a dialob box.
	 */
	@Override
	public void showFirstChildInfoDialog(String message) {
		JOptionPane.showMessageDialog((JFrame) parentView, message);
	}

}
