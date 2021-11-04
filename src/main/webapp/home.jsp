<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>moremore - 크라우드 펀딩</title>
	<meta charset="UTF-8" />
	<link rel="shortcut icon" href="#">
   	<link rel="stylesheet" href="resources/css/styles.css" type="text/css" />
</head>
<body>
	<header class="header-wrapper greenColor">
		<div class="header-contaniner">
			<h4 class="headerLogo">
				<a href="#" class="headerLogo">
				<span >more more</span>
				</a>
			</h4>
			<div class="headerMenuArea">
				<ul class="headerMenu">
					<li class="headerMenuItem middleSize"><a href=#>펀딩하기</a></li>
					<li class="headerMenuItem middleSize"><a href=#>구매하기</a></li>
					<li class="headerMenuItem middleSize"><a href=#>이용가이드</a></li>
					<button type="button" class="projectItem">프로젝트 신청</button>
					<li class="headerMenuItem moreItem"><a href=#>더보기</a></li>
				</ul>
			</div>
			<div class="headerUtil">
				<input type="search" id="" placeholder="프로젝트 검색하기"/>
				<button type="button" class="noneBtn" onclick="javascript:location.href='login.jsp'">로그인</button>
				<button type="button" class="noneBtn" onclick="javascript:location.href='joinMembership.jsp'">회원가입</button>
			</div>
		</div>
	</header>
	<div id="headerSlide">
	</div>
	<div id="containerWrapper">
		<div class="container">
			<div class="projectInfoBannerHome">
				<div class="projectInfoBannerMenuWrapper">
					<ul class="projectInfoBannerMenu centerItemTop">
						<li class="projectInfoItemTop"><a href="#">123</a></li>
						<li class="projectInfoItemTop"><a href="#">8,723,400</a></li>
						<li class="projectInfoItemTop"><a href="#">723</a></li>
					</ul>
				</div>
				<div class="projectInfoBannerMenuWrapper">
				<ul class="projectInfoBannerMenu centerItemBottom">
					<li class="projectInfoItemBottom"><a href="#">총 펀딩 프로젝트</a></li>
					<li class="projectInfoItemBottom"><a href="#">총 펀딩 금액</a></li>
					<li class="projectInfoItemBottom"><a href="#">참여 서포터 수</a></li>
				</ul>
				</div>
			</div>
			<h3>인기 프로젝트</h3>
			<div class="projectThumbnail">
			</div>
			<h3>이 프로젝트 어때요?</h3>
			<div class="projectThumbnail">
			</div>
			<div class=""></div>
			<div class="projectStatusBanner">
				<p style="font-size: 15px;">오늘 이만큼 참여하셨어요!</p>
			</div>
			<div class="containerHashTagArea">
				<ul class="containerHashTagMenu">
					<li class="hashTagBtn"><a href="#">#뷰티</a></li>
					<li class="hashTagBtn"><a href="#">#반려동물</a></li>
					<li class="hashTagBtn"><a href="#">#친환경</a></li>
				</ul>
				<div class="projectThumbnail">
				</div>
			</div>
			<div class="projectStartBanner">
				<p>좋은 아이디어가 있으신가요?</p>
				<h4>지금바로 프로젝트를 만들어서 참여해보세요!</h4> 
			</div>
		</div>
		
	</div>
	<footer id="footer">
      <div class="infoArea">
        <div class="footerMenuArea">
          <ul class="footerMenu">
            <li>회사소개</li>
            <li>이용약관</li>
            <li>개인정보처리방침</li>
          </ul>
        </div>
        <div class="footerArea">
         <img src="./image/logo.png"  style="display:inline; width : 150px;" />
          <div class="footerRight">
            <ul class=footerList>
              <li><h4>모아모아</h4></li> 
              <li>대표이사 : 모아모아</li>
              <li>
                주소 (우) 010101 서울특별시 비트로 999-1 비트캠프
              </li>
              <li>
                고객지원센터 : 1588-1111 
              </li>
              <li class="COPYRIGHT">COPYRIGHTⓒ moremore</li>
            </ul>
          </div>
        </div>
      </div>
    </footer>
</body>
</html>
