package org.legacycode.mvp.presenter;

import org.legacycode.mvp.event.AppEvent;
import org.legacycode.mvp.model.MainFrameModel;
import org.legacycode.mvp.view.MainFrameView;

public interface MainFramePresenter {

	void handleAppEvent(AppEvent e);

	void setFirstChildPresenter(FirstChildPresenter firstChildPresenter);

	void setMainFrameModel(MainFrameModel mainFrameModel);

	void setMainFrameView(MainFrameView mainFrameView);

	void setSecondChildPresenter(SecondChildPresenter secondChildPresenter);

	void showMainFrameView();

}