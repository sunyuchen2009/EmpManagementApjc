<%--
  Created by IntelliJ IDEA.
  User: SUN
  Date: 2022/6/21
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>新規成績画面</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1 align="center">新規成績画面</h1>
<form align="center" method="post" action="/newgrade">
    名前<input type="text" name="name">
    科目<select name="courseName">
        <c:forEach items="${courseList}" var="course" varStatus="status">
            <option label="${course.getName()}" value="${course.getName()}"/>
        </c:forEach>
</select>
    成績<input type="text" name="grade"><br>
    <br>
    <br>
    <br>
    <br>
    <input class="btn-primary" type="submit" value="新規追加"/>
    <a href="/index">
        <input type="button" class="btn-primary" value="メニュー画面に戻る"/>
    </a>
</form>
</body>
</html>
