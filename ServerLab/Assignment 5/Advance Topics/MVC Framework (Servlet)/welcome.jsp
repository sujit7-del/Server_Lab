<%@ page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession sessionObj = request.getSession(false);
    String user = (sessionObj != null) ? (String) sessionObj.getAttribute("user") : null;
    if (user == null) response.sendRedirect("login.jsp");
%>
<h2>Welcome, <%= user %>!</h2>
<a href="logout">Logout</a>
