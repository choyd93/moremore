<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 | more more</title>
<script src=https://code.jquery.com/jquery-3.6.0.min.js></script>
   	<link rel="stylesheet" href="resources/css/styles.css" type="text/css" />
	<!-- <script>
	
	 function join_btn() {
		 
		 var RegExp = /^[a-zA-Z0-9]{4,12}$/; // 아이디 유효성 검사 (비밀번호도)
		 var exptext = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/; // 이메일 유효성 검사
		 var nameExp = /^[가-힣]{2,4}|[a-zA-Z]{2,10}\s[a-zA-Z]{2,10}$/; // 이름 유효성 검사
		 var jumin = /^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$/; // 주민등록번호
		 
		var form = document.joinMemberShipForm
		if (!form.mid.value) {
			alert("아이디를 입력해주세요.");
			return;
		}
		
		// id값 4~12 자리 이내에 작성
		if (!RegExp.test(form.mid.value)) {
			alert("4~12자리 영문대소문자와 숫자로만 입력해주세요.");
			form.mid.value == "";
			return;
		}
		 
		// id와 비밀번호 값이 같을 경우
		if (form.mid.value == form.mpw.value) {
			alert("ID와 비밀번호가 같습니다. 다시 입력해주세요.");
			return ;
		}
		
		if (!form.mpw.value) {
			alert("비밀번호를 입력해주세요.");
			return;
		}
		
		if (!form.mpw_check.value) {
			alert("비밀번호를 한번 더 입력해주세요.");
			return;
		}
		
		if (form.mpw.value != form.mpw_check.value) {
			alert("비밀번호가 다릅니다. 다시 입력해주세요.");
			return;
		}
		
		if (!form.mname.value) {
			alert("이름을 입력해주세요.");
			return;
		}
		
		// 이름 형식이 다를경우(영어가 섞여있을 때 )
		if(nameExp.test(form.mname.value) == false) {
			alert("이름 형식이 맞지 않습니다. 다시 입력해주세요.");
			return;
		}
		
		if (!form.mphone.value) {
			alert("전화번호를 입력해주세요.");
			return;
		}
		if (!form.mjumin.value) {
			alert("주민등록번호를 입력해주세요.");
			return;
		}
		
		if (!jumin.test(form.mjumin.value)) {
			alert("주민등록번호 형식에 맞게 입력해주세요.");
			return;
		}
		
		if (!form.maddress.value) {
			alert("주소를 입력해주세요.");
			return;
		}
		
		if (!form.memail.value) {
			alert("이메일을 입력해주세요.");
			return;
		}
		if (exptext.test(form.memail.value) == false) {
			alert("이메일형식이 맞지 않습니다.");
			return;
		}
		
		
		
		form.submit();
	}  -->
</script>	 
</head>
<body>
    <div id="header">
      <!-- <img src="/images/Naver_Logotype.svg.png" width="200px" /> -->
      <h1 class="loginLogo">more<br>more</h1>
    </div>
    <form>
      <div id="joinContainerWrapper">
        <div class="joinContainer">
          <div class="row_group">
            <div>
              <h3><label class="join" for="id">아이디</label></h3>
              <span class="ps_box">
                <input
                  type="text"
                  id="id"
                  maxlength="20"
                  placeholder="아이디 입력" />
                  <span class="step_url">@more.com</span>
                  </span
              ><br />
              <span class="error"></span>
            </div>
            <div>
              <h3><label class="join" for="password">비밀번호</label></h3>

              <span class="ps_box">
                <input
                  type="password"
                  id="password"
                  placeholder="비밀번호(5~20자리)"
              /></span>
              <span class="error"></span>
            </div>
            <div>
              <h3>
                <label class="join" for="validatePassword"
                  >비밀번호 재확인</label
                >
              </h3>
              <span class="ps_box">
                <input
                  type="password"
                  id="validatePassword"
                  placeholder="비밀번호 재입력"
              /></span>
              <span class="error"></span>
            </div>
          </div>
          <div>
            <h3><label class="join" for="name">이름</label></h3>
            <span class="ps_box"
              ><input type="text" id="name" placeholder="이름 입력"/></span>
            <span class="error"></span>
          </div>
          <div class="join_birthday">
            <h3><label class="join" for="year">생년월일</label></h3>
            <div class="bir_wrap">
              <div class="bir_yy">
                <span class="ps_box">
                  <input
                    type="text"
                    placeholder="년(4자)"
                    id="year"
                    maxlength="4"
                  />
                </span>
              </div>
                <div class="bir_mm">
                  <span class="ps_box">
                    <select id="month" class="sel">
                      <option value="월" disabled>월</option>
                      <option value="1">1</option>
                      <option value="2">2</option>
                      <option value="3">3</option>
                      <option value="4">4</option>
                      <option value="5">5</option>
                      <option value="6">6</option>
                      <option value="7">7</option>
                      <option value="8">8</option>
                      <option value="9">9</option>
                      <option value="10">10</option>
                      <option value="11">11</option>
                      <option value="12">12</option>
                    </select>
                  </span>
                </div>
                <div class="bir_dd">
                  <span class="ps_box">
                    <input
                      type="text"
                      placeholder="일"
                      id="date"
                      maxlength="2"
                    />
                  </span>
                </div>
              </div>
              <span class="error"></span>
            </div>

            <div>
              <h3><label class="join sel" for="gender">성별</label></h3>
              <span class="ps_box">
                <select id="gender">
                  <option selected value="noneGender">성별</option>
                  <option value="man">남</option>
                  <option value="woman">여</option>
                  <option value="genderUnchecked">선택 안함</option>
                </select>
              </span>
              <span class="error"></span>
            </div>
            <div>
              <h3>
                <label class="join" for="email">본인 확인 이메일(선택)</label>
              </h3>
              <span class="ps_box">
                <input type="email" placeholder="선택입력" id="email" />
              </span>
            </div>
            <div id="mobDiv">
              <h3><label for="phone">휴대전화</label></h3>
              <span class="ps_box">
                <select class="sel" name="phone">
                  <option>대한민국 +82</option>
                </select></span>
              <div class="mobile_area" id="box_space">
              <span class="ps_box">
                <input type="tel" placeholder="전화번호 입력" id="phone" />
              </span>
              <a href="#" class="btn_verify btn_primary" id="btnSend" role="button">
                <span class>인증번호 받기</span>
              </a>
            </div>
              <div class="ps_box" id="box_space">
                <input
                  type="tel"
                  placeholder="인증번호를 입력하세요"
                  id="validatePhone"
                  maxlength="4"
                />
              </div>
              <span class="error"></span>
            </div>
            <div class="btn_area">
              <button type="button" id="btnJoin" class="btn_type btn_primary">
                <span>가입하기</span>
              </button>
            </div>
          </div>
        </div>
      </div>
    </form>
    <div id="joinFooter">@ moremore Corp.</div>
    <script>
 // 변수 선언
    const id = document.querySelector("#id");
    const password = document.querySelector("#password");
    const validatePassword = document.querySelector("#validatePassword");
    const name = document.querySelector("#name");
    const year = document.querySelector("#year");
    const month = document.querySelector("#month");
    const date = document.querySelector("#date");
    const gender = document.querySelector("#gender");
    const email = document.querySelector("#email");
    const phone = document.querySelector("#phone");
    const validatePhone = document.querySelector("#validatePhone");
    const error = document.querySelectorAll(".error");

    // 이벤트 리스너
    id.addEventListener("input", checkId);
    password.addEventListener("input", checkPassword);
    validatePassword.addEventListener("input", checkValidatePassword);
    name.addEventListener("input", checkName);
    year.addEventListener("input", checkBirth);
    month.addEventListener("input", checkMonth);
    date.addEventListener("input", checkDate);
    gender.addEventListener("input", checkGender);
    email.addEventListener("input", checkEmail);
    phone.addEventListener("input", checkPhone);
    validatePhone.addEventListener("input", checkValidatePhone);

    // 함수 작성
    function checkId() {
      const korPattern = /[a-zA-Z0-9_-]{5,20}/;
      if (id.value === "") {
        error[0].innerHTML = "아이디를 입력해주세요.";
        error[0].style.color = "red";
      } else if (!korPattern.test(id.value)) {
        error[0].innerHTML =
          "5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.";
        error[0].style.color = "red";
      } else if (korPattern.test(id.value)) {
        error[0].innerHTML = "";
        error[0].style.color = "red";
      }
    }

    function checkPassword() {
      const pwPattern = /[a-zA-Z0-9\[\]\{\}\/\(\)\.\?\<\>!@#$%^&*]{8,16}/;
      if (password.value === "") {
        error[1].innerHTML = "비밀번호를 입력해주세요.";
        error[1].style.color = "red";
      } else if (pwPattern.test(password.value)) {
        error[1].innerHTML = "";
      } else if (!pwPattern.test(password.value)) {
        error[1].innerHTML = "8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.";
        error[1].style.color = "red";
      }
    }

    function checkValidatePassword() {
      if (password.value == validatePassword.value) {
        error[2].innerHTML = "";
      } else if (password.value !== validatePassword.value) {
        error[2].innerHTML = "비밀번호가 일치하지 않습니다.";
        error[2].style.color = "red";
      }
    }

    function checkName() {
      const namePattern = /[a-zA-Zㄱ-ㅎ가-힣]/;
      if (namePattern.test(name.value)) {
        error[3].innerHTML = "";
        error[3].style.color = "red";
      } else if (!namePattern.test(name.value)) {
        error[3].innerHTML =
          "한글과 영문 대 소문자를 사용하세요. (특수기호, 공백 사용 불가)";
        error[3].style.color = "red";
      }
    }

    function checkBirth() {
      const yy = /[0-9]{4,4}/;
      if (yy.test(year.value)) {
        error[4].innerHTML = "";
      } else if (!yy.test(year.value)) {
        error[4].innerHTML = "생년월일을 다시 확인해주세요.";
        error[4].style.color = "red";
      }
    }

    // function checkMonth() {
    // }

    function checkDate() {
      const dd = /[0-9]{2,2}/;
      if (dd.test(date.value)) {
        error[4].innerHTML = "";
      } else if (!dd.test(date.value)) {
        error[4].innerHTML = "생년월일을 다시 확인해주세요.";
        error[4].style.color = "red";
      }
    }

    function checkGender() {
      if (gender.value == "noneGender") {
      }
    }

    function checkEmail() {
      const emailPattern =
        /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;
      if (emailPattern.test(email.value)) {
        error[6].innerHTML = "";
      } else if (!emailPattern.test(email.value)) {
        error[6].innerHTML = "이메일 주소를 다시 확인해주세요.";
      }
    }
    function checkPhone() {
      // const phonePattern = /\d{2,3}-\d{3,4}-\d{4}/g;
      const phonePattern = /[0-9]{3}-[0-9]{3}-[0-9]{4}/;
      if (phonePattern.test(phone.value)) {
        error[7].innerHTML = "";
      } else if (!phonePattern.test(phone.value)) {
        error[7].innerHTML = "인증이 필요합니다.";
      }
    }
    // function checkValidatePhone() {}

    </script>
  </body>
</html>