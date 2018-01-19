package org.legacycode.mvp.presenter;

import org.legacycode.mvp.model.FirstChildModel;
import org.legacycode.mvp.view.FirstChildView;

public interface FirstChildPresenter {

	void setFirstChildModel(FirstChildModel firstChildModel);

	void setFirstChildView(FirstChildView firstChildView);

	void setParentPresenter(MainFramePresenter p);

}