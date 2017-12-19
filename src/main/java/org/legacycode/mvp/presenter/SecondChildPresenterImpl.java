package org.legacycode.mvp.presenter;

import javax.annotation.PostConstruct;

import org.legacycode.mvp.event.AppEvent;
import org.legacycode.mvp.event.AppEventImpl;
import org.legacycode.mvp.event.Event;
import org.legacycode.mvp.model.SecondChildModel;
import org.legacycode.mvp.view.SecondChildView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondChildPresenterImpl implements SecondChildPresenter {

	private MainFramePresenter mainFramePresenter;
	private SecondChildModel secondChildModel;
	private SecondChildView secondChildView;

	@Autowired
	public SecondChildPresenterImpl(SecondChildModel secondChildModel, SecondChildView secondChildView) {
		this.secondChildModel = secondChildModel;
		this.secondChildView = secondChildView;
	}

	@PostConstruct
	private void init() {
		secondChildView.setSecondChildLabelText(secondChildModel.getLabelText());
		secondChildView.setSecondChildButtonText(secondChildModel.getButtonText());
		
		// set button event in view
		secondChildView.addSecondChildButtonListener(actionEvent -> {
			AppEvent appEvent = new AppEventImpl(Event.CHANGE_TITLE);
			appEvent.setMessage(secondChildModel.getNewTitle());
			mainFramePresenter.handleAppEvent(appEvent);
		});
	}

	@Override
	public void setParentPresenter(MainFramePresenter p) {
		this.mainFramePresenter = p;
	}
}
