package org.legacycode.mvp.view;

public interface MainFrameView {

	void setFirstChildView(FirstChildView firstChildView);

	void setSecondChildView(SecondChildView secondChildView);

	void setTitle(String title);

	void showView();

}
