package org.legacycode.mvp.model;

import org.springframework.stereotype.Component;

@Component
public class MainFrameModelImpl implements MainFrameModel {

	String title;

	@Override
	public String getTitle() {
		// data from database or elsewhere
		return title;
	}

	@Override
	public void setTitle(String message) {
		title = message;
	}

}
