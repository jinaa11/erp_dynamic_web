package com.erp.common.database;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBManager {
		
	Connection getConnection() throws SQLException;
	Connection getConnectionForTransaction() throws SQLException; 
}
