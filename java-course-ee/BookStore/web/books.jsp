<%@ page import="ua.test_servlets.Book" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books</title>
</head>
<body>

<%--Здесь мы должны получить доступ к нашей коллекции книг и красиво ее отобразить.--%>
<%--вывод списком всех книг в цикле - каждый пункт--%>

<%--Вариант со скриптлетом--%>
<%--
<% List<Book> bookList = (List<Book>) request.getAttribute("bookList"); %>
--%>

<%--Вариант с EL(expression language)--%>
<%--пробежать по bookList и вытащить в переменную book--%>
<p>${bookList[0]}</p>
<p>${bookList[1]}</p>
<p>${bookList[2]}</p>

<%--неработает!!!!!!!!!--%>
<%--<ul>
    <c:forEach var="bоок" items="${bookList}">
        <li>Id: ${book.id}, Name: ${book.name}</li>
    </c:forEach>
</ul>--%>


</body>
</html>
