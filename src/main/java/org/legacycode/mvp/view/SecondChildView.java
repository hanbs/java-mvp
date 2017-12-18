package org.legacycode.mvp.view;

import java.awt.event.ActionListener;

public interface SecondChildView {

	void addSecondChildButtonListener(ActionListener listener);

	void refresh();

	void setSecondChildButtonText(String buttonText);

	void setSecondChildLabelText(String labelText);

}