<%-- 
    Document   : main
    Created on : Sep 23, 2016, 6:53:16 PM
    Author     : mega
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="mega.webapp.beans.Author"%>
<%@page import="mega.webapp.beans.AuthorList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Онлайн библиотека</title>
        <link href="../css/style_main.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">

            <div class="header">
                <div class="logo"><img src="../images/library.png" alt="Место для логотипа" name="logo"/></div>
                <div class="descr"><h3>Онлайн библиотека</h3></div>
                <form class="search_form" name="search_form" method="POST">
                    <img src="../images/search.jpg"/>
                    <input type="text" name="searchString" value="" size="100" />
                    <input class="search_button" type="submit" value="Поиск" name="search_button" />
                    <select name="search_option">
                        <option>Название</option>
                        <option>Автор</option>
                    </select>
                </form>
            </div>

            <div class="sidebar1">
                <h4>Список авторов:</h4>
                <ul class="nav">
                    <jsp:useBean id="authorList" class="mega.webapp.beans.AuthorList" scope="application"/>
                    <c:forEach var="author" items="${authorList.getAuthorList()}">

                        <li><a href="#">${author.name}</a></li>

                    </c:forEach>
                </ul>
                <p>&nbsp;</p>
            </div>

            <div class="content">
                <h1>&nbsp;</h1>
                <p>&nbsp;</p>
            </div>            

            <!--end outer container-->  
        </div>


    </body>
</html>
