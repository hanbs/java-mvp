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

	@Override
	public void handleAppEvent(AppEvent e) {
		if (e.getAppEvent() == Event.CHANGE_TITLE) {
			mainFrameModel.setTitle(e.getMessage());
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

		// set relationship to secondChild presenter and view
		secondChildPresenter.setParentPresenter(this);
	}

	@Autowired
	@Override
	public void setFirstChildPresenter(FirstChildPresenter firstChildPresenter) {
		this.firstChildPresenter = firstChildPresenter;
	}

	@Autowired
	@Override
	public void setMainFrameModel(MainFrameModel mainFrameModel) {
		this.mainFrameModel = mainFrameModel;
	}

	@Autowired
	@Override
	public void setMainFrameView(MainFrameView mainFrameView) {
		this.mainFrameView = mainFrameView;
	}

	@Autowired
	@Override
	public void setSecondChildPresenter(SecondChildPresenter secondChildPresenter) {
		this.secondChildPresenter = secondChildPresenter;
	}

	@Override
	public void showMainFrameView() {
		mainFrameView.showView();
	}

}
