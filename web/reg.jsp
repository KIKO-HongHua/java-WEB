<%--
  User: HongHua
  仅用于学习
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--引入外部的字体库-->
    <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
    <!--登录时候的图片：最左边的-->
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <title>用户注册</title>

</head>
<body>
<div class="reg">
    <div class="out-box">

        <form action="reg" method="post">

            <h2>用户注册</h2>
            <div class="out-width">
                <div></div>
                <div>
            <div class="input-group">
                <div class="icon">
                    <i class="fa fa-id-card"></i>
                </div>
                <div>
                    <h5>学号</h5>
                    <input type="number" class="input" name="rid" required>
                </div>
            </div>
            <div class="input-group">
                <div class="icon">
                    <i class="fa fa-lock"></i>
                </div>
                <div>
                    <h5>密码</h5>
                    <input type="password" class="input" name="rpsw" required>
                </div>
            </div>

            <div class="input-group">
                <div class="icon">

                    <i class="fa fa-user"></i>
                </div>
                <div>
                    <h5>姓名(昵称)</h5>
                    <input type="text" class="input" name="rname" required>
                </div>
            </div>

            <div class="input-group">
                <div class="icon">
                    <i class="fa fa-transgender"></i>
                </div>
                <div>
                    <h5>性别</h5>
                    <div class="input-sex">
                        <div></div>
                        <div class="input-radio">
                            <input id="man" type="radio" name="rsex" value="man" checked/>
                            <label for="man">男</label>
                        </div>
                        <div class="input-radio">
                            <input id="woman" type="radio" name="rsex" value="woman" />
                            <label for="woman">女</label>
                        </div>
                    </div>

                </div>
            </div>

            <div class="input-group">
                <div class="icon">

                    <i class="fa fa-user"></i>
                </div>
                <div>
                    <h5>年龄</h5>
                    <input type="number" class="input" name="rage" >
                </div>
            </div>

            <div class="input-group">
                <div class="icon">
                    <i class="fa fa-envelope" aria-hidden="true"></i>
                </div>
                <div>
                    <h5>邮箱</h5>
                    <input type="email" class="input" name="remail">
                </div>
            </div>


            <div class="input-group">
                <div class="icon">
                    <i class="fa fa-phone" aria-hidden="true"></i>
                </div>
                <div>
                    <h5>电话号码</h5>
                    <input type="number" class="input" name="rphone">
                </div>
            </div>
                </div>
                <div></div>
            </div>
            <a href="login.jsp">返回登陆界面</a>


            <div style="text-align:center; color: red">${msg.msg}</div>

            <div class="button">
                <div></div>
                <div>
                    <input type="submit" class="btn" value="注册">
                </div>
                <div></div>
            </div>

        </form>
    </div>
</div>


</body>
</html>