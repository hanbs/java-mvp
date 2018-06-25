package org.legacycode.mvp.presenter;

import org.legacycode.mvp.model.SecondChildModel;
import org.legacycode.mvp.view.SecondChildView;

public interface SecondChildPresenter {

	void setParentPresenter(MainFramePresenter p);

	void setSecondChildModel(SecondChildModel secondChildModel);

	void setSecondChildView(SecondChildView secondChildView);

	void showSecondChildInfoDialog();

}
