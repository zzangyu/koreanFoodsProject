function idCheck(){
	var kf_id = $('#kf_id').val()
	$.ajax({
		type: 'POST',
		url: '',
		data: {kf_id : kf_id },
		success: function(result) {
			if(result == 1) {
				$('#signUp_idCheck').html('사용할 수 있는 아이디입니다.');
			} else {
				$('#signUp_idCheck').html('사용할 수 없는 아이디입니다.');
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