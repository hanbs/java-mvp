package org.legacycode.mvp.view;

import java.awt.event.ActionListener;

import org.legacycode.mvp.presenter.MainFramePresenter;

public interface FirstChildView {

	void addFirstChildButtonListener(ActionListener l);

	void refresh();

	void setFirstChildButtonText(String buttonText);

	void setFirstChildLabelText(String labelText);

	void showFirstChildInfoDialog(MainFramePresenter p, String message);

}