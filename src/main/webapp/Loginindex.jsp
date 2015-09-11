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

table {
	border-collapse: collapse;
}

table td {
	text-align: center;
	border: 1px solid gray;
	padding: 3px 10px;
}

a:link{
	text-decoration:none;
}
</style>
</head>
<body>
	<div id="container">

		<!-- 头部显示内容div -->
		<div style="height: 50px; background-color: #ADD8E6;">
			<div style="padding-top: 10px; font-size: 20px;" class="col-md-3">
				8822 林晓东</div>
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

		<!-- 左侧链接div 标签页 -->
		<div id="menu"
			style="font-size: 20px; width: 200px; height: 800px; float: left;">
			<ul class="nav" role="tablist">
				<li role="presentation"><a href="#profile" id="customerManage"
					aria-controls="profile" role="tab" data-toggle="tab">
						Customer管理</a></li>
				<li role="presentation"><a href="#messages"
					aria-controls="messages" role="tab" data-toggle="tab">Film设置</a></li>
			</ul>
		</div>

		<!-- 右侧显示内容div -->
		<div class="tab-content">

			<!-- 第一个（Customer）标签页div -->
			<div role="tabpanel" class="tab-pane" id="profile">
			
				<!-- 显示数据头部div -->
				<div style="font-size:30px;">
					<div class="col-md-4">客户列表</div>
					<div class="col-md-6">
						<button style="background-color:#ADD8E6">
							<a href="<%=request.getContextPath()%>/addCustomer.jsp">新建</a>
						</button>
					</div>
				</div>
				<div>

					<!-- table显示数据 div-->
					<div style="padding-top: 30px;" id="costomerList">
						<table>
							<thead>
								<tr>
									<td width="100px">操作</td>
									<td>First Name</td>
									<td>Last Name</td>
									<td>Address</td>
									<td>Email</td>
									<td>CustomerId</td>
									<td>LastUpdate</td>
								</tr>
							</thead>
							<tbody></tbody>
						</table>

					</div>


					<!--默认分页-->
					<div style="text-align: center;">
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

			<!-- 第二个标签页（Film）div -->
			<div role="tabpanel" class="tab-pane" id="messages">这是Film tab</div>
		</div>

		<!-- 模态框update Customer data div -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
				
					<form action="UpdateCustomer_execute.action" role="form" class="form-horizontal">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Update Customer</h4>
					</div>
					<div class="modal-body" id="modal-body">
					
						
						
							<div class="form-group form-group-md" style="display:none;">
								<label class="col-md-4 control-label">Customer Id<span>*</span></label>
								<div class="col-md-6">
									<input type="text" readonly class="form-control" id="customerId" name="customer_id">
								</div>
							</div>
							
							<div class="form-group form-group-md">
								<label class="col-md-4 control-label">First Name<span>*</span></label>
								<div class="col-md-6">
									<input type="text" class="form-control" id="firstName" name="first_name">
								</div>
							</div>
							
							<div class="form-group form-group-md">
								<label class="col-md-4 control-label">Last Name<span>*</span></label>
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
								<label class="col-md-4 control-label">Address<span>*</span></label>
								<div class="col-md-6">
									<select class="form-control" id="address" name="address"></select>
								</div>
							</div>
							
						
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary" name="submit">Save changes</button>
					</div>
					</form>
				</div>
			</div>
		</div>
		
		<!-- 模态框:delete Customer data div -->
		<div class="modal fade" id="deleteCustomerModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
				
					<form action="DeleteCustomer_execute.action" role="form" class="form-horizontal">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="dcTitle">Delete Customer</h4>
					</div>
					<div class="modal-body" id="delete-modal-body">
						
							<div class="form-group form-group-md" style="display:none;">
								<label class="col-md-4 control-label">Customer Id</label>
								<div class="col-md-6">
									<input type="text" readonly class="form-control" id="deleteCustomerId" name="customer_id">
								</div>
							</div>
							
							<div class="form-group form-group-md">
								<h3 align="center">你确定要删除吗？</h3>
							</div>
							
						
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">NO</button>
						<button type="submit" class="btn btn-primary" name="submit">YES</button>
					</div>
					</form>
				</div>
			</div>
		</div>


	</div>
	<script src="jquery-2.1.4.min.js"></script>
	<script src="bootstrap.min.js"></script>
	<script>
		$(function() {
			$("#customerManage").click(
					function() {
						$.ajax({
							type : "post",
							dataType : "json",
							data : "",
							url : "/20150907ExamStruts2/getCustomer.action",
							error : function() {
								alert("数据回调失败")
								},
							success : function(data) {
								var str = "";
								var arr = eval(data);
								//alert(arr[1].first_name);
								for (i in arr) {
									str += "<tr><td><a href='javascript:void(0)' onclick='update(this)'>编辑</a> | <a href='javascript:void(0)' onclick='deleteCustomer(this)')>删除</a></td><td>"
									+ arr[i].first_name
									+ "</td><td>"
									+ arr[i].last_name
									+ "</td><td>"
									+ arr[i].address
									+ "</td><td>"
									+ arr[i].email
									+ "</td><td>"
									+ arr[i].customer_id
									+ "</td><td>"
									+ arr[i].last_update
									+ "</td></tr>";
									}
								$("tbody").append(str);
								}
						});
						
					});
		});
		
		function getAddress()
		{
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
		}
		
		function update(obj)
		{
			getAddress();
			var tds=$(obj).parent().parent().find('td');
			$('#customerId').val(tds.eq(5).text());
			$('#firstName').val(tds.eq(1).text());
			$('#lastName').val(tds.eq(2).text());
			$('#email').val(tds.eq(4).text());
			var ops = $('#address').children();
			//设置address的默认值，但是失败
			/* for(var i=0;i<ops.length; i++){  
		        var tempValue = ops.eq(i).text();  
		        if(tempValue == tds.eq(3).text() )  
		        {  
		        	alert(tempValue);
		        	ops.eq(i).selected = true;  
		        }  
		    } */ 
			//$('#address').val(tds.eq(3).text())
			$('#myModal').modal('show');
			//<a href='javascript:update(this)'>编辑</a>
		}
		
		function deleteCustomer(obj)
		{
			var tds=$(obj).parent().parent().find('td');
			$('#deleteCustomerId').val(tds.eq(5).text());
			$('#deleteCustomerModal').modal('show');
		}
		
		/* function doUpdateCustomer(obj)
		{
			var tds = $(obj).parent().parent().find('td');
			
		} */
		
	</script>

</body>
</html>