<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index</title>
<link href="bootstrap.min.css" rel="stylesheet" type="text/css">
<style type="text/css">
.costomerList div {
	border: 2px solid red;
}
</style>
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
		<div id="menu" style="font-size: 20px; width: 200px; height: 800px; float: left;">
			<ul class="nav" role="tablist">
				<li role="presentation"><a href="#profile" id="customerManage"
					aria-controls="profile" role="tab" data-toggle="tab">
						Customer管理</a></li>
				<li role="presentation"><a href="#messages"
					aria-controls="messages" role="tab" data-toggle="tab">Film设置</a></li>
			</ul>
		</div>
		<div class="tab-content">
			<div role="tabpanel" class="tab-pane" id="profile"
				style="height: 50px; background-color: #cccccc; font-size: 20px;">
				<div class="col-md-4">客户列表</div>
				<div class="col-md-6">
					<button>
						<a href="<%=request.getContextPath()%>/addCustomer.jsp"">新建</a>
					</button>
				</div>

				<div>
					<div style="padding-top: 30px;" id="costomerList">
						<!-- <p>
							first_name:<span id="fname"></span>
						</p>
						<br />
						<p>
							last_name:<span id="lname"></span>
						</p>
						<div class="col-sm-1">
							<strong>操作</strong>
						</div>
						<div class="col-sm-1">First_Name</div>
						<div class="col-sm-1">Last_Name</div>
						<div class="col-sm-2">Address</div>
						<div class="col-sm-2">Email</div>
						<div class="col-sm-1">Customer_id</div>
						<div class="col-sm-2">LastUpdate</div> -->
					</div>


					<!--默认分页-->
					<div style="text-align:center;">
					<nav>
					<ul class="pagination pagination-lg">
						<li><a href="#" aria-label="Previous"> <span
								aria-hidden="true">&laquo;</span>
						</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#" aria-label="Next"> <span
								aria-hidden="true">&raquo;</span>
						</a></li>
					</ul>
					</nav>
					</div>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane" id="messages">这是第三个tab</div>
		</div>


	</div>
	<script src="jquery-2.1.4.min.js"></script>
	<script src="bootstrap.min.js"></script>
	<script>
	</script>

</body>
</html>