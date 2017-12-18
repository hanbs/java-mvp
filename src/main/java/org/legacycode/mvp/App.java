package org.legacycode.mvp;

import org.legacycode.mvp.presenter.MainFramePresenter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This is the main entry point. This project uses annotation based
 * configuration to inject the dependencies. The configuration and component
 * scan is configured in the {@link AppConfig } class.
 * 
 * @author legacycode
 *
 */
public class App {
	public static void main(String[] args) {
		// Init Spring
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MainFramePresenter mainFramePresenter = context.getBean(MainFramePresenter.class);
		mainFramePresenter.showMainFrameView();
	}

}
