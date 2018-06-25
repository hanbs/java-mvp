package org.legacycode.mvp.view;

import java.awt.event.ActionListener;

import org.legacycode.mvp.presenter.FirstChildPresenter;


public interface FirstChildView {

	void addFirstChildButtonListener(ActionListener l);

	void refresh();

	void setFirstChildButtonText(String buttonText);

	void setFirstChildLabelText(String labelText);

	void setFirstChildPresenter(FirstChildPresenter firstChildPresenter);

	void setParentView(MainFrameView v);

	void showFirstChildInfoDialog(String message);

}