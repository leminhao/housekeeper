package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.NhanvienDAO;
import java.util.Set;

public final class timkiem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script src=\"http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.7.1/modernizr.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("yepnope({\n");
      out.write("  test : (!Modernizr.input.list || (parseInt($.browser.version) > 400)),\n");
      out.write("  yep : [\n");
      out.write("      'https://raw2.github.com/CSS-Tricks/Relevant-Dropdowns/master/js/jquery.relevant-dropdown.js',\n");
      out.write("      'https://raw2.github.com/CSS-Tricks/Relevant-Dropdowns/master/js/load-fallbacks.js'\n");
      out.write("  ]\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"XuLyLoc\" method=\"post\">\n");
      out.write("\t<input type=\"text\" list=\"dschuyenMonNhanVien\" name=\"chuyenMon\" />\n");
      out.write("\t<button class=\"btn btn-primary\" type=\"submit\">tìm theo chuyên môn</button>\n");
      out.write("</form>\n");
      out.write("\t");
Set<String> dschuyenMonNhanVien = new NhanvienDAO().getDanhSachTheochuyenMon();
      out.write("\n");
      out.write("\t<datalist id=\"dschuyenMonNhanVien\">\n");
      out.write("\t");
for(String a:dschuyenMonNhanVien) {
      out.write("\n");
      out.write("\t\t<option value=\"");
      out.print(a);
      out.write('"');
      out.write('>');
      out.print(a );
      out.write("</option>\n");
      out.write("\t\t");
} 
      out.write("\n");
      out.write("\t</datalist>\n");
      out.write("</body>\n");
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
