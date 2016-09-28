<%-- 
    Document   : main
    Created on : Sep 23, 2016, 6:53:16 PM
    Author     : mega
--%>

<%@page import="testjdbc.TestConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        <%= "Привет"%>
       <h3> <%= request.getParameter("username")%> </h3>       
       ${param ["password"]}
       
       <%
       TestConnection tc = new TestConnection();
       tc.check();
       
       %>
    </body>
</html>
