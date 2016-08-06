<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>首页</title>
</head>
<body>

首页
<br/>
<br/>

<%
	String flag = "";
	Object obj = session.getAttribute("flag");
	if(obj != null){
		flag = obj.toString();
	}	
%>

<a href="<%= request.getContextPath()%>/login.jsp">登录</a><br/>
<a href="<%= request.getContextPath()%>/showFilm.jsp">所有电影</a>

</body>
</html>