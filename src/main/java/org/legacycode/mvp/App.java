package org.legacycode.mvp;

import org.legacycode.mvp.presenter.MainFramePresenter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

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
		try (final AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				AppConfig.class)) {
			applicationContext.getBean(MainFramePresenter.class).showMainFrameView();
		}
	}

}
