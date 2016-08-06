package com.hand.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.dao.UserDao;
import com.hand.dao.impl.UserDaoImpl;
import com.hand.entity.Customer;
import com.hand.util.ConnectionFactory;

public class CheckUserService {
	
	private UserDao userDao = new UserDaoImpl();
	
	public boolean check(Customer user) {
		Connection conn = null;
		
		try {
			conn = ConnectionFactory.getInstance().makeConnection();/**通过连接工厂类获取数据库连接*/
			conn.setAutoCommit(false);/**关闭自动提交*/
			
			ResultSet resultSet = userDao.get(conn, user);/*查询数据库是否有对应信息*/
			
			/**查询到就返回true否则false*/
			while (resultSet.next()) {
				return true;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (Exception e2) {
				e.printStackTrace();
			}
		}finally {
			try {
				conn.close();
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		
		return false;
	}
//	public static void main(String[] args) {
//	CheckUserService cus=new CheckUserService();
//	User user=new User();
//	user.setName("Tom");
//	user.setPassword("123456");
//	
//	System.out.println(cus.check(user));
//}
}
