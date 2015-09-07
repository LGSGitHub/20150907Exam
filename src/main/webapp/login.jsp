<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录页面</title>

<style type="text/css">
body {
	color: #000;
	font-size: 14px;
	margin: 20px auto;
	background-image: url("11.jpg");
	background-repeat: no-repeat;
	background-size:100%; 
}

p {
	font-size: 30px;
	margin-left: 30px;
}
</style>

<script type="text/javascript">
	function check(form) {
		if (document.forms.loginForm.userName.value == "") {
			//弹出提示
			alert("请输入用户名！");
			//将焦点聚到用户输入框
			document.forms.loginForm.userName.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<div id="container">
		<div>
			<p>8822林晓东</p>
		</div>
		<div>
			<form action="<%=request.getContextPath()%>/Login_execute.action" method="post">
				<center>
					<table border="2" cellspacing="0" cellpadding="5"
						bordercolor="silver" align="center" width="500px" 
						height="200px" bgcolor="#ffffff">
						<tr>
							<td colspan="2" align="center" bgcolor="#E8e8e8">电影租贷管理系统</td>
						</tr>
						<tr>
							<td style="text-align:right;">用户名：</td>
							<td><input type="text" name="username" /></td>
						</tr>
						<tr>
							<td style="text-align:right;">密码：</td>
							<td><input type="password" name="password" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								name="submit" onClick="return check(this);" /> <input
								type="reset" name="reset" /></td>

						</tr>
					</table>
				</center>
			</form>
		</div>
	</div>
</body>
</html>