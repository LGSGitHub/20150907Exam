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
			
			<div class="col-md-10" id="addCustomer">
				<div style="font-size:20px; margin:10px;"><strong>创建Customer</strong></div>
				
				<hr style="background-color: #ADD8E6;height:2px;">
				
				<div style="font-size:20px;margin-bottom:20px;">基本信息</div>
				
				<div style="width:600px;" id="addMessage">
				
					<form action="AddCustomer_execute.action" method="post" role="form" class="form-horizontal">
						<div class="form-group form-group-md">
							<label class="col-md-4 control-label">First Name</label>
							<span style="color:red;">*</span>
							<div class="col-md-6">
								<input type="text" class="form-control" id="firstName" name="first_name">
							</div>
						</div>
							
						<div class="form-group form-group-md">
							<label class="col-md-4 control-label">Last Name</label>
							<span style="color:red;">*</span>
							<div class="col-md-6">
								<input type="text" class="form-control" id="lastName" name="last_name">
							</div>
						</div>
							
						<div class="form-group form-group-md">
							<label class="col-md-4 control-label">Email</label>
							<div class="col-md-6">
								<input type="text" class="form-control" id="email" name="email">
							</div>
						</div>
							
						<div class="form-group form-group-md">
							<label class="col-md-4 control-label">Address</label>
							<span style="color:red;">*</span>
							<div class="col-md-6">
								<select class="form-control" id="address" name="address"></select>
							</div>
						</div>
						
						<div class="form-group form-group-md">
							<div class="col-md-2 col-md-offset-4">
								<button type="submit" class="btn btn-primary" name="submit">提交</button>
							</div>
							<div class="col-md-2">
								<button type="reset" class="btn btn-default" name="reset">取消</button>
							</div>
						</div>
					</form>
				</div>
				
			</div>
		</div>

</div>
	<script src="jquery-2.1.4.min.js"></script>
	<script src="bootstrap.min.js"></script>
	<script>
		$(document).ready(function(){
				//获取Address数据
				$.ajax({
					type:"post",
					dataType:"json",
					data:"",
					url:"/20150907ExamStruts2/getAddress.action",
					error : function() {
						alert("address数据回调失败")},
					success:function(data){
						var str = "";
						var arr = eval(data);
						// 把address添加到更新Customer的模态框的下拉列表里
						for(i in arr){							
							str +="<option>" + arr[i].address + "</option>";
						}
						$('#address').append(str);
					}
				}); 
		});
	</script>
</body>
</html>