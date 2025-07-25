<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  String user1 = (String) session.getAttribute("user");   
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MyCard</title>
    
    <!-- Link to Bootstrap CSS (Ensure you have access to Bootstrap's styles) -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="Css/Color.css">
</head>
<body>
  <!-- Navigation Bar -->
  <nav class="navbar navbar-expand-lg navbar-dark custom-bg">
    <!-- Brand Name / Logo -->
    <div class="container">
      <a class="navbar-brand" href="#">MyCard</a>
      
      <!-- Toggler button for mobile view -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Navbar content -->
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <!-- Home Link -->
          <li class="nav-item active">
            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
          </li>

          <!-- Link -->
          <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
          </li>

          <!-- Categories Dropdown -->
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Categories
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="#">Action</a>
              <a class="dropdown-item" href="#">Another action</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#">Something else here</a>
            </div>
          </li>
        </ul>
          <form class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
      </form>

        <!-- Right Side: Login/Register or Logout -->
        <ul class="navbar-nav ml-auto">
          <% if (user1 != null) { %>  <!-- If user is logged in -->
            <li class="nav-item">
              <a class="nav-link" href="LogOut">LogOut</a> <!-- LogOut button -->
            </li>
          <% } else { %>  <!-- If user is not logged in -->
            <li class="nav-item">
              <a class="nav-link" href="Signin.jsp">Login</a> <!-- Login button -->
            </li>
            <li class="nav-item">
              <a class="nav-link" href="Registration.jsp">Register</a> <!-- Register button -->
            </li>
          <% } %>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Optional: Add Bootstrap JS files -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
