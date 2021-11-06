<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<header class="header-wrapper greenColor">
		<div class="header-contaniner" id="headerContainerId">
			<h4 class="headerLogo">
				<a href="#" class="headerLogo purple">
				<span >more more!</span>
				</a>
			</h4>
			<div class="headerMenuArea">
				<ul class="headerMenu">
					<li class="headerMenuItem middleSize" id="headerMenuFunding"><a href=#>펀딩하기</a></li>
					<li class="headerMenuItem middleSize" id="headerMenuBuy"><a href=#>구매하기</a></li>
					<li class="headerMenuItem middleSize" id="headerMenuGuide"><a class="headerMenuHidden" href=#>이용가이드</a></li>
					<button type="button" class="projectItem">프로젝트 신청</button>
					<li class="headerMenuItem moreItem headerMenuHidden"><a class="headerMenuHidden" href=#>더보기</a></li>
				</ul>
			</div>
			<div class="headerUtil">
				<input type="search" class="searchBar" placeholder="프로젝트 검색하기"/>
				<button type="button" class="noneBtn" onclick="javascript:location.href='login.jsp'">로그인</button>
				<button type="button" class="noneBtn" onclick="javascript:location.href='joinMembership.jsp'">회원가입</button>
			</div>
		</div>
	</header>