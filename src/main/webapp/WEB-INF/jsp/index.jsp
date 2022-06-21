<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%pageContext.setAttribute("APP_PATH", request.getContextPath());%>--%>
<!DOCTYPE html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>welcome</title>
    <link href="@{/css/bootstrap.min.css}" rel="stylesheet">
</head>
<body>
<h1 align="center">株式会社ソフトユージング新人教育管理サイト<br>メニュー</h1>
<hr>
<div id="typein" align="center">
    <table>
        <tr></tr>
        <tr>
            <td></td><td></td>
            <td>
                <a href="newMemberPage">
                    <input type="button" class="btn-primary" value="１．新規メンバー"/>
                </a>
            </td>
            <td></td><td></td><td></td>
            <td></td><td></td><td></td>
            <td>
                <a class="btn-primary" href="memberManagementPage">
                    <input type="button" class="btn-primary" value="２．メンバー管理"/>
                </a>
            </td>
        </tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <tr></tr>
        <td></td><td></td>
        <td>
            <a href="newGradePage">
                <input type="button" class="btn-primary" value="３．新規成績"/>
            </a>
        </td>
        <td></td><td></td><td></td><td><td></td><td>
        <td>
            <a href="gradeManagementPage">
                <input type="button" class="btn-primary" value="４．成績管理"/>
            </a>
        </td>
        <tr>
            <td></td>
        </tr>
        <tr>
        </tr>
        <tr>
        </tr>
    </table>
</div>
<footer>
    <hr>
</footer>
</body>
</html>