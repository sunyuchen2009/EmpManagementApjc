<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SUN
  Date: 2022/6/21
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
    <head>
        <meta charset="utf-8">
        <title>成績管理</title>
        <h1 align="center">成績管理</h1>
        <link href="/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div1 class="div-parent">
            <form method="post" action="/searchGrade">
                <tr>
                    名前:<input type="text" name="name"><td></td><td></td>
                    科目:<select name="courseName">
                        <c:forEach items="${courseList}" var="course" varStatus="status">
                            <option label="${course.getName()}" value="${course.getName()}"/>
                        </c:forEach>
                    </select>
                    <button>検索</button></tr><br>
                </tr>

            </form>
        </div1>

        <div2 class="div-parent">
            <table border="1" cellspacing="0" style="width: 500px;height: 100px" >

                <tr>
                    <th>名前</th>
                    <th>科目</th>
                    <th>成績</th>
                    <th>操作</th>
                </tr>

                <!--全部列表-->
                <c:forEach items="${gradeList}" var="grade" varStatus="status">
                    <tr id="query_all">
                        <td>${grade.name}</td>
                        <td>${grade.courseName}</td>
                        <td>${grade.grade}</td>
                        <td>
                            <button onclick="changeMember('${grade.id}', '${grade.name}', '${grade.courseName}','${grade.grade}')">変更</button>
                        </td>
                    </tr>
                </c:forEach>

            </table>
        </div2>
        <div3>
            <form align="center" method="post" action="/updateGrade">
                <input id="new_id" type="hidden" name="id" value="ID">
                名前<input id="new_name" type="text" name="name">
                科目<select id="new_courseName" name="courseName">
                    <c:forEach items="${courseList}" var="course" varStatus="status">
                        <option label="${course.getName()}" value="${course.getName()}"/>
                    </c:forEach>
                </select>
                成績<input id="new_grade" type="text" name="grade"><br>
                <br>
                <br>
                <br>
                <br>
                <tr>
                    <td></td><td></td>
                    <td>
                        <a href="/index">
                            <input type="button" class="btn-primary" value="メニュー画面に戻る"/>
                        </a>
                    </td><td></td><td></td><td></td>
                    <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></td>
                    <td>
                        <input class="btn-primary" type="submit" value="更新する"/>
                    </td>
                </tr>
            </form>
        </div3>

        <script>
            function changeMember(id, name, courseName, grade){
                document.getElementById("new_id").value = id;
                document.getElementById("new_name").value = name;
                document.getElementById("new_courseName").value = courseName;
                document.getElementById("new_grade").value = grade;
            }
        </script>

        <style>
            .div-parent {
                display: flex;
                /*项目位于容器的中心*/
                justify-content: center;
                /*元素位于容器的中心。弹性盒子元素在该行的侧轴（纵轴）上居中放置。（如果该行的尺寸小于弹性盒子元素的尺寸，则会向两个方向溢出相同的长度）。*/
                align-items: center;
            }
        </style>
    </body>
</html>