package org.legacycode.mvp.event;

public interface AppEvent {

	Event getAppEvent();

	String getMessage();

	void setMessage(String message);

}