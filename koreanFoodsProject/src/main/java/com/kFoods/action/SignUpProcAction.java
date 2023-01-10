package com.kFoods.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kFoods.control.ActionForward;
import com.kFoods.model.MembershipDAO;

public class SignUpProcAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		MembershipDAO dao = new MembershipDAO();
		String id = request.getParameter("kf_id");
		String pw1 = request.getParameter("kf_password");
		String pw2 = request.getParameter("kf_passwordCheck");
		String email = request.getParameter("kf_email");
		String nick = request.getParameter("kf_nickname");
		
		dao.saveAccount(id, pw1, pw2, email, nick);
		
		return new ActionForward("signUpProc.jsp", false);
	}

}
