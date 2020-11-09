<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>도서목록</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

<table border=1>
<tr>
<th colspan="7" align="right">
<form action="${root}/userList" method="get">
	<select name="searchField">
		<option value="ID">아이디</option>
		<option value="PASSWORD">비밀번호</option>
		<option value="NAME">이름</option>
		<option value="BIRTH">생일</option>
		<option value="PHONE">전화번호</option>
		<option value="EMAIL">메일</option>
		<option value="ADDRESS">주소</option>
		
	</select> 
	<input type="text" name="searchText"> 
	<input type="submit" value="검색">
</form>
</th>
</tr>
<tr>
<td>아이디</td><td>비밀번호</td><td>이름</td><td>생일</td><td>전화번호</td><td>메일</td><td>주소</td>
</tr>

<c:choose>
	<c:when test="${empty users}">
			<tr>
			<td colspan='7'>입력된 도서정보가 없습니다</td>
			</tr>
	</c:when>
	<c:otherwise>
		<c:forEach var="user" items="${users}">
			<tr>
			<td>${user.id}</td>
			<td>${user.password}</td>
			<td>${user.name}</td>
			<td>${user.birth}</td>
			<td>${user.phone}</td>
			<td>${user.email}</td>
			<td>${user.address}</td>
			</tr>
		</c:forEach>
	</c:otherwise>
</c:choose>
</table>
<div id='result' style='color:red'></div>
</body>
</html>