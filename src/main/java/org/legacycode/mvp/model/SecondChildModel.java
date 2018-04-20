package org.legacycode.mvp.model;

import java.util.List;

import org.legacycode.mvp.entity.User;

public interface SecondChildModel {

	List<User> getAllUsers();

	String getButtonText();

	String getLabelText();

	String getNewTitle();

}
