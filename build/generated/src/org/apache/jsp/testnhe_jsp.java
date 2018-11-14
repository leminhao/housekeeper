package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.NhanvienDAO;
import model.Nhanvien;
import java.util.ArrayList;

public final class testnhe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Demo lọc danh sách thành viên theo họ</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t   <!-- Bootstrap -->\n");
      out.write("    <link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link href=\"vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("  \n");
      out.write("    <!-- Datatables -->\n");
      out.write("    <link href=\"vendors/datatables.net-bs/css/dataTables.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"\">\n");
      out.write("\t\t\t<center><strong>Chọn chuyên môn mà bạn muốn tìm : </strong>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "timkiem.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</center>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t");
ArrayList<Nhanvien> ds = new NhanvienDAO().getDanhSach();
			ArrayList<Nhanvien> dsLoc = (ArrayList<Nhanvien>)session.getAttribute("dsLoc");
			if(session.getAttribute("dsLoc")!=null){
				ds=dsLoc;
			}
		
      out.write("\n");
      out.write("\t\t  \n");
      out.write("\t\t    </div>\n");
      out.write("\t </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    \n");
      out.write("    <!-- Datatables -->\n");
      out.write("    <script src=\"vendors/datatables.net/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-bs/js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons/js/dataTables.buttons.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons/js/buttons.flash.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons/js/buttons.html5.min.js\"></script>\n");
      out.write("    <script src=\"vendors/datatables.net-buttons/js/buttons.print.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Scripts -->\n");
      out.write("    <script src=\"build/js/custom.min.js\"></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
