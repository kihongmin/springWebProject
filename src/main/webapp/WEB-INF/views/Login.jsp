<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$('form').submit(function(){
		if($('#pid').val().length==0){
			alert('아이디 확인!!!');
			$('#pid').focus();
			return false;
		}
		if($('#pwd').val().length==0){
			alert('패스워드 확인!!!');
			$('#pwd').focus();
			return false;
		}
	});
});
</script>
</head>
<body>
<h1>로그인</h1>
<form action='${root}/login' method='post'>
아이디 : <input type='text' name='pid' id='pid' value="ssafy"><br>
패스워 : <input type="password" name='pwd' id='pwd' value="111"><br>
<input type="submit" value='Login'>
</form>
</body>
</html>