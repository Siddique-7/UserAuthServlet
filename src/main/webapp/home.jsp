
 <%--Manage the session from login to logout --%>
 
<%@ page import="javax.servlet.http.*" %>
<%
    HttpSession sessions = request.getSession(false);
    if (sessions == null || sessions.getAttribute("user") == null) {
        response.sendRedirect("login.html");
    }
%>
<h2>Welcome, <%= sessions.getAttribute("user") %>!</h2>
<a href="logout">Logout</a>
