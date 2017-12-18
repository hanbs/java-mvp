package org.legacycode.mvp.view;

public interface MainFrameView {

	void addFirstChildView(FirstChildView view);

	void addSecondChildView(SecondChildView view);

	void setTitle(String title);

	void showView();

}