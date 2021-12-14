<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--引入外部的字体库-->
    <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
    <!--登录时候的图片：最左边的-->
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

    <link rel="stylesheet" href="css/style.css">
    <title>首页</title>

</head>
<body>
<div>
    <div class="out-box">
        <form>
            <a href="login.jsp">
                <input type="button" class="btn" value="登录">
            </a>
            <a href="reg.jsp">
                <input type="button" class="btn" value="注册">
            </a>
            <a href="update.jsp">
                <input type="button" class="btn" value="查询&修改">
            </a>
            <a href="delete">
                <input type="button" class="btn" value="删除">
            </a>
        </form>
    </div>
</div>
</body>
</html>