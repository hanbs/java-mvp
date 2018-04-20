package org.legacycode.mvp.presenter;

import java.util.List;

import javax.annotation.PostConstruct;

import org.legacycode.mvp.entity.User;
import org.legacycode.mvp.event.AppEvent;
import org.legacycode.mvp.event.AppEventImpl;
import org.legacycode.mvp.event.Event;
import org.legacycode.mvp.model.SecondChildModel;
import org.legacycode.mvp.view.SecondChildView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondChildPresenterImpl implements SecondChildPresenter {

	private MainFramePresenter parentPresenter;
	private SecondChildModel secondChildModel;
	private SecondChildView secondChildView;

	@PostConstruct
	private void init() {
		secondChildView.setSecondChildLabelText(secondChildModel.getLabelText());
		secondChildView.setSecondChildButtonText(secondChildModel.getButtonText());
		
		// set button event in view
		secondChildView.addSecondChildButtonListener(actionEvent -> {
			AppEvent appEvent = new AppEventImpl(Event.CHANGE_TITLE);
			appEvent.setMessage(secondChildModel.getNewTitle());
			parentPresenter.handleAppEvent(appEvent);
		});
		
		// set tabledata in view
		List<User> users = secondChildModel.getAllUsers();
		secondChildView.setSecondChildTableData(users);
	}

	@Override
	public void setParentPresenter(MainFramePresenter p) {
		this.parentPresenter = p;
	}

	@Autowired
	@Override
	public void setSecondChildModel(SecondChildModel secondChildModel) {
		this.secondChildModel = secondChildModel;
	}

	@Autowired
	@Override
	public void setSecondChildView(SecondChildView secondChildView) {
		this.secondChildView = secondChildView;
	}

}
