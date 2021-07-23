<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
  <title>创建教师</title>
  <meta name="author" content="Jake Rocheleau">
  <link rel="stylesheet" href="chuangjiankecheng/css/jiaoshi.css">
  <script type="text/javascript" src="chuangjiankecheng/js/jquery.min.js"></script>
  <script type="text/javascript" src="chuangjiankecheng/js/menu.js"></script>
</head>

<body>
<div id="pgcontainer">
  <header>
    <div id="navbar">
      <a href="#" class="menubtn">menu</a>
      <!-- use captain icon for toggle menu -->
      <div id="hamburgermenu">
        <ul>
		  <li><a href="#">教师列表</a></li>
          <li><a href="#">学习记录</a></li>
          <li><a href="#">学习资料</a></li>
          <li><a href="#">已购课程</a></li>
          <li><a href="#">我的订单</a></li>
          <li><a href="#">选课中心</a></li>
		  <li><a >——————————</a></li>
		  <li><a href="#">基本信息</a></li>
		  <li><a href="#">我的头像</a></li>
		  <li><a href="#">修改密码</a></li>
        </ul>
      </div>
    </div>
    <div class="overlay"></div>
  </header>
  
  <div id="content">
    <div class="top">
		<span style="float: left;font-size: 40px;font-weight: 600;">创建教师</span>
		
	</div>
	<div class="tiao">	
	</div>
	
	<div class="c3">
		<div style="float:right;font-size: 20px;font-family: arial black;">
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 140px;">头像：<img src="chuangjiankecheng/img/pc4.png" alt=""/>
		<a href="#"><button class="button1;text-align: left; padding-left: 140px;">上传</button></a>
		<a href="#"><button class="button1;text-align: left; padding-left: 140px;">清除</button></a>
		</p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 140px;">姓名：<input type="text" name="name"></p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 140px;">性别：<input type="radio" name="sex">男
                                                                                                  <input type="radio" name="sex">女</p>  
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 140px;">电话：<input type="text" name="phone"></p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 140px;">编号：<input type="text" name="bianhao"></p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 100px;">是否推荐：<input type="radio" name="true">是
		                                                                                              <input type="radio" name="true">否</p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 140px;">简介：<textarea style="width: 180px;height:32px"></textarea></p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 120px;">登录名：<input type="text" name="phone"></p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 140px;">密码：<input type="text" name="password"></p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 100px;">确认密码：<input type="text" name="s-password"></p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 60px;">是否允许登录：
        <select><option>是</option>
                <option>否</option>
        </select>“是”允许登录，“否”不允许登录</p>
		<p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 100px;">用户角色：<input type="radio" name="look">教师(查看)
                                                                                                      <input type="radio" name="look">教师(编辑)</p>																							  
		<div style="float: left; padding-left: 280px;text-align: left; padding-left: 140px;"><a href="#"><button class="button1">保存</button></a>
		                                                                                     <a href="#"><button class="button1">返回</button></a>
		</div>
     </div>
	</div>
  </div>
</div><!-- @end #pgcontainer -->
</body>
</html>