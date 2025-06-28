 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrationANDLogin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

@WebServlet("/Signin")
public class Signin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
       
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Connection connection = null;
        PreparedStatement pr = null;
        ResultSet rs = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/e-commerce?useSSL=false", 
                    "root", "root");

            // Prepare the SQL query
            String sql = "SELECT * FROM registar WHERE   email   = ? AND password_hash = ?";
            pr = connection.prepareStatement(sql);
            pr.setString(1, email);
            pr.setString(2, password);

            // Execute the query
            rs = pr.executeQuery();

            // Check if user exists
            HttpSession httpSession=request.getSession();
            if (rs.next()) 
            {
                HttpSession session =request.getSession();
                if(rs.getString(6).equals("admin"))
                {
                    
                session.setAttribute("user",rs.getString(6));
                response.sendRedirect("Admin.jsp");  // Redirect to home page on success
                }
                else if(rs.getString(6).equals("normal"))
                {
                session.setAttribute("user",rs.getString(6));
                response.sendRedirect("HomePage.jsp");  // Redirect to home page on success
                }
                else 
                {
                out.println("invalide");
                }
                
            }
            else 
            { 
          httpSession.setAttribute("message","Invalid details");
          response.sendRedirect("Signin.jsp");
               return;
            }

        } catch (Exception e) {
            // Handle any exceptions
            out.println("<h2>Error: " + e.getMessage() + "</h2>");
        } finally {
            // Close resources to prevent memory leaks
            try {
                if (rs != null) rs.close();
                if (pr != null) pr.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                out.println("<h2>Error closing resources: " + ex.getMessage() + "</h2>");
            }
        }
    }

}
