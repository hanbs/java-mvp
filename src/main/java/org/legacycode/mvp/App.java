package org.legacycode.mvp;

import org.legacycode.mvp.presenter.MainFramePresenter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		// Init Spring
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MainFramePresenter mainFramePresenter = context.getBean(MainFramePresenter.class);
		mainFramePresenter.showMainFrameView();
	}
	
}
