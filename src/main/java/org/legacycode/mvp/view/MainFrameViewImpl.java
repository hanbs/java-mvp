package org.legacycode.mvp.view;

import java.awt.GridLayout;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.legacycode.mvp.presenter.MainFramePresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainFrameViewImpl extends JFrame implements MainFrameView {

	private static final long serialVersionUID = 1;
	private transient FirstChildView firstChildView;
	@SuppressWarnings("unused")
	/** In this class the presenter is not used. This is only for example. **/
	private transient MainFramePresenter mainFramePresenter;

	private transient SecondChildView secondChildView; 
	
	@PostConstruct
	public void init() {
		setLayout(new GridLayout(0, 1, 10, 10));
		setLocationRelativeTo(null);
		add((JPanel) firstChildView);
		add((JPanel) secondChildView);
	}

	@Autowired
	@Override
	public void setFirstChildView(FirstChildView firstChildView) {
		this.firstChildView = firstChildView;
	}

	@Autowired
	@Override
	public void setMainFramePresenter(MainFramePresenter mainFramePresenter) {
		this.mainFramePresenter = mainFramePresenter;
	}

	@Autowired
	@Override
	public void setSecondChildView(SecondChildView secondChildView) {
		this.secondChildView = secondChildView;
	}

	@Override
	public void showView() {
		this.pack();
		this.setVisible(true);
	}

}
