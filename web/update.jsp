<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="zh-CN">
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
<div class="update">
    <div class="out-box">

        <form action="update">

            <h2>用户注册</h2>

            <div class="input-group">
                <div class="icon">
                    <i class="fa fa-id-card"></i>
                </div>
                <div>
                    <h5>学号</h5>
                    <input type="number" name="rid" class="input" min="1000000000" max="2100000000" value="${msg.object.id}" readonly>
                </div>
            </div>

            <div class="input-group">
                <div class="icon">
                    <i class="fa fa-lock"></i>
                </div>
                <div>
                    <h5>密码</h5>
                    <input type="password" name="rpsw" class="input"value="${msg.object.psw}">
                </div>
            </div>

            <div class="input-group">
                <div class="icon">

                    <i class="fa fa-user"></i>
                </div>
                <div>
                    <h5>姓名(昵称)</h5>
                    <input type="text" name="rname" class="input"value="${msg.object.name}" >
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
                            <input id="woman" type="radio" name="rsex"value="woman"/>
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
                    <input type="number" name="rage" class="input" value="${msg.object.age}">
                </div>

            </div>

            <div class="input-group">

                <div class="icon">
                    <i class="fa fa-envelope" aria-hidden="true"></i>
                </div>

                <div>
                    <h5>邮箱</h5>
                    <input type="email" name="remail" class="input" value="${msg.object.email}">
                </div>

            </div>


            <div class="input-group">

                <div class="icon">
                    <i class="fa fa-phone" aria-hidden="true"></i>
                </div>

                <div>
                    <h5>电话号码</h5>
                    <input type="number" maxlength="11" name="rphone" class="input" value="${msg.object.phone}">
                </div>

            </div>

            <div style="text-align:center; color: red">${msg.msg}</div>

            <div class="update-button">
                <div></div>
                <div>
                    <input type="submit" class="btn" value="修改">
                </div>
                <div></div>
                <div>
                    <form action="delete">
                        <input type="hidden" name="rid" class="nosee" value="${msg.object.id}" readonly>
                        <input type="submit" class="btn" value="删除账号"/>
                    </form>
                </div>
                <div></div>

            </div>

        </form>
    </div>
</div>


</body>
</html>