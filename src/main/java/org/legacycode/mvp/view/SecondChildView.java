package org.legacycode.mvp.view;

import java.awt.event.ActionListener;

import org.legacycode.mvp.view.table.UserTable;

public interface SecondChildView {

	void addSecondChildButtonListener(ActionListener l);

	UserTable getSecondChildUserTable();

	void refresh();

	void setParentView(MainFrameView v);

	void setSecondChildButtonText(String buttonText);

	void setSecondChildLabelText(String labelText);

	void showSecondChildInfoDialog(String message);

}
