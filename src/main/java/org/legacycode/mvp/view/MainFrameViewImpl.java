package org.legacycode.mvp.view;

import java.awt.GridLayout;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainFrameViewImpl extends JFrame implements MainFrameView {

	private static final long serialVersionUID = 1;
	private final transient FirstChildView firstChildView;
	private final transient SecondChildView secondChildView;

	@Autowired
	public MainFrameViewImpl(FirstChildView firstChildView, SecondChildView secondChildView) {
		this.firstChildView = firstChildView;
		this.secondChildView = secondChildView;

	}

	@PostConstruct
	public void init() {
		setLayout(new GridLayout(0, 1, 10, 10));
		setLocationRelativeTo(null);
		add((JPanel) firstChildView);
		add((JPanel) secondChildView);
	}

	@Override
	public void showView() {
		this.pack();
		this.setVisible(true);
	}

}
