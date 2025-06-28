/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrationANDLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Registration")
public class Registration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
     

        
         try
      {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce?useSSL=false","root","root");
          Statement st=con.createStatement();
          PreparedStatement stmt = con.prepareStatement("INSERT INTO Registar (name, email, password_hash, address,Usertype) VALUES (?, ?, ?, ?,?)");
            stmt.setString(1, name);           // Set name
            stmt.setString(2, email);          // Set email
            stmt.setString(3, password);       // Set hashed password (replace this with hashed password)
            stmt.setString(4, address);        // Set address
            stmt.setString(5, "normal");        // type
            
            // Execute the insert statement
            stmt.executeUpdate();
          HttpSession httpSession=request.getSession();
          httpSession.setAttribute("message","User Registration Succeful"+name);
          response.sendRedirect("Registration.jsp");
          return;
      }
      catch(Exception e)
      {
          out.println(e);
      }
      
      out.println("<h1>Form Submit SuccesFUlly and Your Profile will be verified in the next 24 hource and send Email </h1>");

       
        
    }
}