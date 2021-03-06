<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>My! Happy! House!</title>

<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<link
	href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i"
	rel="stylesheet">

<link href="css/one-page-wonder.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="js/house.js"></script>
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
	<section>
	<form action='${root}/changeUser' method='post'>
						<input type="hidden" name='action' value='register'>
		<div id="signupContent" style="display: block">
		<div class="container p-3 my-0"><h1>Join Member</h1></div>
		<div class="container p-3 mt-0 mb-3 border grid">
			<div class="form-group">
			  <label for="ID">ID (* 20자 이내)</label>
			  <input type="text" class="form-control" id="ID" name="id" placeholder="ID">
			</div>
			
			<div class="form-group">
			  <label for="Password">Password (* 20자 이내)</label>
			  <input type="password" class="form-control" id="Password" name="password" placeholder="Password">
			</div>
			
			<div class="form-group">
			  <label for="Confirm">Password Confirm (* 20자 이내)</label>
			  <input type="password" class="form-control" id="Confirm" placeholder="Password">
			</div>
			
			<div class="form-group">
			  <label for="Name">Name (* 10자 이내)</label>
			  <input type="text" class="form-control" id="Name" name="name" placeholder="Name">
			</div>
			
			<div class="form-group">
			  <label for="Birth">BirthDay (* 20자 이내)</label>
			  <input type="text" class="form-control" id="Birth" name="birth" placeholder="1993-10-25">
			</div>
			
			<div class="form-group">
			  <label for="CellPhone">CellPhone (* 20자 이내)</label>
			  <input type="text" class="form-control" id="CellPhone" name="phone" placeholder="01055557777">
			</div>
			
			<div class="form-group">
			  <label for="Email">email (* 20자 이내)</label>
			  <input type="text" class="form-control" id="Email" name="email" placeholder="hongildong@naver.com">
			</div>
			
			<div class="form-group">
			  <label for="Address">Address (50자 이내)</label>
			  <input type="text" class="form-control" id="Address2" name="address" placeholder="주소 상세">
			</div>
			
			<button type="submit" class="btn btn-primary btn-block" id="joinbtn">JOIN IN</button>		
		</div>
		</div>
		</form>
  </section>

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
