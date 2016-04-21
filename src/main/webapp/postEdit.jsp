<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Post</title>
    <style>
        dl {
            background: none repeat scroll 0 0 #FAFAFA;
            margin: 8px 0;
            padding: 0;
        }

        dt {
            display: inline-block;
            width: 170px;
        }

        dd {
            display: inline-block;
            margin-left: 8px;
            vertical-align: top;
        }
    </style>
</head>
<body>
<section>
    <h2><a href="">Home</a></h2>
    <h3>Edit post</h3>
    <hr>
    <jsp:useBean id="post" type="titarenko.javaproject.socialnetwork.model.Post" scope="request"/>
    <form method="post" action="posts">
        <input type="hidden" name="id" value="${post.id}">
        <dl>
            <dt>DateTime:</dt>
            <dd><input type="datetime-local" value="${post.dateTime}" name="dateTime"></dd>
        </dl>
        <dl>
            <dt>Description:</dt>
            <dd><input type="text" value="${post.description}" size=40 name="description"></dd>
        </dl>
        <button type="submit">Save</button>
        <button onclick="window.history.back()">Cancel</button>
    </form>
</section>
</body>
</html>
