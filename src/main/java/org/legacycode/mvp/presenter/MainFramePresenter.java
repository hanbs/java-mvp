package org.legacycode.mvp.presenter;

import org.legacycode.mvp.event.AppEvent;

public interface MainFramePresenter {

	void handleAppEvent(AppEvent e);

	void showMainFrameView();

}