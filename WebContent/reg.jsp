<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./style/logStyle.css">
<script type="text/javascript" src="./js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="./js/register.js"></script>

<title>Insert title here</title>
</head>
<body>
	<form action="">
		<fieldset>
			<legend>用户注册</legend>
			<ul>
				<li>
					<label>用户名：</label>
					<input type="text" name="name" />
				</li>
				<li>
					<label>密码：</label>
					<input type="password" name="password" />
				</li>
				<li>
					<label>确认密码：</label>
					<input type="password" name="repsw" />
				</li>
				<li>
					<label>出生日期：</label>
					<input type="text">*格式：yyyy-MM-dd
				</li>
			</ul>
			<input type="submit" value="提交">
		</fieldset>
	</form>
</body>
</html>