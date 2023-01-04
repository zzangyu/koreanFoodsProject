<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="css/kFoods.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/loginCheck.js"></script>
<title>Sign Up</title>
</head>
<body>
	<form action="" id="signUp">
		<div id="signUp_Wrap">
			<span id="signUp_title1">어쩌고 저쩌고</span>
			<span id="signUp_title2">회원가입하고 맛집 같이 찾아봐요!</span>
			<div>
				<label class="signUp_textSize">아이디</label>
				<div>
					<input type="text" name="kf_id" id="kf_id" class="signUp_input" maxLength="16" onkeyup="idCheck()">
					<div class="signUp_check_textSize" id="signUp_idCheck"></div>
				</div>
			</div>
			<div>
				<label class="signUp_textSize">비밀번호</label>
				<div>
					<input type="password" name="kf_password" id="kf_password" class="signUp_input" maxLength="20">
					<div class="signUp_check_textSize" id="signUp_pwCheck"></div>
				</div>
			</div>
			<div>
				<label class="signUp_textSize">비밀번호 확인</label>
				<div>
					<input type="password" name="kf_passwordCheck" id="kf_passwordCheck" class="signUp_input" onkeyup="passwordCheckFunction()" maxLength="20">
					<div class="signUp_check_textSize" id="signUp_pwReCheck"></div>
				</div>
			</div>
			<div>
				<label class="signUp_textSize">닉네임</label>
				<div>
					<input type="text" name="kf_nickname" class="signUp_input">
					<div class="signUp_check_textSize" id="signUp_nickCheck"></div>
				</div>
			</div>
			<div>
				<label class="signUp_textSize">이메일</label>
				<div>
					<input type="text" name="kf_email" class="signUp_input">
					<div class="signUp_check_textSize" id="signUp_emailCheck"></div>
				</div>
			</div>
			<button class="signUp_button1">회원가입</button><button class="signUp_button1">로그인</button>
			<button onclick="history.go(-1); return false;" class="signUp_button2">뒤로가기</button>
		</div>
	</form>
</body>
</html>