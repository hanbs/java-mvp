package org.legacycode.mvp.presenter;

import javax.annotation.PostConstruct;

import org.legacycode.mvp.model.FirstChildModel;
import org.legacycode.mvp.view.FirstChildView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstChildPresenterImpl implements FirstChildPresenter {

	private FirstChildModel firstChildModel;
	private FirstChildView firstChildView;
	@SuppressWarnings("unused")
	/** In this class the parent is not used. This is only for example. **/
	private MainFramePresenter parentPresenter;

	@PostConstruct
	private void init() {
		firstChildView.setFirstChildLabelText(firstChildModel.getLabelText());
		firstChildView.setFirstChildButtonText(firstChildModel.getButtonText());
		firstChildView.addFirstChildButtonListener(e -> showInfoDialog());
	}

	@Autowired
	@Override
	public void setFirstChildModel(FirstChildModel firstChildModel) {
		this.firstChildModel = firstChildModel;
	}

	@Autowired
	@Override
	public void setFirstChildView(FirstChildView firstChildView) {
		this.firstChildView = firstChildView;
	}

	@Autowired
	@Override
	public void setParentPresenter(MainFramePresenter p) {
		this.parentPresenter = p;
	}

	private void showInfoDialog() {
		firstChildView.showFirstChildInfoDialog(firstChildModel.getDialogMessageText());
	}

}
