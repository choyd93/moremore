<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>moremore - 크라우드 펀딩</title>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, maximum-scale=1.0, minimum-scale=1, user-scalable=yes,initial-scale=1.0" />
	<link rel="shortcut icon" href="#">
   	<link rel="stylesheet" href="resources/css/styles.css" type="text/css" />
   	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
      $(document).ready(function () {
        console.log("home 실행");
        
        var link = document.location.href;
        console.log("link : " + link );
        
        getJSONHome();
       
      });

      function getJSONHome() {
        console.log(">> getJSONHome() 실행~~~");

        $.ajax("projectItemList.do", {
          type: "post",
          dataType: "json", 
          contentType: "application/json; UTF-8;",
       
          success: function (data) {
        	  var result = data.json;
        	  /* const list = data["list"];
              const plist = data["plist"]; */
              console.log("함수 실행~~~");
              console.log(data);
              console.log(JSON.stringify(data))
              
              console.log(result);
              /* console.log("list : " + list); 
              console.log(list); 
              console.log(plist);  */
            
            // 데이터 넣기 전 공백으로 초기화 
            $("#projectList").html("");
            
            var result = "";
            $.each(data, function(index, item){
	          	 console.log(index + " " + item.pro_stitle);
	             result += "<li class='projectCardItem'>";
	             result += "<div class='projectThumbnailWrapper'>";
	             result += "<img class='projectThumbnail' src='" + item.pro_thumbnail_path + "'></div>";
	             result += "<div class='projectContent'>";
	             result += "<p>" + item.pro_stitle + "</p>";
	             result += "<span class='projectAchievementRate'> 달성</span>";
	             result += "<span class='greyColor'>" + item.pro_gprice + "</span>";
	             result += "<span class='greyColor floatRight'>" + item.pro_close_dt + "</span></div></li>";
         	});
            console.log("result : " + result);
            $("#projectList").html(result);
            
          },
          error: function (request, status, error) {
        	  console.log("Ajax 처리 실패, " + "\n" +
                      "code : " + request.status + "\n" +
                      "message : " + request.responseText + "\n" +
                      "error : " + error)
            alert(
              "Ajax 처리 실패, " + "\n" +
                "code : " + request.status + "\n" +
                "message : " + request.responseText + "\n" +
                "error : " + error
            );
          },
        });
      }
      
    </script>
</head>
<body>
	<%@include file="homeHeader.jsp" %>
	<!-- <div class="lightPink" id="headerSlide"> -->
		<img id="headerSlide" src="https://image.hago.kr/mall/display/mmon-templates/6/51/689/pc_image_1.jpg?ut=2021-11-05 18:08:53">
		<!-- <img id="headerSlide" src="https://cdn.wadiz.kr/ft/images/green001/2021/1029/20211029103938521_4215.png/wadiz/optimize"> -->
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
			<div>
				<h3>인기 프로젝트</h3>
				<div class="projectWrapper">
					<ul id="projectList" class="projectCard">
					</ul>
				</div>				
			</div>
			<div class="">
				<h3 style="margin-top:120px;">이 프로젝트 어때요?</h3>

				<div class="projectWrapper">
				<ul class="projectCard">
					<li class="projectCardItem">
						<div class="projectThumbnailWrapper">
						<img class="projectThumbnail" src="https://cdn.wadiz.kr/wwwwadiz/green001/2021/0827/20210827140222871_125371.jpg/wadiz/format/jpg/quality/80/optimize"></div>
						<div class="projectContent">
							<p>자연유래성분 97%, 하루1분투자,피부고민해결! 프랑스와즈 기능성 앰플</p>
							<span class="projectAchievementRate">418% 달성</span>
							<span class="greyColor">4,182,200원</span>
							<span class="greyColor floatRight">17일 남음</span>
						</div>
					</li>
					<li class="projectCardItem">
						<div class="projectThumbnailWrapper">
						<img class="projectThumbnail" src="https://cdn.wadiz.kr/wwwwadiz/green001/2021/0726/20210726190305750_122835.png/wadiz/format/jpg/quality/80/optimize"></div>
						<div class="projectContent">
							<p>탄산수는 기본, 모든 음료에 탄산을 넣는 폴바셋X딜라이트 탄산수 제조기</p>
							<span class="projectAchievementRate">342% 달성</span>
							<span class="greyColor">10,673,700원</span>
							<span class="greyColor floatRight">12일 남음</span>
						</div>
					</li>
					<li class="projectCardItem">
						<div class="projectThumbnailWrapper">
						<img class="projectThumbnail" src="https://cdn.wadiz.kr/wwwwadiz/green001/2021/1012/20211012095214421_130079.jpg/wadiz/format/jpg/quality/80/optimize"></div>
						<div class="projectContent">
							<p>[캠핑의 재해석] 황동, 크롬 LED 랜턴과 자바라 화로테이블</p>
							<span class="projectAchievementRate">222% 달성</span>
							<span class="greyColor">5,225,300원</span>
							<span class="greyColor floatRight">15일 남음</span>
						</div>
					</li>
					<li class="projectCardItem">
						<div class="projectThumbnailWrapper">
						<img class="projectThumbnail" src="https://cdn.wadiz.kr/wwwwadiz/green001/2021/1012/20211012095214421_130079.jpg/wadiz/format/jpg/quality/80/optimize"></div>
						<div class="projectContent">
							<p>[캠핑의 재해석] 황동, 크롬 LED 랜턴과 자바라 화로테이블</p>
							<span class="projectAchievementRate">222% 달성</span>
							<span class="greyColor">5,225,300원</span>
							<span class="greyColor floatRight">15일 남음</span>
						</div>
					</li>
				</ul>
				</div>
				
			</div>
			<div class="projectStatusBanner">
				<p style="font-size: 15px;">오늘 이만큼 참여하셨어요!</p>
			</div>
			<div class="containerHashTagArea">
				<ul class="containerHashTagMenu">
					<li class="hashTagBtn"><a href="#">#뷰티</a></li>
					<li class="hashTagBtn"><a href="#">#반려동물</a></li>
					<li class="hashTagBtn"><a href="#">#친환경</a></li>
				</ul>
			</div>
			<div class="projectWrapper">
				<ul class="projectCard">
					<li class="projectCardItem">
						<img class="projectThumbnail" src="https://cdn.wadiz.kr/wwwwadiz/green001/2021/0827/20210827140222871_125371.jpg/wadiz/format/jpg/quality/80/optimize"></span>
						<div class="projectContent">
							<p>자연유래성분 97%, 하루1분투자,피부고민해결! 프랑스와즈 기능성 앰플</p>
							<span class="projectAchievementRate">418% 달성</span>
							<span class="greyColor">4,182,200원</span>
							<span class="greyColor floatRight">17일 남음</span>
						</div>
					</li>
					<li class="projectCardItem">
						<img class="projectThumbnail" src="https://cdn.wadiz.kr/wwwwadiz/green001/2021/0726/20210726190305750_122835.png/wadiz/format/jpg/quality/80/optimize"></span>
						<div class="projectContent">
							<p>탄산수는 기본, 모든 음료에 탄산을 넣는 폴바셋X딜라이트 탄산수 제조기</p>
							<span class="projectAchievementRate">342% 달성</span>
							<span class="greyColor">10,673,700원</span>
							<span class="greyColor floatRight">12일 남음</span>
						</div>
					</li>
					<li class="projectCardItem">
						<img class="projectThumbnail" src="https://cdn.wadiz.kr/wwwwadiz/green001/2021/1012/20211012095214421_130079.jpg/wadiz/format/jpg/quality/80/optimize"></span>
						<div class="projectContent">
							<p>[캠핑의 재해석] 황동, 크롬 LED 랜턴과 자바라 화로테이블</p>
							<span class="projectAchievementRate">222% 달성</span>
							<span class="greyColor">5,225,300원</span>
							<span class="greyColor floatRight">15일 남음</span>
						</div>
					</li>
					<li class="projectCardItem">
						<img class="projectThumbnail" src="https://cdn.wadiz.kr/wwwwadiz/green001/2021/1012/20211012095214421_130079.jpg/wadiz/format/jpg/quality/80/optimize"></span>
						<div class="projectContent">
							<p>[캠핑의 재해석] 황동, 크롬 LED 랜턴과 자바라 화로테이블</p>
							<span class="projectAchievementRate">222% 달성</span>
							<span class="greyColor">5,225,300원</span>
							<span class="greyColor floatRight">15일 남음</span>
						</div>
					</li>
				</ul>
				</div>
			<div class="projectStartBanner">
				<p>좋은 아이디어가 있으신가요?</p>
				<h4>지금바로 펀딩 프로젝트를 만들어서 참여해보세요!</h4> 
				<button class="blackBtn" type="button">바로 가기</button>
			</div>
			</div>
		</div>
	<%@include file="homeFooter.jsp" %>
</body>
</html>
