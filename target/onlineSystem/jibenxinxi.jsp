<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
  
  <title>基本信息</title>
  <meta name="author" content="Jake Rocheleau">
  <link rel="stylesheet" href="chuangjiankecheng/css/jibenxinxi.css">
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
		<span style="float: left;font-size: 40px;font-weight: 600;">上传学校信息</span>
		
	</div>
	<div class="tiao">
		
	</div>
	 <div class="c1"> 
	 <div style="float:right;font-size: 20px;font-family: arial black;">
<form method="post" action="/insert">
    <p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 160px;">学校名称：<input type="text" name="school_name"></p>
    <p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 160px;">&nbsp;&nbsp;&nbsp;联系人：<input type="text" name="people"></p>
    <p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 160px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电话：<input type="text" name="telephone"></p>
    <p style="font-size: 20px;line-height: 20px; text-align: left; padding-left: 160px;">上传文件大小：<input type="text" name="astrict"></p>
    <div style="float: left; padding-left: 210px;"><a href="#"><button class="button1" type="submit">提交</button></a></div>


</form>
         <div>

         </div>

     </div>
     </div>
         <div style="width: 800px;height: 50px;margin-left: 80px;margin-top:-200px;font-size: 25px">
             <table cellspacing="0" cellpadding="0" style="text-align: center;letter-spacing: 0.5rem;		">
                 <thead>
                 <tr>
                     <th>学校名称</th>
                     <th>管理人员</th>
                     <th>联系电话</th>
                     <th>文件大小限制</th>
                 </tr>
                 </thead>
                 </tbody>
                 <tr>
                     <td valign="top">${user11.school_name}</td>
                     <td valign="top">${user11.people}</td>
                     <td valign="top">${user11.telephone}</td>
                     <td valign="top">${user11.astrict}</td>

                 </tr>
                 <tr>
                     <td>${user22.school_name}</td>
                     <td>${user22.people}</td>
                     <td>${user22.telephone}</td>
                     <td>${user22.astrict}</td>

                 </tr>


                 </tbody>
             </table>
         </div>



  </div>
</div><!-- @end #pgcontainer -->
</body>
</html>