package org.legacycode.mvp.view;

import java.awt.event.ActionListener;

public interface FirstChildView {

	void addFirstChildButtonListener(ActionListener l);

	void refresh();

	void setFirstChildButtonText(String buttonText);

	void setFirstChildLabelText(String labelText);

	void setParentView(MainFrameView v);

	void showFirstChildInfoDialog(String message);

}