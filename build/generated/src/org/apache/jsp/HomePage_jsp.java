package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Jsp/Navbar.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String user = (String) session.getAttribute("user");
if (user == null) {
    session.setAttribute("message", "You are not logged in. Please login first.");
    response.sendRedirect("Signin.jsp");
    return;
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Home Page</title>\n");
      out.write("    <!-- Add your CSS links here -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write('\n');

  String user1 = (String) session.getAttribute("user");   

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>MyCard</title>\n");
      out.write("    \n");
      out.write("    <!-- Link to Bootstrap CSS (Ensure you have access to Bootstrap's styles) -->\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"Css/Color.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <!-- Navigation Bar -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark custom-bg\">\n");
      out.write("    <!-- Brand Name / Logo -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">MyCard</a>\n");
      out.write("      \n");
      out.write("      <!-- Toggler button for mobile view -->\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <!-- Navbar content -->\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <!-- Home Link -->\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <!-- Link -->\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <!-- Categories Dropdown -->\n");
      out.write("          <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("              Categories\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("              <div class=\"dropdown-divider\"></div>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("          <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("        <!-- Right Side: Login/Register or Logout -->\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          ");
 if (user1 != null) { 
      out.write("  <!-- If user is logged in -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"LogOut\">LogOut</a> <!-- LogOut button -->\n");
      out.write("            </li>\n");
      out.write("          ");
 } else { 
      out.write("  <!-- If user is not logged in -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"Signin.jsp\">Login</a> <!-- Login button -->\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"Registration.jsp\">Register</a> <!-- Register button -->\n");
      out.write("            </li>\n");
      out.write("          ");
 } 
      out.write("\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <!-- Optional: Add Bootstrap JS files -->\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <!-- Show category -->\n");
      out.write("        <div class=\"col-md-2\">\n");
      out.write("            <!-- Categories can be added here if needed -->\n");
      out.write("        </div>\n");
      out.write("        <!-- Show products -->\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <table border=\"1\" width=\"100%\" cellpadding=\"10\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Product Name</th>\n");
      out.write("                        <th>Price</th>\n");
      out.write("                        <th>Discount</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                        <th>Image</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                    // JDBC setup
                    Connection conn = null;
                    PreparedStatement stmt = null;
                    ResultSet rs = null;

                    try {
                        // Load the JDBC driver
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        // Establish the connection
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDatabase", "yourUsername", "yourPassword");

                        // Query to fetch products
                        String query = "SELECT Pname, Pprice, Pdiscount, Pquantity, pphoto FROM product";
                        stmt = conn.prepareStatement(query);
                        rs = stmt.executeQuery();

                        // Loop through the results and display them
                        while (rs.next()) {
                            String productName = rs.getString("Pname");
                            double price = rs.getDouble("Pprice");
                            double discount = rs.getDouble("Pdiscount");
                            int quantity = rs.getInt("Pquantity");
                            InputStream pphoto = rs.getBinaryStream("pphoto"); // Get the product image as binary stream

                            // Convert binary data to base64 image string if needed
                            String base64Image = "";
                            if (pphoto != null) {
                                java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();
                                java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
                                byte[] buffer = new byte[1024];
                                int bytesRead;
                                while ((bytesRead = pphoto.read(buffer)) != -1) {
                                    outputStream.write(buffer, 0, bytesRead);
                                }
                                base64Image = "data:image/jpeg;base64," + encoder.encodeToString(outputStream.toByteArray());
                            }
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( productName );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( price );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( discount );
      out.write("%</td>\n");
      out.write("                        <td>");
      out.print( quantity );
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
 if (!base64Image.isEmpty()) { 
      out.write("\n");
      out.write("                                <img src=\"");
      out.print( base64Image );
      out.write("\" alt=\"Product Image\" width=\"100\" height=\"100\" />\n");
      out.write("                            ");
 } else { 
      out.write("\n");
      out.write("                                No Image Available\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        out.println("<tr><td colspan='5'>Error fetching products: " + e.getMessage() + "</td></tr>");
                    } finally {
                        // Close resources
                        if (rs != null) rs.close();
                        if (stmt != null) stmt.close();
                        if (conn != null) conn.close();
                    }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
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
