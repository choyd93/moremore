<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이 페이지 </title>
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
				<li class="adminMenuItem"><a href="myPageUserInfo.jsp">My 회원 정보</a></li>
				<li class="adminMenuItem"><a href="#">관심 프로젝트</a></li>
				<li class="adminMenuItem"><a href="#">회원 탈퇴</a></li>
			</ul>
		</div>
		<div class="adminContainerRightWrapper">
			<div class="adminContainerRight">
				<div class="myPageLocationArea"">
					<h8>My 회원 정보</h8>
				</div>
				<div class="adminContainerContentArea">
					<div >
						<form action="modifyMmeber" method="post" id="modifyMmeberForm" name="modifyMmeberForm">
						  <div class="modifyMmeberForm">
						      <table id="prodItems"  style="position: relative; top : 10px; left:50px; width:500px;">
						        <tr>
						        <td colspan="2"><h2 class="myPageUserInfo">회원정보</h2></td>
						        </tr>
						        
						        <tr>
						          <td><label>이름<span style="color: red"></span></label></td>
						          <td><input type="text" name="mname" id="mname"  class="addr_box" required="required" value=${loginUsers.user_name } readonly></td>
						        </tr>
						        <%-- <tr>
							     <td>
							          <label>생년월일<span style="color: red">*</span></label>
							     </td>
							    <td> 
						          <input type="text" name="mjumin" id="mjumin" class="formControl"  required="required" value=${loginUsers.user_birthday } readonly>
						        </td>
						        </tr> --%>
						        <tr>
						        <td>
						          <label>아이디<span style="color: red"></span></label></td>
						        <td>
						          <input type="text" name="mid" id="mid" class="addr_box" required="required" value="${loginUsers.user_id }" readonly >
						        </td>
						        </tr>
						        <tr>
						        <td>
						          <label>신규비밀번호<span style="color: red">*</span></label>
						        </td>
						        <td>
						        <input type="password" name="mpw" id="mpw" class="addr_box" required="required"  maxlength="12" placeholder="비밀번호(5~20자리)">
						        </td>
						         </tr>
						         <tr>
						         <td>
						          <label>신규비밀번호확인<span style="color: red">*</span></label></td>
						          <td><input  type="password" name="mpw_check" id="mpw_check" class="addr_box" required="required" onclick="confirm_pw()"  maxlength="12" placeholder="비밀번호 확인"></td>
						        </tr>
						        <tr>
						        <td>
						          <label>휴대폰번호<span style="color: red">*</span></label></td>
						          <td><input type="text" name="mphone" id="mphone" class="addr_box" required="required" value=${loginUsers.user_phone }  maxlength="13" onkeyup="inputPhoneNumber(this);">
						        </td>
						        </tr>
						        <tr>
								<td>	
						          <label>이메일<span style="color: red">*</span></label></td>
						          <td><input type="text" name="memail" id="memail" class="addr_box" value=${loginUsers.user_email } required="required"></td>
						        </tr>
							    </table>
							    <dl class="addrArea">
							    	<dt>
						       			<label>주소<span style="color: red">*</span></label>
						       		</dt>
						       		<dd style="margin-left: 110px;">
										<input class="d_btn" type="button" onclick="FindAddrDaumPostcode()" value="우편번호 찾기">
						            	<input type="text" id="userPostcode" name="user_address" class="addr_box" placeholder="우편번호">
										<input type="text" id="userAddress" name="user_address_number" class="addr_box" placeholder="주소">
										<input type="text" id="userDetailAddress" class="addr_box"  placeholder="상세주소">
									</dd>	             
						        </dl>
						    </div>
						    <div class="modifyMmeberEnd">
							    <input type="button" class="d_btn" value="수정완료" onclick="modify_btn()">
					        </div>
						    <input type="hidden" name="mpoint" id="mpoint" value="0">
					        <input type="hidden" name="mcumulative_buy" id="mcumulative_buy" value="0">
					        <input type="hidden" name="mjoindate" id="mjoindate"value="SYSDATE"> 
					        <input type="hidden" name="mclass" id="mclass" value="0">
					    </form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="homeFooter.jsp" %>
	 <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script>
	function FindAddrDaumPostcode() {
	    new daum.Postcode({
	        oncomplete: function(data) {
	            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
	
	            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
	            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
	            var addr = ''; // 주소 변수
	
	            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
	            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
	                addr = data.roadAddress;
	            } else { // 사용자가 지번 주소를 선택했을 경우(J)
	                addr = data.jibunAddress;
	            }
	
	            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
	            if(data.userSelectedType === 'R'){
	                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
	                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
	                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
	                }
	                // 건물명이 있고, 공동주택일 경우 추가한다.
	                if(data.buildingName !== '' && data.apartment === 'Y'){
	                }
	            } 
	            
	            // 우편번호와 주소 정보를 해당 필드에 넣는다.
	            document.getElementById('userPostcode').value = data.zonecode;
	            document.getElementById("userAddress").value = addr;
	            // 커서를 상세주소 필드로 이동한다.
	            document.getElementById("userDetailAddress").focus();
	        }
	    }).open();
	}
	</script>
</body>
</html>