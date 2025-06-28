<%@page import="java.io.InputStream"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%
String user = (String) session.getAttribute("user");
if (user == null) {
    session.setAttribute("message", "You are not logged in. Please login first.");
    response.sendRedirect("Signin.jsp");
    return;
}
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <!-- Add your CSS links here -->
</head>
<body>
    <%@ include file="Jsp/Navbar.jsp" %>
    <div class="row">
        <!-- Show category -->
        <div class="col-md-2">
            <!-- Categories can be added here if needed -->
        </div>
        <!-- Show products -->
        <div class="col-md-8">
            <table border="1" width="100%" cellpadding="10">
                <thead>
                    <tr>
                        <th>Product Name</th>
                        <th>Price</th>
                        <th>Discount</th>
                        <th>Quantity</th>
                        <th>Image</th>
                    </tr>
                </thead>
                <tbody>
                    <%
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
                    %>
                    <tr>
                        <td><%= productName %></td>
                        <td><%= price %></td>
                        <td><%= discount %>%</td>
                        <td><%= quantity %></td>
                        <td>
                            <% if (!base64Image.isEmpty()) { %>
                                <img src="<%= base64Image %>" alt="Product Image" width="100" height="100" />
                            <% } else { %>
                                No Image Available
                            <% } %>
                        </td>
                    </tr>
                    <%
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
                    %>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
