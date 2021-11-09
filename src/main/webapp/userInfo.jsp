<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이 페이지</title>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, maximum-scale=1.0, minimum-scale=1, user-scalable=yes,initial-scale=1.0" />
   	<link rel="stylesheet" href="resources/css/styles.css" type="text/css" />
</head>
<body>
	<%@include file="homeHeader.jsp" %>
	<div class="adminContainerWrapper">
		<div class="myPageContainerLeft">
			<ul class="myPageLeftMenu">
				<li class="adminMenuItem"><a href="userInfo.jsp">메인</a></li>
				<li class="adminMenuItem"><a href="userInfoValidate.jsp">My 회원 정보</a></li>
				<li class="adminMenuItem"><a href="#">관심 프로젝트</a></li>
				<li class="adminMenuItem"><a href="withdrawal.jsp">회원 탈퇴</a></li>
			</ul>
		</div>
		<div class="adminContainerRightWrapper">
			<div class="adminContainerRight">
				<div class="myPageLocationArea"">
					<h8>마이 페이지</h8>
				</div>
				<div class="adminContainerContentArea">
					<div class="adminContainerContentHeader">
						<ul class="myPageHeaderMenu">
							<li class="myPageHeaderMenuItem"><a href="#">24</a></li>
							<li class="myPageHeaderMenuItem"><a href="#">5</a></li>
							<li class="myPageHeaderMenuItem"><a href="#">10</a></li>
						</ul>
						<ul class="myPageHeaderMenu">
							<li class="myPageHeaderMenuItemTitle"><a href="#">제작 펀딩</a></li>
							<li class="myPageHeaderMenuItemTitle"><a href="#">참여 펀딩</a></li>
							<li class="myPageHeaderMenuItemTitle"><a href="#">구매</a></li>
						</ul>
					</div>
					<div class="adminContainerContent">
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="homeFooter.jsp" %>
</body>
</html>