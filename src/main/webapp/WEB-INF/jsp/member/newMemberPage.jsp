<%--
  Created by IntelliJ IDEA.
  User: SUN
  Date: 2022/6/21
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
    <head>
        <meta charset="UTF-8">
        <title>新規メンバー</title>
        <link href="/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <h1 align="center">新規メンバー画面</h1>
        <form align="center" method="post" action="/addMember">
            名前<input type="text" name="name">
            性別<select type="text" name="gender"></option><option value="man">男性</option>
            <option value="woman">女性</option></select>
            住所<input type="text" name="adress"><br>
            年齢<input type="text" name="age">
            携帯番号<input type="tel" name="tel">
            <br>
            <br>
            <br>
            <br>
            <input class="btn-primary" type="submit" value="新規追加"/>
            <a class="btn-primary" href="index">
                <input type="button" class="btn-primary" value="メニュー画面に戻る"/>
            </a>
        </form>
    </body>
</html>
