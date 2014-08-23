<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./style/logStyle.css">
</head>
<body>
	<form action="user_login" method="post">
		<fieldset>
			<legend>用户登录</legend>
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
					<input type="submit" value="登录" />
				</li>
			</ul>
		</fieldset>
	</form>
</body>
</html>