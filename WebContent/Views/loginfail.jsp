<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<font color="red">Incorrect username or password</font>
	<form name="loginform" method="post" action="login"> 
		Username <input type="text" name="username"/><br>
		Password <input type="text" name="password"/><br>
		<input type="submit" value="submit"/>
	</form>
	
</body>
</html>