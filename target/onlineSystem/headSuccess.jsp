<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>

    <title>yigoukecheng</title>
    <meta name="author" content="Jake Rocheleau">
    <link rel="stylesheet" href="Student/css/uploadtou.css">
    <script type="text/javascript" src="Student/js/jquery.min.js"></script>
    <script type="text/javascript" src="Student/js/menu.js"></script>

</head>

<body>
<div id="pgcontainer">
    <header>
        <div id="navbar">
            <a href="#" class="menubtn">menu</a>
            <!-- use captain icon for toggle menu -->
            <div id="hamburgermenu">
                <ul>
                    <li><a href="#">学习记录</a></li>
                    <li><a href="#">学习资料</a></li>
                    <li><a href="student.html">已购课程</a></li>
                    <li><a href="#">我的订单</a></li>
                    <li><a href="#">选课中心</a></li>
                    <li><a >——————————</a></li>
                    <li><a href="message.jsp">基本信息</a></li>
                    <li><a href="headImage.jsp">我的头像</a></li>
                    <li><a href="changemm.html">修改密码</a></li>
                </ul>
            </div>
        </div>
        <div class="overlay"></div>
    </header>

    <div id="content">
        <div class="top">
            <span style="float: left;font-size: 40px;font-weight: 600;">我的头像</span>

        </div>
        <div class="tiao">

        </div>
        <div class="c1">
            <img src="/upload/${filename}"/>
        </div>

        <div class="c5" >
            <form action="/" method="post" enctype="multipart/form-data">

                文件<input type="file" name="uploadFile"><br/>
                <a href="#"><button class="button1" type="submit">上传</button></a>
            </form>


        </div>
    </div><!-- @end #pgcontainer -->
</body>
</html>
