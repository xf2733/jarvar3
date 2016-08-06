package com.hand.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.entity.Film;

public interface TitleDao {
	
	public ResultSet get(Connection conn,Film user) throws SQLException;

}
