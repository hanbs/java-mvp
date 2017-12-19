package org.legacycode.mvp.view;

public interface MainFrameView {

	void addFirstChildView(FirstChildView v);

	void addSecondChildView(SecondChildView v);

	void setTitle(String title);

	void showView();

}