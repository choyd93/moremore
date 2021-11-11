<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>moremore - 검색 결과</title>
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
        
        var keyword = "<c:out value='${keyword}'/>";
        console.log("keyword : " + keyword );
                
        getJSONSearchItemList(keyword);
        
     	});
 
	   // 해시태그 버튼 클릭 시 변경 상태
	      function getJSONSearchItemList(keyword) {
	          console.log(">> getJSONSearchItemList() 실행~~~");
	          console.log("keyword : " + keyword);
	
	          $.ajax("searchItemList.do?keyword=" + keyword, {
	            type: "get",
	            dataType: "json", 
	            contentType: "application/json; UTF-8;",
	         
	            success: function (data) {
	          	  var result = data.json;
	              console.log("함수 실행~~~");
	              
	              // 데이터 넣기 전 공백으로 초기화 
	              $("#projectSearchItmeList").html("");
	              
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
	              $("#projectSearchItmeList").html(result);
	              
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
		<h3 class="fundingProjectPageTitle"> ${keyword} 검색 결과</h3>
	</div>
	<div id="containerWrapper">
		<div class="container" style="margin-bottom: 300px;">
			
			<div class="projectWrapper">
				<ul id="projectSearchItmeList" class="projectCard">
				</ul>
			</div>	
			</div>
		</div>
	<%@include file="homeFooter.jsp" %>
</body>
</html>
