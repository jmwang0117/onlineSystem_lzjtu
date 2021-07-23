<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
  
  <title>创建课程</title>
  <meta name="author" content="Jake Rocheleau">
  <link rel="stylesheet" href="chuangjiankecheng/css/chuangjian.css">
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
		<span style="float: left;font-size: 40px;font-weight: 600;">创建课程</span>
		
	</div>
	<div class="tiao">
		
	</div>
	 <div class="c1-2">
		 <form action="/class1" method="post">

			 <p>课程名称：<input type="text" name="name">
				 <span style="color: #A3A3A3;">（注：限12个汉字内）</span></p>
			 <p>录像选择：
				 <label><input name="chos" type="radio" value="" />本地</label>
				 <label><input name="chos" type="radio" value="" />第三方</label></p>
			 <p>本地录像：<input type="file" name="course_name"><a href="#"><button class="button5">上传</button></a></p>
			 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分类：<select name="classfication"  style="width: 175px;height:25px">
				 <option value="music">音乐</option>
				 <option value="art">美术</option>
				 <option value="kaoyan">考研</option>
			 </select></p>
			 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价格：<input type="number" name="price">
				 <span style="color: #A3A3A3;">（单位：元，免费课程输入0）</span></p>
			 <p>课程封面：<img src="Student/img/pic2.jpg" alt="">
				 <a href="#"><button class="button5">上传</button></a>
				 <a href="#"><button class="button5">清除</button></a>
			 </p>
			 <p>是否推荐：
				 <label><input name="recom" type="radio" value="" />是</label>
				 <label><input name="recom" type="radio" value="" />否</label></p>
			 <p>主讲教师：<input type="text" name="teacher">
				 <a href="#"><button class="button5">选择</button></a></p>
			 <p>课程简介：
				 <textarea name="text" rows="10" style="width:300px;padding-top:1px;font-size:14px;"></textarea></p>
			 <p>报名截止时间：<input type="date" name="time"></p>
			 <button type="submit">提交数据库</button>
		 </form>

	 </div>
	 
</div><!-- @end #pgcontainer -->
</body>
</html>
