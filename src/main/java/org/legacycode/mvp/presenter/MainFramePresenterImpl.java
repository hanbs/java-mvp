package org.legacycode.mvp.presenter;

import javax.annotation.PostConstruct;

import org.legacycode.mvp.event.AppEvent;
import org.legacycode.mvp.event.Event;
import org.legacycode.mvp.model.MainFrameModel;
import org.legacycode.mvp.view.MainFrameView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainFramePresenterImpl implements MainFramePresenter {

	private FirstChildPresenter firstChildPresenter;
	private MainFrameModel mainFrameModel;
	private MainFrameView mainFrameView;
	private SecondChildPresenter secondChildPresenter;

	@Autowired
	public MainFramePresenterImpl(MainFrameModel mainFrameModel, MainFrameView mainFrameView,
			FirstChildPresenter firstChildPresenter, SecondChildPresenter secondChildPresenter) {

		this.mainFrameModel = mainFrameModel;
		this.mainFrameView = mainFrameView;
		this.firstChildPresenter = firstChildPresenter;
		this.secondChildPresenter = secondChildPresenter;
	}

	@Override
	public MainFrameView getMainFrameView() {
		return mainFrameView;
	}

	@Override
	public void handleAppEvent(AppEvent appEvent) {
		if (appEvent.getAppEvent() == Event.CHANGE_TITLE) {
			mainFrameModel.setTitle(appEvent.getMessage());
			mainFrameView.setTitle(mainFrameModel.getTitle());
		}
	}

	@PostConstruct
	private void init() {
		// set frame title
		mainFrameModel.setTitle("MainFrameTitle");
		mainFrameView.setTitle(mainFrameModel.getTitle());

		// set relationship to firstChild presenter and view
		firstChildPresenter.setParentPresenter(this);
		mainFrameView.addFirstChildView(firstChildPresenter.createView());

		// set relationship to secondChild presenter and view
		secondChildPresenter.setParentPresenter(this);
		mainFrameView.addSecondChildView(secondChildPresenter.createView());
	}

	@Override
	public void showMainFrameView() {
		mainFrameView.showView();
	}

}
