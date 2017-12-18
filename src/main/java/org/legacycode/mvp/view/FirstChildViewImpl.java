package org.legacycode.mvp.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.legacycode.mvp.presenter.MainFramePresenter;
import org.springframework.stereotype.Component;

@Component
public class FirstChildViewImpl extends JPanel implements FirstChildView {

	private static final long serialVersionUID = 1L;

	JButton firstChildButton = new JButton();
	JLabel firstChildLabel = new JLabel();

	public FirstChildViewImpl() {
		add(firstChildLabel);
		add(firstChildButton);
	}

	@Override
	public void addFirstChildButtonListener(ActionListener listener) {
		firstChildButton.addActionListener(listener);
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

	/**
	 * This messagebox should show how to handle relationship to parent.
	 * 
	 * @param message
	 *            that will be shown in a dialob box.
	 */
	@Override
	public void showFirstChildInfoDialog(MainFramePresenter mainFramePresenter, String message) {
		JOptionPane.showMessageDialog((JFrame) mainFramePresenter.getMainFrameView(), message);
	}

}
