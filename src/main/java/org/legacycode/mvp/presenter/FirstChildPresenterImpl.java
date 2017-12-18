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

	@Override
	public FirstChildView createView() {
		// repaint the view
		firstChildView.refresh();
		return firstChildView;
	}

	@PostConstruct
	private void init() {
		// set labeltext in view
		String labelText = firstChildModel.getLabelText();
		firstChildView.setFirstChildLabelText(labelText);

		// set buttontext in view
		String buttonText = firstChildModel.getButtonText();
		firstChildView.setFirstChildButtonText(buttonText);
		firstChildView.addFirstChildButtonListener(e -> showInfoDialog());
	}

	@Override
	public void setParentPresenter(MainFramePresenter mainFramePresenter) {
		this.mainFramePresenter = mainFramePresenter;
	}
	
	private void showInfoDialog() {
		String message = firstChildModel.getDialogMessageText();
		firstChildView.showFirstChildInfoDialog(mainFramePresenter, message);
	}

}
