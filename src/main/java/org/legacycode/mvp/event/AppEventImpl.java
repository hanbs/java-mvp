package org.legacycode.mvp.event;

public class AppEventImpl implements AppEvent {

	private Event appEvent;
	private String message;

	public AppEventImpl(Event appEvent) {
		this.appEvent = appEvent;
	}

	/** {@inheritDoc} */
	@Override
	public Event getAppEvent() {
		return appEvent;
	}

	/** {@inheritDoc} */
	@Override
	public String getMessage() {
		return message;
	}

	/** {@inheritDoc} */
	@Override
	public void setMessage(String message) {
		this.message = message;
	}

}
