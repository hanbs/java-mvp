package org.legacycode.mvp.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.stereotype.Component;

@Component
public class MainFrameViewImpl extends JFrame implements MainFrameView {

	private static final long serialVersionUID = 1;

	public MainFrameViewImpl() {
		setLayout(new GridLayout(0, 1, 10, 10));
		setLocationRelativeTo(null);
	}

	@Override
	public void addFirstChildView(FirstChildView v) {
		this.add((JPanel) v);
	}

	@Override
	public void addSecondChildView(SecondChildView v) {
		this.add((JPanel) v);
	}

	@Override
	public void showView() {
		this.pack();
		this.setVisible(true);
	}

}
