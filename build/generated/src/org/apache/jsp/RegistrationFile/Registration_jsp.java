package org.apache.jsp.RegistrationFile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>User Registration</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Registration.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("            <h2>Create an Account</h2>\n");
      out.write("            <form action=\"Registration\" method=\"POST\">\n");
      out.write("                <label for=\"name\">Full Name</label>\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"name\" required placeholder=\"Enter your full name\">\n");
      out.write("\n");
      out.write("                <label for=\"email\">Email Address</label>\n");
      out.write("                <input type=\"email\" id=\"email\" name=\"email\" required placeholder=\"Enter your email address\">\n");
      out.write("\n");
      out.write("                <label for=\"password\">Password</label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" required placeholder=\"Enter your password\">\n");
      out.write("\n");
      out.write("                <label for=\"address\">Address</label>\n");
      out.write("                <input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Enter your address (optional)\">\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn\">Register</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
