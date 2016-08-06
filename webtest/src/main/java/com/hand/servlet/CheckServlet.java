package com.hand.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.entity.Customer;
import com.hand.service.CheckUserService;

public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CheckUserService cku = new CheckUserService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**获取用户名和密码的提交信息*/
		String uname = request.getParameter("uname");
		
		RequestDispatcher rd = null;
		String forward = null;
		
		/**进行非空判断*/
		if (uname == null) {
			request.setAttribute("msg", "用户名为空！");
			rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}else{
			/**用户名和密码校验*/
			Customer user = new Customer();
			user.setFirst_name(uname);
			
			boolean bool = cku.check(user);
			
			if (bool) {
				forward = "/success.jsp";
			}else {
				request.setAttribute("msg", "用户名输入错误，请重新输入！");
				forward = "/error.jsp";
			}
			
			/**完成请求的重定向*/
			rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
	}

}
