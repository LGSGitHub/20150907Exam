package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public final class Loginindex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>index</title>\r\n");
      out.write("<link href=\"bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".costomerList div {\r\n");
      out.write("\tborder: 2px solid red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t\t<div style=\"height: 50px; background-color: #ADD8E6;\">\r\n");
      out.write("\t\t\t<div style=\"padding-top: 10px;font-size:20px;\" class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t8822 林晓东\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"padding-top: 10px;\" class=\"col-md-3 col-md-push-6\">\r\n");
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
      out.write("\t\t<div id=\"menu\" style=\"font-size: 20px; width: 200px; height: 800px; float: left;\">\r\n");
      out.write("\t\t\t<ul class=\"nav\" role=\"tablist\">\r\n");
      out.write("\t\t\t\t<li role=\"presentation\"><a href=\"#profile\" id=\"customerManage\"\r\n");
      out.write("\t\t\t\t\taria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">\r\n");
      out.write("\t\t\t\t\t\tCustomer管理</a></li>\r\n");
      out.write("\t\t\t\t<li role=\"presentation\"><a href=\"#messages\"\r\n");
      out.write("\t\t\t\t\taria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Film设置</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t<div role=\"tabpanel\" class=\"tab-pane\" id=\"profile\"\r\n");
      out.write("\t\t\t\tstyle=\"height: 50px; background-color: #cccccc; font-size: 20px;\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">客户列表</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/addCustomer.jsp\"\">新建</a>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top: 30px;\" id=\"costomerList\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <p>\r\n");
      out.write("\t\t\t\t\t\t\tfirst_name:<span id=\"fname\"></span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tlast_name:<span id=\"lname\"></span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>操作</strong>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-1\">First_Name</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-1\">Last_Name</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">Address</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">Email</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-1\">Customer_id</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">LastUpdate</div> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--默认分页-->\r\n");
      out.write("\t\t\t\t\t<div style=\"text-align:center;\">\r\n");
      out.write("\t\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t<ul class=\"pagination pagination-lg\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" aria-label=\"Previous\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\taria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">1</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">4</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">5</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" aria-label=\"Next\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\taria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div role=\"tabpanel\" class=\"tab-pane\" id=\"messages\">这是第三个tab</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"jquery-2.1.4.min.js\"></script>\r\n");
      out.write("\t<script src=\"bootstrap.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t</script>\r\n");
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
