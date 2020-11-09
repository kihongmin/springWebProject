<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<!DOCTYPE HTML>
<!--
	Introspect by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
	<meta charset="utf-8" />
		<title>서영이와 현아의 행복한 우리집</title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="../assets/css/main.css" />
		
	</head>
	<body>

		<!-- Header -->
	<header id="header">
		<div class="inner">
			<a href="index.jsp" class="logo">Happy house for us</a>
			<nav id="nav">
				<% if(session.getAttribute("user")==null){ 
				%>
				<a href="login.jsp" id="nav_btn_login">LOGIN</a>
				<a href="signup.jsp" id="nav_btn_signup">SIGN UP</a>
				<%}else{ %>
				<a href="${root}/member.do?action=myInfo" id="nav_btn_mypage"><%= session.getAttribute("user")%>님!</a>
				<a href="${root}/member.do?action=logout" id="nav_btn_logout">LOGOUT</a>
				<%} %>
			</nav>
		</div>
	</header>
			<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

		<!-- Banner -->
			<section id="banner">
				<div class="inner">
		<!-- 서영	 --><h1>서영이와 현아의 행복한 우리집 : <span>아파트/주택 실거래 페이지</span></h1>
					<ul class="actions">
			<!-- 서영	 --><li><a href="list.jsp" class="button alt">매물 검색하러 가기</a></li>
					</ul>
				</div>
			</section>

		<!-- One -->
			<section id="one">
				<div class="inner">
					<header>
					<!-- 서영 -->
							<h3>관심지역 매물</h3>
					</header>
					<ul class="popular_menu_ul">
					<li class="popular_menu_li">
						<div class="menu_item">
							<div class="menu_item_img">
								<img src="../images/경희궁자이(3단지).jpg" alt=""/>
							</div>
							<div class="menu_item_info">경희궁자이(3단지)</div>
						</div>
					</li>
					<li class="popular_menu_li">
						<div class="menu_item">
							<div class="menu_item_img">
								<img src="../images/포레스트힐시티.jpg" alt=""/>
							</div>
							<div class="menu_item_info">포레스트힐시티</div>
						</div>
					</li>
					<li class="popular_menu_li">
						<div class="menu_item">
							<div class="menu_item_img">
								<img src="../images/CS타워.JPG" alt=""/>
							</div>
							<div class="menu_item_info">CS타워</div>
						</div>
					</li>
					<li class="popular_menu_li">
						<div class="menu_item">
							<div class="menu_item_img">
								<img src="../images/효성쥬얼리시티.JPG" alt=""/>
							</div>
							<div class="menu_item_info">효성쥬얼리시티</div>
						</div>
					</li>
				</ul>
				</div>
			</section>
			<section id="three">
				<div class="inner">
					<article>
						<div class="content">
						<!--  	<span class="icon fa-laptop"></span> -->
							<header>
							<!-- 서영	 -->
								<h3>광고</h3>
							</header>
							<img src="../images/광고.JPG" width=250 height=300>

						</div>
					</article>
					<article>
						<div class="content">
						<!--	<span class="icon fa-diamond"></span> -->
							<div class = "innercontent1">
							<header>
								<h4>분양이 처음이세요?</h4>
							</header>
							<!-- 서영 -->
							<a href="notice.jsp">공지사항</a>
							 | 
							<a href="FAQ.jsp">자주 묻는 질문</a>
							 | 
							<a href="guide.jsp">분양가이드</a>
							<br><br><br>
							</div>
							<div class = "innercontent2">
							<header>
								<h4>뉴스</h4>
							</header>
							<p>예정</p>
<!-- 							<ul class="actions">
								<li><a href="#" class="button alt">Learn More</a></li>
							</ul> -->
							</div>
						</div>
					</article>
					<article>
					<div class="content">
					<!--		<span class="icon fa-laptop"></span> -->
							<header>
								<h4>게시글</h4>
							</header>
							<div class = "board_list_head">
								<div class ="board_title">제목</div>
								<div class ="board_date">작성일</div>
								<div class="board_view">조회</div>
							</div>
							<div class = "board_list_body">
								<div class ="board_item">
									<div class ="board_title"><a href="#">안녕하세요. 분양은 처음입니다.</a></div>
									<div class ="board_date">20/09/21</div>
									<div class="board_view">12</div>
								</div>
								<div class ="board_item">
									<div class ="board_title"><a href="#">이 사이트 완전 좋아요! 이쁩니다!</a></div>
									<div class ="board_date">20/09/20</div>
									<div class="board_view">10</div>
								</div>
								<div class ="board_item">
									<div class ="board_title"><a href="#">집 갖고 싶어요 ㅠㅠㅠ</a></div>
									<div class ="board_date">20/09/19</div>
									<div class="board_view">5</div>
								</div>
							</div>
<!-- 							<p>Suspendisse mauris. Fusce accumsan mollis eros. Pellentesque a diam sit amet mi ullamcorper vehicula.</p> -->
<!-- 							<ul class="actions">
								<li><a href="#" class="button alt">Learn More</a></li>
							</ul> -->
						</div>
					</article>
				</div>
			</section>

		<!-- Footer -->
			<section id="footer">
				<div>footer~</div>
			</section>

		<!-- Scripts -->
			<script src="../assets/js/jquery.min.js"></script>
			<script src="../assets/js/skel.min.js"></script>
			<script src="../assets/js/util.js"></script>
			<script src="../assets/js/main.js"></script>

	</body>
</html>