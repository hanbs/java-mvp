package org.legacycode.mvp.view;

import java.awt.event.ActionListener;
import java.util.List;

import org.legacycode.mvp.entity.User;

public interface SecondChildView {

	void addSecondChildButtonListener(ActionListener l);

	void refresh();

	void setParentView(MainFrameView v);

	void setSecondChildButtonText(String buttonText);

	void setSecondChildLabelText(String labelText);

	void setSecondChildTableData(List<User> users);

}
