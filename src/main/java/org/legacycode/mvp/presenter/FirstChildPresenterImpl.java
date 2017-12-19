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
	private MainFramePresenter mainFramePresenter;

	@Autowired
	public FirstChildPresenterImpl(FirstChildModel firstChildModel, FirstChildView firstChildView) {
		this.firstChildView = firstChildView;
		this.firstChildModel = firstChildModel;
	}

	@PostConstruct
	private void init() {
		firstChildView.setFirstChildLabelText(firstChildModel.getLabelText());
		firstChildView.setFirstChildButtonText(firstChildModel.getButtonText());
		firstChildView.addFirstChildButtonListener(e -> showInfoDialog());
	}

	@Override
	public void setParentPresenter(MainFramePresenter p) {
		this.mainFramePresenter = p;
	}
	
	private void showInfoDialog() {
		firstChildView.showFirstChildInfoDialog(firstChildModel.getDialogMessageText());
	}

}
