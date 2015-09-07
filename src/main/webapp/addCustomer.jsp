<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
			<div style="padding-top: 10px;font-size:20px;border:red solid 2px;" class="col-md-3">
				8822 林晓东
			</div>
			<div style="padding-top: 10px;border:red solid 2px;" class="col-md-3 col-md-push-6">
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
		<div id="context" style="width:100%;background-color:#ff0000;">
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
			
			<div class="col-md-10" id="addCustomer" style="height:800px;">
				<div>创建Customer</div>
				<hr>
				<div>基本信息</div>
			</div>
		</div>

</div>

</body>
</html>