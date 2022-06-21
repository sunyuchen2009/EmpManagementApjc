<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SUN
  Date: 2022/6/21
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
    <head>
        <meta charset="utf-8">
        <title>メンバー管理</title>
        <h1 align="center">メンバー管理</h1>
        <script type="text/javascript" src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    </head>
    <body>
        <div1 class="div-parent">
            <div>
                <tr>
                    名前:<input id="search_name" type="text" name="name"><td></td><td></td>
                    年齢:<input id="search_age" type="text" name="age">
                    <button id="searchBtn" onclick="getSearchMember()">検索</button></tr><br>
                </tr>
                <tr>
                    <td>性別:<select id="search_gender" name="gender"><option value="man">男性</option>
                        <option value="woman">女性</option></select>
                    </td>
                </tr>
            </div>
        </div1>

        <div2 class="div-parent">
            <table id="memberTable" border="1" cellspacing="0" style="width: 500px;height: 100px" >
                <tr>
                    <th>ID</th>
                    <th>名前</th>
                    <th>年齢</th>
                    <th>性別</th>
                    <th>携帯番号</th>
                    <th>住所</th>
                    <th>操作</th>
                </tr>
                <tbody id="t_body">
                <!--全部列表 可以对比thymeleaf语法来看-->
                <c:forEach items="${memberList}" var="item" varStatus="status">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.name}</td>
                        <td>${item.age}</td>
                        <td>${item.gender}</td>
                        <td>${item.tel}</td>
                        <td>${item.adress}</td>

                        <td><button onclick="changeMember('${item.id}', '${item.name}', '${item.age}', '${item.gender}', '${item.tel}', '${item.adress}')">変更</button></td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div2>
        <div3>
            <form align="center" method="post" action="updateMember">
                <input id="new_id" type="hidden" name="id" value="ID">
                名前<input id="new_name" type="text" name="name">
                性別<select id="new_gender" name="gender">
                <option value="0"></option><option value="man">男性</option>
                <option value="woman">女性</option>
            </select>
                住所<input id="new_adress" type="text" name="adress"><br>
                年齢<input id="new_age" type="text" name="age">
                携帯番号<input id="new_tel" type="tel" name="tel">
                <br>
                <br>
                <br>
                <br>
                <tr>
                    <td>
                        <a href="index">
                            <input type="button" class="btn-primary" value="メニュー画面に戻る"/>
                        </a>
                    </td>
                    <td>
                        <input class="btn-primary" type="submit" value="更新する"/>
                    </td>
                </tr>
            </form>
        </div3>

        <script>
            // 获取检索数据，并动态显示到界面上
            function getSearchMember(){
                $.ajax({
                    url: '/searchMember',
                    type:'post',
                    data:{
                        'name':$("#search_name").val(),
                        'age':$("#search_age").val(),
                        'gender':$("#search_gender").val()
                    },
                    dataType:'json',
                    success:function (data) {
                        alert(JSON.stringify(data));

                        let tBody = $("#t_body");
                        tBody.empty();
                        data.forEach(item => {
                            if(item != null) {
                                tBody.append(createRow(item));
                            }
                        })
                    }
                });
            }

            // 创建一行html标签，利用tBody拼接
            function createRow(item){
                let html = '<tr>' + '<td>' + item.id + '</td>'
                            + '<td>' + item.name + '</td>'
                            + '<td>' + item.age + '</td>'
                            + '<td>' + item.gender + '</td>'
                            + '<td>' + item.tel + '</td>'
                            + '<td>' + item.adress + '</td>'
                            + '<td>'
                            + '<button onclick="changeMember(\'' + item.id + '\' , \''
                                + item.name + '\' , \''
                                + item.age + '\' , \''
                                + item.gender + '\' , \''
                                + item.tel + '\' , \''
                                + item.adress + '\''
                                + ')">変更</button></td>'
                            + '</tr>';
                return html;
            }

            // 变更按钮点击事件，将对应的数据转移到下面更改位置
            function changeMember(id, name, age, gender, tel, adress){
                console.log(name);
                document.getElementById("new_id").value = id;
                document.getElementById("new_name").value = name;
                document.getElementById("new_age").value = age;
                document.getElementById("new_gender").value = gender;
                document.getElementById("new_tel").value = tel;
                document.getElementById("new_adress").value = adress;
            }
        </script>

        <style>
            /* div居中样式 */
            .div-parent {
                display: flex;
                /*项目位于容器的中心*/
                justify-content: center;
                /*元素位于容器的中心。弹性盒子元素在该行的侧轴（纵轴）上居中放置。（如果该行的尺寸小于弹性盒子元素的尺寸，则会向两个方向溢出相同的长度）。*/
                align-items: center;
            }
            a{
                text-decoration:none;
            }
        </style>
    </body>
</html>