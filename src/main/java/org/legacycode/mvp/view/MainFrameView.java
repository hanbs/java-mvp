package org.legacycode.mvp.view;

import org.legacycode.mvp.presenter.MainFramePresenter;

public interface MainFrameView {

	void setFirstChildView(FirstChildView firstChildView);

	void setMainFramePresenter(MainFramePresenter mainFramePresenter);

	void setSecondChildView(SecondChildView secondChildView);

	void setTitle(String title);

	void showView();

}