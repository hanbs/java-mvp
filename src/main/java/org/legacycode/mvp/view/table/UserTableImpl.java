package org.legacycode.mvp.view.table;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import org.legacycode.mvp.entity.User;

public class UserTableImpl extends JTable implements UserTable {
	private static final long serialVersionUID = 1L;

	@Override
	public User getUser(int selectedRow) {
		return ((UserTableModel) getModel()).getUser(selectedRow);
	}

	@Override
	public void setModel(UserTableModel userTableModel) {
		super.setModel((TableModel) userTableModel);
	}

}
