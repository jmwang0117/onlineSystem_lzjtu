<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>		
<meta charset="utf-8" />		
    <title>学生管理系统</title>		、
	<link rel="stylesheet" type="text/css" href="chuangjiankecheng/css/style.css">
</head>	
<body>		
    <div id="container">			
	    <div class="top1">欢迎进入用户管理信息平台	</div>
		<div class="nav">				
		    <a href="/modify_school"><img src="chuangjiankecheng/img/zhuye.png" width="60" height="60" /></a>
			<a href="#"><img src="chuangjiankecheng/img/guan.png" width="60" height="60" /></a>
			<a href="#"><img src="chuangjiankecheng/img/zifei.png" width="60" height="60" /></a>
			<a href="#"><img src="chuangjiankecheng/img/jue1.png" width="60" height="60" /></a>
		</div>			
		<div class="conter">				
		    <div class="conter_up">用户信息列表</div>
			<div class="conter_middle">				
			    <table cellspacing="0" cellpadding="0">						
				    <thead>							
					    <tr>								
						    <th>用户名</th>								
							<th>密码</th>															
							<th>邮箱</th>								
							<th>电话</th>								
							<th>操作</th>
						</tr>						
					</thead>						
				</tbody>							
				<tr>																
					<td>${user1.username}</td>
					<td>${user1.PASSWORD}</td>
					<td>${user1.email}</td>
					<td>${user1.telephone}</td>
					<td><a href="#">删除</a> <a href="#">添加</a></td>
				</tr>							
				<tr>
					<td>${user2.username}</td>
					<td>${user2.PASSWORD}</td>
					<td>${user2.email}</td>
					<td>${user2.telephone}</td>
					<td><a href="/delete">删除</a> <a href="/register1">添加</a></td>
				</tr>							
				<tr>
					<td>${user3.username}</td>
					<td>${user3.PASSWORD}</td>
					<td>${user3.email}</td>
					<td>${user3.telephone}</td>
					<td><a href="#">删除</a> <a href="#">添加</a></td>
				</tr>							
				<tr>								
				    <td>唐九洲</td>								
					<td>567890admin</td>								
					<td>86454545@qq.com</td>								
					<td>965654</td>														
					<td><a href="#">删除</a> <a href="#">添加</a></td>
				</tr>							
				<tr>								
				    <td>完颜洪烈</td>
					<td>08454admin</td>									
				    <td>676574@qq.com</td>															
					<td>567812</td>															
					<td><a href="#">删除</a> <a href="#">添加</a></td>
				</tr>							

				</tbody>					
				</table>				
			</div>				
			<div class="conter_down">					
			    <span>共3页</span>					
				<input type="button" name="" id="" value="上一页" />					
				<select name="">						
				<option value="1">1</option>						
				<option value="2">2</option>						
				<option value="3">3</option>					
		    </select>					
			    <input type="button" name="" id="" value="下一页" />				
			</div>			
		</div>			
		<div class="foot">&copy;电子与信息工程学院18计科版权所有</div>		
	</div>
</body>
</html>
