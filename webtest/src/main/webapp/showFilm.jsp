<%@ page language="java" import="java.util.*,java.sql.*,com.hand.dao.*,com.hand.util.ConnectionFactory"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>显示film页面</title>
<style type="text/css">
.content {
	width: 600px;
	margin: 0px auto;
}

h2 {
	text-align: center;
	padding: 20px 0px;
	border-bottom: 2px solid #ccc;
}
</style>
</head>

<body>
	<div class="content">
		<h2>电影名单</h2>
		<%
			Connection conn = null;
		    conn = ConnectionFactory.getInstance().makeConnection();
			Statement statement = conn.createStatement();
			String sql = "SELECT film_id,title,description,language.name FROM film,language where film.language_id=language.language_id";
			ResultSet rs = statement.executeQuery(sql);
		%>

		<table align="center" border="1px">
			<tr>
				<th>
					<%
						out.print("film_id");
					%>
				</th>
				<th>
					<%
						out.print("title");
					%>
				</th>
				<th>
					<%
						out.print("description");
					%>
				</th>
				<th>
					<%
						out.print("language");
					%>
				</th>
			</tr>
			<%
				while (rs.next()) {
			%>
			<tr>
				<td>
					<%
						out.print(rs.getInt(1));
					%>
				</td>
				<td>
					<%
						out.print(rs.getString(2));
					%>
				</td>
				<td>
					<%
						out.print(rs.getString(3));
					%>
				</td>
				<td>
					<%
						out.print(rs.getString(4));
					%>
				</td>
			</tr>
			<%
				}
			%>
		</table>
	</div>

</body>
</html>
