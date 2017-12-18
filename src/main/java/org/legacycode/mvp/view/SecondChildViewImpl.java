package org.legacycode.mvp.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.springframework.stereotype.Component;

@Component
public class SecondChildViewImpl extends JPanel implements SecondChildView {

	private static final long serialVersionUID = 1L;

	JButton secondChildButton = new JButton();
	JLabel secondChildLabel = new JLabel();

	public SecondChildViewImpl() {
		add(secondChildLabel);
		add(secondChildButton);
	}

	@Override
	public void addSecondChildButtonListener(ActionListener listener) {
		secondChildButton.addActionListener(listener);
	}

	@Override
	public void refresh() {
		revalidate();
		repaint();
	}

	@Override
	public void setSecondChildButtonText(String buttonText) {
		secondChildButton.setText(buttonText);
	}
	
	@Override
	public void setSecondChildLabelText(String labelText) {
		secondChildLabel.setText(labelText);
	}	
	
}
