<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- Font Awesome Icons -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link rel="stylesheet" href="Css\Admin.css">
    </head>
    <body>
        <%@include file="Jsp/Navbar.jsp"%>
        <div class="container py-5">
            <!-- First Row -->
            <div class="row g-4">
                <!-- Users -->
                <div class="col-md-4">
                    <div class="card shadow-sm text-center">
                        <div class="card-body">
                            <div class="icon-container mb-3">
                                <i class="fas fa-users fa-3x text-primary"></i>
                            </div>
                            <h4 class="text-uppercase text-muted">Users</h4>
                            <h2 class="text-dark">123</h2>
                        </div>
                    </div>
                </div>
                <!-- Categories -->
                <div class="col-md-4">
                    <div class="card shadow-sm text-center">
                        <div class="card-body">
                            <div class="icon-container mb-3">
                                <i class="fas fa-tags fa-3x text-success"></i>
                            </div>
                            <h4 class="text-uppercase text-muted">Categories</h4>
                            <h2 class="text-dark">456</h2>
                        </div>
                    </div>
                </div>
                <!-- Products -->
                <div class="col-md-4">
                    <div class="card shadow-sm text-center">
                        <div class="card-body">
                            <div class="icon-container mb-3">
                                <i class="fas fa-box-open fa-3x text-warning"></i>
                            </div>
                            <h4 class="text-uppercase text-muted">Products</h4>
                            <h2 class="text-dark">789</h2>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Second Row -->
            <div class="row g-4 mt-4">
                <!-- Add Category -->
                <div class="col-md-6">
                    <div class="card shadow-sm text-center" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                        <div class="card-body">
                            <div class="icon-container mb-3">
                                <i class="fas fa-plus fa-3x text-danger"></i>
                            </div>
                            <h4 class="text-uppercase text-muted">Add Category</h4>
                        </div>
                    </div>
                </div>
                <!-- Add Product -->
                <div class="col-md-6" >
                    <div class="card shadow-sm text-center" data-toggle="modal" data-target="#add-product-modal">
                        <div class="card-body">
                            <div class="icon-container mb-3">
                                <i class="fas fa-cart-plus fa-3x text-info"></i>
                            </div>
                            <h4 class="text-uppercase text-muted">Add Product</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap JS -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
   
        <!-- Button trigger modal -->


<!-- Add Category -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header custom-bg text-white">
        <h5 class="modal-title" id="exampleModalLabel">Fill category details</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <form action="ProductAdd" method="post">
              <div class="form-group">
                  <input type="hidden" name="operation" value="addcategory">
                  <input type="text" class="form-control" name="catTitle" placeholder="Enter category title" required /> 
              </div>
              <div class="form-group">
                  <textarea style="height:200px " class="form-control" placeholder="Enter category description" name="catDescription" required ></textarea>
              </div>
              <div class="container text-center">
                  <button class="btn btn-outline-success">Add Category</button>
                   <button type="button" class="btn btn-secondary btn-outline-success" data-dismiss="modal">Close</button>
      
              </div>
          </form>
        ...
      </div>
      
    </div>
  </div>
</div>
<!-- Add Category  end-->
<!--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++-->
  <!-- Add product  -->



<div class="modal fade" id="add-product-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Add Product</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <!-- form-->
         
          
          
           <form action="ProductAdd1" method="post" enctype="multipart/form-data">
              <div class="form-group">
                  <input type="hidden" name="operation" value="addcategory">
                  <input type="text" class="form-control" name="Ptitle" placeholder="Enter title of Product" required /> 
              </div>
               
              <div class="form-group">
                  <textarea style="height:100px " class="form-control" placeholder="Enter category description" name="Pdescription" required ></textarea>
              </div>
               
               
               <div class="form-group">
                  
                  <input type="text" class="form-control" name="Pprice" placeholder="Enter Price of Product" required /> 
              </div>
               
               <div class="form-group">
                  
                  <input type="text" class="form-control" name="Pdiscount" placeholder="Enter Product discount" required /> 
              </div>
               
               <div class="form-group">
                  
                  <input type="number" class="form-control" name="Pquantity" placeholder="Enter Product Ouantity" required /> 
              </div>
               
               
               
               
               
               
               
               
               
               <!-- Show Categorys-->
               
               <div class="form-group">
        <select name="Scategory" class="form-control">
            <option value="">-- Select Category --</option>
            <% 
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
            %>
                        <option value="<%= category %>"><%= category %></option>
            <% 
                    }
                } else {
            %>
                    <option value="">No categories available</option>
            <% 
                }
            %>
        </select>
    </div>
               
               
               
               
               
               
               
               
               
               
               
               
               
               
 
               
               
               <!-- Add image -->
               <div class="form-group">
                   <label for="pPic">Select Picture of Product</label>
                   <br>
                   <input type="file" id="pPic" name="Pphoto" required />
               </div>
               
               
               
              <div class="container text-center">
                  <button class="btn btn-outline-success">Add Product</button>
                   <button type="button" class="btn btn-secondary btn-outline-success" data-dismiss="modal">Close</button>
      
              </div>
          </form>
          
          
          
          
          
          <!--form end--->
          
          
          
          
          
      </div>
    </div>
  </div>
</div>
  
  
  <!-- Add Category  end-->
    </body>
</html>
