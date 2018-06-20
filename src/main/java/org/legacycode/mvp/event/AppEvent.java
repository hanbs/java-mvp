package org.legacycode.mvp.event;

/**
 * This AppEvent class is used to handle application functional. It uses the
 * {@link Event} enumeration to throw application functional.
 * 
 * @author legacycode
 *
 */
public interface AppEvent {

	/**
	 * This method returns the event that should be handled by an eventhandler.
	 * 
	 * @return an @{link Event} enumaration
	 */
	Event getAppEvent();

	/**
	 * This method returns an optional message that can be used by an
	 * eventhandler.
	 * 
	 * @return a additional message for the eventhandler.
	 */
	String getMessage();

	/**
	 * This method sets an optional message in the action performed event. This
	 * message can be read by an eventhandler.
	 * 
	 * @param message
	 */
	void setMessage(String message);

}
