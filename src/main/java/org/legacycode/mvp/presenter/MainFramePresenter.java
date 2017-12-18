package org.legacycode.mvp.presenter;

import org.legacycode.mvp.event.AppEvent;
import org.legacycode.mvp.view.MainFrameView;

public interface MainFramePresenter {

	MainFrameView getMainFrameView();

	void handleAppEvent(AppEvent appEvent);

	void showMainFrameView();

}