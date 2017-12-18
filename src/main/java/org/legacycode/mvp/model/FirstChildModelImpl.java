package org.legacycode.mvp.model;

import org.springframework.stereotype.Component;

@Component
public class FirstChildModelImpl implements FirstChildModel {

	@Override
	public String getButtonText() {
		// data from database or elsewhere
		return "FirstButtonText";
	}

	@Override
	public String getDialogMessageText() {
		// data from database or elsewhere
		return "FirstChildDialog";
	}

	@Override
	public String getLabelText() {
		// data from database or elsewhere
		return "FirstChildLabelText";
	}

}
