package com.hand.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("======进入doPost方法======");
		String userName = request.getParameter("uname");
		
		System.out.println("用户名 ==> " + userName);
		
//		String forward = null;
//		
//		if(userName.equals("极客学院") && password.equals("123456")){
//			//请求转发
//			forward = "/success.jsp";
//			//forward ="http://www.jikexueyuan.com";
//			RequestDispatcher rd = request.getRequestDispatcher(forward);
//			rd.forward(request, response);
//			
//			//请求重定向
//			//response.sendRedirect(forward);
//		}else{
//			//请求转发
//			request.setAttribute("msg", "用户名或者密码输入错误");
//			forward = "/error.jsp";
//			RequestDispatcher rd = request.getRequestDispatcher(forward);
//			rd.forward(request, response);
//			//请求重定向
//			//resp.sendRedirect(req.getContextPath() + "/error.jsp");
//		}
	}
		
	

}
