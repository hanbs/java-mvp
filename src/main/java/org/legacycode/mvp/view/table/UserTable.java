package org.legacycode.mvp.view.table;

import java.awt.event.MouseListener;

import org.legacycode.mvp.entity.User;

public interface UserTable {

	void addMouseListener(MouseListener mouseAdapter);

	int getSelectedRow();

	User getUser(int selectedRow);

	void setModel(UserTableModel userTableModel);

}