<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.spring.more.common.Paging"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>펀딩관리자 | more more</title>
   	<link rel="stylesheet" href="resources/css/styles.css" type="text/css" />
</head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
      $(document).ready(function () {
        console.log("getJSONDealHistoryList 실행~~~ ");
        
        var link = document.location.href;
        console.log("link : " + link );
        
        getJSONDealHistoryList();
       
      });
      
      function getJSONDealHistoryList() {
        console.log(">> getJSONNotice() 실행~~~");

        $.ajax("csController?category=notice", {
          type: "get",
          dataType: "json", 
          success: function (data) {
        	  const list = data["list"];
              const plist = data["plist"];
              console.log(data); 
              console.log("list : " + list); 
              console.log(list); 
              console.log(plist); 
              const begin = plist[0].Begin;
              var cPage = plist[0].BeginPage;
              var cPagePrev = plist[0].BeginPage - 1;
              var cPageNext = plist[0].BeginPage + 1;
              console.log("begin : " + begin); 
              console.log("cPage : " + cPage); 
              console.log("cPagePrev : " + cPagePrev); 
              console.log("cPageNext : " + cPageNext); 
            
            // 데이터 넣기 전 공백으로 초기화 
            $("#noticeList").html("");
            
            var result = "";
            $.each(list, function(index, item){
		             result += "<tr>";
		             result += "<td>" + item.rnum + "</td>";
		           	 result += "<td>";
		           	 result += "<a href='"+"noticeOne.jsp?ccategory="+item.ccategory+"&page="+1+"&rnum="+item.rnum+"'>";
	             	 result += item.csubject + "</td>";
		             result += "<td>" + item.crdate + "</td>";
		             result += "</tr>";
         	});
            console.log("result : " + result);
            $("#noticeList").html(result);
            
            var page = "";
            page += "<tr>"
            page += "<td colspan='3'>"
            
            // 이전으로에 대한 사용여부 처리
            if(plist[0].Begin == 1){
         	  page += "<button type='button' class='pageBtn paging' disabled>이전으로</button>"
            }else {
        	  page += "<button type='button' class='pageBtn paging' onclick=javascript:location.href=inquire.jsp?cPage="+(cPagePrev)+">이전으로</button>"
            }
            
            // 블록내에 표시할 페이지 태그 작성(시작페이지~끝페이지)
            for(var i = plist[0].BeginPage; i <= plist[0].EndPage; i++){
          	  if(i == plist[0].NowPage){
      	  			page += "<button type='button' class='pageBtn pageNow paging'>"+i+"</button>"
          	  }else {
          		  	page += "<button type='button' class='pageBtn paging' onclick=javascript:location.href=inquire.jsp?cPage="+i+">"+i+"</button>"
          	  }
            }
            // [다음으로]에 대한 사용여부 처리
            if(plist[0].EndPage <= plist[0].TotalPage){
          	  page += "<button type='button' class='pageBtn paging' onclick=javascript:location.href=notice.jsp?cPage="+(cPageNext)+">다음으로</button>"
            }else if(plist[0].EndPage >= plist[0].TotalPage){
          	  page += "<button type='button' class='pageBtn paging' disabled>다음으로</button>"
            }
            page +="</ol>"
            page +="</td>"
            page +="</tr>"
            
            console.log("page : " + page);
            $("#pageBlock").html(page);
            
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
      
    </script>
<body>
	<%@include file="adminHeader.jsp" %>
	<div class="adminContainerWrapper">
		<div class="adminContainerLeft">
			<ul class="adminLeftMenu">
				<li class="adminMenuItem"><a href="#">메인</a></li>
				<li class="adminMenuItem"><a href="#">펀딩 준비</a></li>
				<li class="adminMenuItem"><a href="#">펀딩 관리</a></li>
				<li class="adminMenuItem"><a href="#">결제 현황</a></li>
				<li class="adminMenuItem"><a href="#">문의 관리</a></li>
			</ul>
		</div>
		<div class="adminContainerRightWrapper">
			<div class="adminContainerRight">
				<div class="adminLocationArea">
					<h8>대시보드</h8>
				</div>
				<div class="adminContainerContent">
					<div class="fundingAdminContainerLeftContentArea">
						<div class="fundingAdminContainerContentHeader" style="height: 300px;">
							<p class="adminContentTitle">#총 매출액</p>
						</div>
						<div class="fundingAdminContainerContentHeader" style="height: 100px">
							<div>
								<ul class="adminContentInfoList">
									<li class="adminContentInfoItem">#판매 건수</li>
									<li class="adminContentInfoItem blueItem">213건</li>
									<li class="adminContentInfoItem">#주별 판매 금액</li>
									<li class="adminContentInfoItem blueItem">121,000원</li>
									<li class="adminContentInfoItem">#월별 판매금액</li>
									<li class="adminContentInfoItem blueItem">232,200원</li>
								</ul>
							</div>
						</div>
						<div class="fundingAdminContainerContentHeader"  style="height: 300px;" >
							<p class="adminContentTitle"">#최근 거래내역</p>
							<div id="fundingAdminMainArea">
						    <div class="fundingAdminMainContent">
						      <table class="fundingAdmintableContent">
						        <thead>
						          <tr>
						            <th>구매일시</th>
						            <th>회원번호</th>
						            <th>결제금액</th>
						            <th>상태</th>
						          </tr>
						        </thead>
						        <tbody id="fundingAdminList">
						        </tbody>
						        <tfoot id="pageBlock">
						        </tfoot>
						      </table>
						    </div>
						  </div>
						</div>
					</div>
					<div class="fundingAdminContainerRightContentArea">
						<div class="fundingAdminContainerContentHeader" style="height: 200px;">
							<div>
								<h3 style="text-align: center; padding-top:40px;">금일 매출 현황</h3>
								<h1 class="blueItem" style="text-align: center;">225,000원</h1>
							</div>
						</div>
						<div class="fundingAdminContainerContentHeader" style="height: 200px;">
							<p class="adminContentTitle">#인기 판매</p>
						</div>
						<div class="fundingAdminContainerContentHeader" style="height: 200px;">
							<p class="adminContentTitle">#판매자 성비 현황</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>