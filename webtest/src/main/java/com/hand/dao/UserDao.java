package com.hand.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.entity.Customer;



public interface UserDao {
	
	public ResultSet get(Connection conn,Customer user) throws SQLException;

}
