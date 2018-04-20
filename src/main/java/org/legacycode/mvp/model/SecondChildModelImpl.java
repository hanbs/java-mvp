package org.legacycode.mvp.model;

import java.util.ArrayList;
import java.util.List;

import org.legacycode.mvp.entity.User;
import org.springframework.stereotype.Component;

@Component
public class SecondChildModelImpl implements SecondChildModel {

	@Override
	public List<User> getAllUsers() {
		// data from database or elsewhere
		List<User> users = new ArrayList<>();
		users.add(new User("Perry", "Byerly", "PerryLByerly@dayrep.com"));
		users.add(new User("Ricardo", "Stiles", "RicardoLStiles@jourrapide.com"));
		users.add(new User("Albert", "Yates", "AlbertDYates@rhyta.com"));
		return users;
	}

	@Override
	public String getButtonText() {
		// data from database or elsewhere
		return "SecondButtonText";
	}

	@Override
	public String getLabelText() {
		// data from database or elsewhere
		return "SecondChildLabelText";
	}

	@Override
	public String getNewTitle() {
		// data from database or elsewhere
		return "New Title";
	}

}
