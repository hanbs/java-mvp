package org.legacycode.mvp.model;

import org.springframework.stereotype.Component;

@Component
public class SecondChildModelImpl implements SecondChildModel {

	@Override
	public String getButtonText() {
		// data from database or elsewhere
		return "SecondButtonText";
	}

	@Override
	public String getLabelText() {
		// data from database or elsewhere
		return "SecondChildLabelText";
	}

	@Override
	public String getNewTitle() {
		// data from database or elsewhere
		return "New Title";
	}

}
