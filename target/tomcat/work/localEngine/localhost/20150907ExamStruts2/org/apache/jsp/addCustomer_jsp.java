package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>添加用户</title>\r\n");
      out.write("<link href=\"bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<div style=\"height: 50px; background-color: #ADD8E6;\">\r\n");
      out.write("\t\t\t<div style=\"padding-top: 10px;font-size:20px;border:red solid 2px;\" class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t8822 林晓东\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"padding-top: 10px;border:red solid 2px;\" class=\"col-md-3 col-md-push-6\">\r\n");
      out.write("\t\t\t\t用户名：");
      out.print(request.getSession().getAttribute("username"));
      out.write("\r\n");
      out.write("\t\t\t\t");

					String flag = "";
					Object obj = session.getAttribute("flag");
					if (obj != null) {
						flag = obj.toString();
					}
					if (flag.equals("login_success")) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Logout_execute.action\">退出登陆</a>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/login.jsp\">登录</a>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"context\" style=\"width:100%;background-color:#ff0000;\">\r\n");
      out.write("\t\t\t<div class=\"col-md-2\" id=\"menu\" style=\"font-size: 20px; height: 800px;\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav\" role=\"tablist\">\r\n");
      out.write("\t\t\t\t\t<li role=\"presentation\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#profile\" id=\"customerManage\" aria-controls=\"profile\"\r\n");
      out.write("\t\t\t\t\t\t role=\"tab\" data-toggle=\"tab\">Customer管理</a>\r\n");
      out.write("\t\t\t\t\t </li>\r\n");
      out.write("\t\t\t\t\t<li role=\"presentation\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#messages\"\r\n");
      out.write("\t\t\t\t\t\taria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Film设置</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li role=\"presentation\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#profile\" id=\"customerManage\" aria-controls=\"profile\"\r\n");
      out.write("\t\t\t\t\t\t role=\"tab\" data-toggle=\"tab\">Customer管理</a>\r\n");
      out.write("\t\t\t\t\t </li>\r\n");
      out.write("\t\t\t\t\t<li role=\"presentation\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#messages\"\r\n");
      out.write("\t\t\t\t\t\taria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Film设置</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li role=\"presentation\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#profile\" id=\"customerManage\" aria-controls=\"profile\"\r\n");
      out.write("\t\t\t\t\t\t role=\"tab\" data-toggle=\"tab\">Customer管理</a>\r\n");
      out.write("\t\t\t\t\t </li>\r\n");
      out.write("\t\t\t\t\t<li role=\"presentation\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#messages\"\r\n");
      out.write("\t\t\t\t\t\taria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Film设置</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col-md-10\" id=\"addCustomer\" style=\"height:800px;\">\r\n");
      out.write("\t\t\t\t<div>创建Customer</div>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<div>基本信息</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
