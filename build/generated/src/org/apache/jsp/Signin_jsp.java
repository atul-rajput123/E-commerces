package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Jsp/Message.jsp");
  }

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
      out.write("    <title>Sign In</title>\n");
      out.write("   <link rel=\"stylesheet\" href=\"Css\\Singin$Singup.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("       \n");
      out.write("        <div class=\"signin-box\">\n");
      out.write("             ");
      out.write('\n');
      out.write('\n');

    // Retrieve the message from the session if it exists
    String message = (String) session.getAttribute("message");  
    if (message != null) {

      out.write("\n");
      out.write("        <!-- Display message in an alert box -->\n");
      out.write("        <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\n");
      out.write("            <strong>");
      out.print( message );
      out.write("</strong>\n");
      out.write("            <!-- Close button to dismiss the alert -->\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("\n");

        // Remove the message from session after it's been displayed
        session.removeAttribute("message");
    }

      out.write('\n');
      out.write("\n");
      out.write("            <h2>Sign In</h2>\n");
      out.write("            <form action=\"Signin\" method=\"POST\">\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Enter your email\" required>\n");
      out.write("                    <span class=\"error-message\" id=\"email-error\"></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter your password\" required>\n");
      out.write("                    <span class=\"error-message\" id=\"password-error\"></span>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"signin-btn\">Sign In</button>\n");
      out.write("                <div class=\"extra-links\">\n");
      out.write("                    <a href=\"#\">Forgot password?</a>\n");
      out.write("                    <p>Don't have an account? <a href=\"Registration.jsp\">Sign Up</a></p>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div id=\"success-message\" class=\"success-message\"></div>\n");
      out.write("            <div id=\"error-message\" class=\"error-message\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"script.js\"></script>\n");
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
