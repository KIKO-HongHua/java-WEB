<%--
  User: HongHua
  仅用于学习
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--引入外部的字体库--谷歌字体库----roxxx-->
    <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
    <!--登录时候的图片：最左边的-->
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">

    <title>用户登录</title>
</head>
<body>
<div class="login">
    <div class="out-box">
S
        <form action="login" method="post">

            <h2>用户登录</h2>
            <div class="out-width">
                <div></div>
                <div>
                    <div class="input-group">
                        <div class="icon">
                            <i class="fa fa-user"></i>
                        </div>
                        <div>
                            <h5>学号</h5>
                            <input type="number" class="input" name="lid" required>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="icon">
                            <i class="fa fa-lock"></i>
                        </div>
                        <div>
                            <h5>密码</h5>
                            <input type="password" class="input" name="lpsw" required>
                        </div>
                    </div>
                </div>
                <div></div>
            </div>
            <a href="reg.html"class="reg">register&nbsp;&nbsp;&nbsp;</a>

            <div style="text-align:center; color: red">${msg.msg}</div>

            <div class="button">
                <div></div>
                <div>
                    <input type="submit" class="btn" value="登录">
                </div>
                <div></div>
            </div>

        </form>
    </div>
</div>
</body>
</html>
