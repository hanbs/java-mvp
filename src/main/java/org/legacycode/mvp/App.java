package org.legacycode.mvp;

import org.legacycode.mvp.presenter.MainFramePresenter;
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
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(AppConfig.class).getBean(MainFramePresenter.class).showMainFrameView();
	}

}
