package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.List;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Panel</title>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css\\Admin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("        <div class=\"container py-5\">\n");
      out.write("            <!-- First Row -->\n");
      out.write("            <div class=\"row g-4\">\n");
      out.write("                <!-- Users -->\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card shadow-sm text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"icon-container mb-3\">\n");
      out.write("                                <i class=\"fas fa-users fa-3x text-primary\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"text-uppercase text-muted\">Users</h4>\n");
      out.write("                            <h2 class=\"text-dark\">123</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Categories -->\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card shadow-sm text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"icon-container mb-3\">\n");
      out.write("                                <i class=\"fas fa-tags fa-3x text-success\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"text-uppercase text-muted\">Categories</h4>\n");
      out.write("                            <h2 class=\"text-dark\">456</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Products -->\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card shadow-sm text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"icon-container mb-3\">\n");
      out.write("                                <i class=\"fas fa-box-open fa-3x text-warning\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"text-uppercase text-muted\">Products</h4>\n");
      out.write("                            <h2 class=\"text-dark\">789</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Second Row -->\n");
      out.write("            <div class=\"row g-4 mt-4\">\n");
      out.write("                <!-- Add Category -->\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"card shadow-sm text-center\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"icon-container mb-3\">\n");
      out.write("                                <i class=\"fas fa-plus fa-3x text-danger\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"text-uppercase text-muted\">Add Category</h4>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Add Product -->\n");
      out.write("                <div class=\"col-md-6\" >\n");
      out.write("                    <div class=\"card shadow-sm text-center\" data-toggle=\"modal\" data-target=\"#add-product-modal\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"icon-container mb-3\">\n");
      out.write("                                <i class=\"fas fa-cart-plus fa-3x text-info\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"text-uppercase text-muted\">Add Product</h4>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap JS -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("   \n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Add Category -->\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header custom-bg text-white\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Fill category details</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form action=\"ProductAdd\" method=\"post\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <input type=\"hidden\" name=\"operation\" value=\"addcategory\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"catTitle\" placeholder=\"Enter category title\" required /> \n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <textarea style=\"height:200px \" class=\"form-control\" placeholder=\"Enter category description\" name=\"catDescription\" required ></textarea>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"container text-center\">\n");
      out.write("                  <button class=\"btn btn-outline-success\">Add Category</button>\n");
      out.write("                   <button type=\"button\" class=\"btn btn-secondary btn-outline-success\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      \n");
      out.write("              </div>\n");
      out.write("          </form>\n");
      out.write("        ...\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Add Category  end-->\n");
      out.write("<!--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++-->\n");
      out.write("  <!-- Add product  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"add-product-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Add Product</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <!-- form-->\n");
      out.write("         \n");
      out.write("          \n");
      out.write("          \n");
      out.write("           <form action=\"ProductAdd1\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <input type=\"hidden\" name=\"operation\" value=\"addcategory\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"Ptitle\" placeholder=\"Enter title of Product\" required /> \n");
      out.write("              </div>\n");
      out.write("               \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <textarea style=\"height:100px \" class=\"form-control\" placeholder=\"Enter category description\" name=\"Pdescription\" required ></textarea>\n");
      out.write("              </div>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                  \n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"Pprice\" placeholder=\"Enter Price of Product\" required /> \n");
      out.write("              </div>\n");
      out.write("               \n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                  \n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"Pdiscount\" placeholder=\"Enter Product discount\" required /> \n");
      out.write("              </div>\n");
      out.write("               \n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                  \n");
      out.write("                  <input type=\"number\" class=\"form-control\" name=\"Pquantity\" placeholder=\"Enter Product Ouantity\" required /> \n");
      out.write("              </div>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               <!-- Show Categorys-->\n");
      out.write("               \n");
      out.write("               <div class=\"form-group\">\n");
      out.write("        <select name=\"Scategory\" class=\"form-control\">\n");
      out.write("            <option value=\"\">-- Select Category --</option>\n");
      out.write("            ");
 
                // Initialize connection and query variables
                Connection conn = null;
                PreparedStatement stmt = null;
                ResultSet rs = null;
                List<Integer> categories = new ArrayList<>();
                
                try {
                    // Load database driver (if needed, based on your setup)
                    Class.forName("com.mysql.cj.jdbc.Driver"); // Example for MySQL

                    // Connect to the database
                    String url = "jdbc:mysql://localhost:3306/e-commerce"; // Your DB URL
                    String user = "root"; // Your DB username
                    String password = "root"; // Your DB password

                    conn = DriverManager.getConnection(url, user, password);

                    // Define SQL query to fetch categories
                    String query = "SELECT * FROM category"; // Your table and column names
                    stmt = conn.prepareStatement(query);
                    rs = stmt.executeQuery();

                    // Process the result set and populate categories list
                    while (rs.next()) {
                        categories.add(Integer.parseInt(rs.getString(1)));
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Close resources
                    try {
                        if (rs != null) rs.close();
                        if (stmt != null) stmt.close();
                        if (conn != null) conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                
                // Now render the categories as options in the dropdown
                if (categories != null && !categories.isEmpty()) {
                    for (int category : categories) {
            
      out.write("\n");
      out.write("                        <option value=\"");
      out.print( category );
      out.write('"');
      out.write('>');
      out.print( category );
      out.write("</option>\n");
      out.write("            ");
 
                    }
                } else {
            
      out.write("\n");
      out.write("                    <option value=\"\">No categories available</option>\n");
      out.write("            ");
 
                }
            
      out.write("\n");
      out.write("        </select>\n");
      out.write("    </div>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write(" \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               <!-- Add image -->\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                   <label for=\"pPic\">Select Picture of Product</label>\n");
      out.write("                   <br>\n");
      out.write("                   <input type=\"file\" id=\"pPic\" name=\"Pphoto\" required />\n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("              <div class=\"container text-center\">\n");
      out.write("                  <button class=\"btn btn-outline-success\">Add Product</button>\n");
      out.write("                   <button type=\"button\" class=\"btn btn-secondary btn-outline-success\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      \n");
      out.write("              </div>\n");
      out.write("          </form>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <!--form end--->\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <!-- Add Category  end-->\n");
      out.write("    </body>\n");
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
