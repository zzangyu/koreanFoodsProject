/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.84
 * Generated at: 2023-01-10 05:00:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.koreanFoods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/kFoods.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/accountManagement.js\"></script>\r\n");
      out.write("<title>Sign Up</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<form action=\"kfoods.do?cmd=signUpProc\" id=\"signUp\" method=\"post\">\r\n");
      out.write("		<div id=\"signUp_Wrap\">\r\n");
      out.write("			<span id=\"signUp_title1\">어쩌고 저쩌고</span>\r\n");
      out.write("			<span id=\"signUp_title2\">회원가입하고 맛집 같이 찾아봐요!</span>\r\n");
      out.write("			<div>\r\n");
      out.write("				<label class=\"signUp_textSize\">아이디</label>\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"text\" name=\"kf_id\" id=\"kf_id\" class=\"signUp_input\" maxLength=\"16\" onkeyup=\"idCheck()\">\r\n");
      out.write("					<div class=\"signUp_check_textSize\" id=\"signUp_idCheck\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<label class=\"signUp_textSize\">비밀번호</label>\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"password\" name=\"kf_password\" id=\"kf_password\" class=\"signUp_input\" maxLength=\"20\">\r\n");
      out.write("					<div class=\"signUp_check_textSize\" id=\"signUp_pwCheck\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<label class=\"signUp_textSize\">비밀번호 확인</label>\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"password\" name=\"kf_passwordCheck\" id=\"kf_passwordCheck\" class=\"signUp_input\" onkeyup=\"passwordCheckFunction()\" maxLength=\"20\">\r\n");
      out.write("					<div class=\"signUp_check_textSize\" id=\"signUp_pwReCheck\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<label class=\"signUp_textSize\">닉네임</label>\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"text\" name=\"kf_nickname\" id=\"kf_nickname\" class=\"signUp_input\" onkeyup=\"nickCheck()\">\r\n");
      out.write("					<div class=\"signUp_check_textSize\" id=\"signUp_nickCheck\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<label class=\"signUp_textSize\">이메일</label>\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"text\" name=\"kf_email\" id=\"kf_email\" class=\"signUp_input\" onkeyup=\"emailCheck()\">\r\n");
      out.write("					<div class=\"signUp_check_textSize\" id=\"signUp_emailCheck\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<button type=\"submit\" class=\"signUp_button1\">회원가입</button><button class=\"signUp_button1\" type=\"button\" onClick=\"location.href='kfoods.do?cmd=signIn'\">로그인</button>\r\n");
      out.write("			<button onclick=\"history.go(-1); return false;\" class=\"signUp_button2\">뒤로가기</button>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
