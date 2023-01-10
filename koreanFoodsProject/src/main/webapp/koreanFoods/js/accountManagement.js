function idCheck(){
	var kf_id = $('#kf_id').val()
	$.ajax({
		type: 'POST',
		url: 'kFoods.do?cmd=idCheck',
		data: {kf_id : kf_id },
		success: function(result) {
			if(result == 1) {
				$('#signUp_idCheck').html('이미 회원가입 된 아이디입니다.');
				return;
			} else {
				$('#signUp_idCheck').html('사용할 수 있는 아이디입니다.');
				return;
			}
			
		}
	})
}
function emailCheck(){
	var kf_email = $('#kf_email').val()
	$.ajax({
		type: 'POST',
		url: 'kFoods.do?cmd=emailCheck',
		data: {kf_email : kf_email },
		success: function(result) {
			if(result == 1) {
				$('#signUp_emailCheck').html('중복된 이메일 입니다.');
				return;
			} else {
				$('#signUp_emailCheck').html('사용할 수 있는 이메일입니다.');
				return;
			}
			
		}
	})
}
function nickCheck(){
	var kf_nickname = $('#kf_nickname').val()
	$.ajax({
		type: 'POST',
		url: 'kFoods.do?cmd=nickCheck',
		data: {kf_nickname : kf_nickname },
		success: function(result) {
			if(result == 1) {
				$('#signUp_nickCheck').html('중복된 닉네임 입니다.');
				return;
			} else {
				$('#signUp_nickCheck').html('사용할 수 있는 닉네임입니다.');
				return;
			}
			
		}
	})
}
function passwordCheckFunction() {
	var userPassword1 = $('#kf_password').val();
	var userPassword2 = $('#kf_passwordCheck').val();
	if(userPassword1 != userPassword2) {
		$('#signUp_pwReCheck').html('비밀번호가 일치하지 않습니다.');
	} else {
		$('#signUp_pwReCheck').html('비밀번호가 일치합니다.');
	}
}