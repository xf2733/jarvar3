package com.hand.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.dao.UserDao;
import com.hand.entity.Customer;


public class UserDaoImpl implements UserDao {

	
    public ResultSet get(Connection conn, Customer user) throws SQLException {
	PreparedStatement ps = conn.prepareStatement("SELECT * FROM customer WHERE first_name = ?");
	ps.setString(1, user.getFirst_name());
	
	return ps.executeQuery();
	}
}