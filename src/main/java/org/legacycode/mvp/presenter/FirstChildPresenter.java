package org.legacycode.mvp.presenter;

import org.legacycode.mvp.view.FirstChildView;

public interface FirstChildPresenter {

	FirstChildView createView();

	void setParentPresenter(MainFramePresenter mainFramePresenter);

}