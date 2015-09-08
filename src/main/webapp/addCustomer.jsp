<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加用户</title>
<link href="bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="container">
	<div style="height: 50px; background-color: #ADD8E6;">
			<div style="padding-top: 10px;font-size:20px;" class="col-md-3">
				8822 林晓东
			</div>
			<div style="padding-top: 10px;" class="col-md-3 col-md-push-6">
				用户名：<%=request.getSession().getAttribute("username")%>
				<%
					String flag = "";
					Object obj = session.getAttribute("flag");
					if (obj != null) {
						flag = obj.toString();
					}
					if (flag.equals("login_success")) {
				%>
				<button>
					<a href="<%=request.getContextPath()%>/Logout_execute.action">退出登陆</a>
				</button>
				<%
					} else {
				%>
				<button>
					<a href="<%=request.getContextPath()%>/login.jsp">登录</a>
				</button>
				<%
					}
				%>
			</div>
		</div>
		<div id="context">
			<div class="col-md-2" id="menu" style="font-size: 20px; height: 800px;">
				<ul class="nav" role="tablist">
					<li role="presentation">
						<a href="#profile" id="customerManage" aria-controls="profile"
						 role="tab" data-toggle="tab">Customer管理</a>
					 </li>
					<li role="presentation">
						<a href="#messages"
						aria-controls="messages" role="tab" data-toggle="tab">Film设置</a>
					</li>
					<li role="presentation">
						<a href="#profile" id="customerManage" aria-controls="profile"
						 role="tab" data-toggle="tab">Customer管理</a>
					 </li>
					<li role="presentation">
						<a href="#messages"
						aria-controls="messages" role="tab" data-toggle="tab">Film设置</a>
					</li>
					<li role="presentation">
						<a href="#profile" id="customerManage" aria-controls="profile"
						 role="tab" data-toggle="tab">Customer管理</a>
					 </li>
					<li role="presentation">
						<a href="#messages"
						aria-controls="messages" role="tab" data-toggle="tab">Film设置</a>
					</li>
				</ul>
			</div>
			
			<div class="col-md-10" id="addCustomer" style="height:500px;background-color:#cccccc;">
				<div style="font-size:20px; margin:10px;"><strong>创建Customer</strong></div>
				
				<hr style="background-color: #ADD8E6;height:2px;">
				
				<div style="">基本信息</div>
				
				<div>
					<%-- <table style="width:500px;border:red solid 2px;">
						<tr>
							<td style="text-align:right;">First Name<span style="color:red">*</span></td>
							<td><input type="text" name="first_name"></td>
						</tr>
						
						<tr>
							<td style="text-align:right;">Last Name<span style="color:red">*</span></td>
							<td><input type="text" name="last_name"></td>
						</tr>
						<tr>
							<td style="text-align:right;">Email</td>
							<td><input type="text" name="email"></td>
						</tr>
						
						<tr>
							<td style="text-align:right;">Address<span style="color:red">*</span></td>
							<td><select name="address" list="{'张三','李四','王五'}"/></td>
						</tr>
						<tr>
							<td style="text-align:right;">
								<input type="submit" value="新建">
							</td>
							<td style="text-align:left;">
								<input type="reset" value="取消">
							</td>
						</tr>
						
					</table> --%>
					
					<s:form action="" method="post">
						<s:textfield label="First Name" name="fist_name"/>
						<s:textfield label="Last Name" name="last_name"/>
						<s:textfield label="Email" name="email"/>
						<s:select list="{'张三','李四','王五'}" name="address" label="Address"/>
						<s:submit name="submit" value="新建"/>
					</s:form>
					
				</div>
				
			</div>
		</div>

</div>

</body>
</html>