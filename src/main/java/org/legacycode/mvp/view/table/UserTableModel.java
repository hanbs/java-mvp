package org.legacycode.mvp.view.table;

import javax.swing.table.TableModel;

import org.legacycode.mvp.entity.User;

public interface UserTableModel extends TableModel {

	User getUser(int rowIndex);

}