package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>登录页面</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tmargin: 20px auto;\r\n");
      out.write("\tbackground-image: url(\"11.jpg\");\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-size:100%; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\tmargin-left: 30px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction check(form) {\r\n");
      out.write("\t\tif (document.forms.loginForm.userName.value == \"\") {\r\n");
      out.write("\t\t\t//弹出提示\r\n");
      out.write("\t\t\talert(\"请输入用户名！\");\r\n");
      out.write("\t\t\t//将焦点聚到用户输入框\r\n");
      out.write("\t\t\tdocument.forms.loginForm.userName.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<p>8822林晓东</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Login_execute.action\" method=\"post\">\r\n");
      out.write("\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t<table border=\"2\" cellspacing=\"0\" cellpadding=\"5\"\r\n");
      out.write("\t\t\t\t\t\tbordercolor=\"silver\" align=\"center\" width=\"500px\" \r\n");
      out.write("\t\t\t\t\t\theight=\"200px\" bgcolor=\"#ffffff\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\" bgcolor=\"#E8e8e8\">电影租贷管理系统</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"text-align:right;\">用户名：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"username\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"text-align:right;\">密码：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"submit\" onClick=\"return check(this);\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"reset\" name=\"reset\" /></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</center>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
