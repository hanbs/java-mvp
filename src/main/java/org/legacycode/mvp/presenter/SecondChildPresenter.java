package org.legacycode.mvp.presenter;

import org.legacycode.mvp.view.SecondChildView;

public interface SecondChildPresenter {

	SecondChildView createView();

	void setParentPresenter(MainFramePresenter p);

}
