package org.legacycode.mvp.view.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.legacycode.mvp.entity.User;

public class UserTableModelImpl extends AbstractTableModel implements UserTableModel {
	private static final long serialVersionUID = 1L;
	private transient List<User> users;

	public UserTableModelImpl(List<User> users) {
		this.users = users;
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public int getRowCount() {
		return users.size();
	}

	@Override
	public User getUser(int rowIndex) {
		return users.get(rowIndex);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		User user = users.get(rowIndex);

		Object value;
		switch (columnIndex) {
		case 0:
			value = user.getLastName();
			break;
		case 1:
			value = user.getFirstName();
			break;
		case 2:
			value = user.getEmail();
			break;
		default:
			value = null;
			break;
		}

		return value;
	}

}
