<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request">
</jsp:useBean>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor="cyan">
					
		<%@ include file="header.html" %>
		
		<h3>Dear <jsp:getProperty property="username" name="ob"/> Welcome to phoenix online shoppe</h3>
			<%
				session.setMaxInactiveInterval(10);
				String username = request.getParameter("username");
				session.setAttribute("user", username);
				String encodedProductUrl = response.encodeRedirectURL("ProductServlet");
			%>
			<p>To view products<a href="<%=encodedProductUrl%>"> Click Here</a>
		
			<%@ include file="footer.html" %>
		
</body>
</html>