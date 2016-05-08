<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
    <c:if test="${not empty error}">
        <div class="alert alert-danger"><c:out value="${error}" /></div>
    </c:if>
	Please login
	<form name="loginform" method="post" action="login"> 
		Username <input type="text" name="username"/><br>
		Password <input type="password" name="password"/><br>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>