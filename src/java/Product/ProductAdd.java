/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "ProductAdd", urlPatterns = {"/ProductAdd"})
public class ProductAdd extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
        // Fetch the operation parameter
        String check = request.getParameter("operation");
        
        // Check if the operation is to add a category
        if (check != null && check.trim().equals("addcategory")) 
        {
            // Retrieve category details from the request
            String categoryTitle = request.getParameter("catTitle");
            String categoryDescription = request.getParameter("catDescription");

            // Validate input
            if (categoryTitle == null || categoryTitle.trim().isEmpty() ||
                categoryDescription == null || categoryDescription.trim().isEmpty()) {
                out.println("Category title and description cannot be empty!");
                return;
            }

            // Database connection details
            String jdbcURL = "jdbc:mysql://localhost:3306/e-commerce"; // Replace with your database name
            String dbUser = "root"; // Replace with your database username
            String dbPassword = "root"; // Replace with your database password

            // Insert category into the database
            String insertSQL = "INSERT INTO category (categoryTitle, categoryDescription) VALUES (?, ?)";

            try (Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
                 PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                 
                // Set parameters for the prepared statement
                preparedStatement.setString(1, categoryTitle);
                preparedStatement.setString(2, categoryDescription);

                // Execute the insert statement
                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) 
                {
                    out.println("Category added successfully!");
                } else {
                    out.println("Failed to add category. Please try again.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                out.println("An error occurred while adding the category: " + e.getMessage());
            }
        }
        else 
        {
            // Handle other operations
            out.println("Invalid operation!");
        }
    }
}


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
