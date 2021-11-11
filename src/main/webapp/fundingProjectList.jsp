<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>moremore - 펀딩 리스트</title>
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
        
        getJSONHashTagList(); 
        
          $("#hashTagBeauty").on("click", function () {
            console.log("hashTagBeauty 실행~~");
        	  var cate = "cate=1";
        	  getJSONHashTagItemCateList(cate);
          })
          
    	  $("#hashTagAnimal").on("click", function () {
            console.log("hashTagAnimal 실행~~");
    		  var cate = "cate=2";
    		  getJSONHashTagItemCateList(cate);
          })
          
    	  $("#hashTagFood").on("click", function () {
            console.log("hashTagFood 실행~~");
    		  var cate = "cate=3";
    		  getJSONHashTagItemCateList(cate);
    	  	})
        
     	 });
      
      // 메인페이지에서 해시태그 공간 기본 상태
      function getJSONHashTagList() {
          console.log(">> hashTagItemList() 실행~~~");

          $.ajax("hashTagItemList.do", {
            type: "post",
            dataType: "json", 
            contentType: "application/json; UTF-8;",
         
            success: function (data) {
          	  var result = data.json;
                console.log("함수 실행~~~");
              
              // 데이터 넣기 전 공백으로 초기화 
              $("#projectHashTagList").html("");
              
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
              $("#projectHashTagList").html(result);
              
            },
            error: function (request, status, error) {
          	 
              alert(
                "Ajax 처리 실패, " + "\n" +
                  "code : " + request.status + "\n" +
                  "message : " + request.responseText + "\n" +
                  "error : " + error
              );
            },
          });
        }
      
	   // 해시태그 버튼 클릭 시 변경 상태
	      function getJSONHashTagItemCateList(cate) {
	          console.log(">> getJSONHashTagItemCateList() 실행~~~");
	          console.log("cate : " + cate);
	
	          $.ajax("hashTagItemCateList.do?" + cate, {
	            type: "get",
	            dataType: "json", 
	            contentType: "application/json; UTF-8;",
	         
	            success: function (data) {
	          	  var result = data.json;
	                console.log("함수 실행~~~");
	              
	              // 데이터 넣기 전 공백으로 초기화 
	              $("#projectHashTagList").html("");
	              
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
	              $("#projectHashTagList").html(result);
	              
	            },
	            error: function (request, status, error, data) {
	          	 
	              alert(
	                "Ajax 처리 실패, " + "\n" +
	                  "code : " + request.status + "\n" +
	                  "message : " + request.responseText + "\n" +
	                  "error : " + error +
	                  "data : " + data
	              );
	            },
	          });
	        }
    </script>
</head>
<body>
	<%@include file="homeHeader.jsp" %>
	<!-- <div class="lightPink" id="headerSlide"> -->
	<div id="projectCate">
		<h3 class="fundingProjectPageTitle">펀딩에 참여하고 리워드를 받아요!</h3>
		<div class="containerHashTagArea">
			<ul class="containerHashTagMenu" style="padding-left: 300px;">
				<li class="fundingHashTagBtn" id="hashTagAll"><a>전체</a></li>
				<li class="fundingHashTagBtn" id="hashTagBeauty"><a>뷰티</a></li>
				<li class="fundingHashTagBtn" id="hashTagAnimal"><a>반려동물</a></li>
				<li class="fundingHashTagBtn" id="hashTagFood"><a>푸드</a></li>
				<li class="fundingHashTagBtn" id="hashTagTag"><a>테크</a></li>
				<li class="fundingHashTagBtn" id="hashTagTravel"><a>여행</a></li>
				<li class="fundingHashTagBtn" id="hashTagHomeLiving"><a>홈리빙</a></li>
			</ul>
		</div>
	</div>
	<div id="containerWrapper">
		<div class="container" style="margin-bottom: 300px;">
			
			<div class="projectWrapper" id="">
				<ul id="projectHashTagList" class="projectCard">
				</ul>
			</div>	
			</div>
		</div>
	<%@include file="homeFooter.jsp" %>
</body>
</html>
