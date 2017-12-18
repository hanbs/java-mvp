package org.legacycode.mvp.event;

public class AppEventImpl implements AppEvent {
	private Event appEvent;
	private String message;

	public AppEventImpl(Event appEvent) {
		this.appEvent = appEvent;
	}

	@Override
	public Event getAppEvent() {
		return appEvent;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

}
