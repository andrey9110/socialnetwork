<%--<%@ page import="ru.javawebinar.topjava.util.TimeUtil" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Post list</title>
</head>
<body>
<section>
    <h2><a href="index.html">Home</a></h2>
    <h3>Post list</h3>
    <a href="posts?action=create">Add Post</a>

    <hr>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>Date</th>
            <th>Description</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${postList}" var="post">
            <jsp:useBean id="post" scope="page" type="titarenko.javaproject.socialnetwork.model.Post"/>
            <tr>
                <td>
                        ${post.dateTime.toLocalDate()} ${post.dateTime.toLocalTime()}
                        <%--<%=TimeUtil.toString(meal.getDateTime())%>--%>
                </td>
                <td>${post.description}</td>
                <td><a href="posts?action=update&id=${post.id}">Update</a></td>
                <td><a href="posts?action=delete&id=${post.id}">Delete</a></td>
                <%--<td>${meal.calories}</td>--%>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>
