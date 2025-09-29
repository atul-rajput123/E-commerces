
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


@WebServlet(name = "ProductAdd", urlPatterns = {"/ProductAdd"})
public class ProductAdd extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
        // Fetch the operation parameter
        String check = request.getParameter("operation");
        

        if (check != null && check.trim().equals("addcategory")) 
        {
        
            String categoryTitle = request.getParameter("catTitle");
            String categoryDescription = request.getParameter("catDescription");

            
            if (categoryTitle == null || categoryTitle.trim().isEmpty() ||
                categoryDescription == null || categoryDescription.trim().isEmpty()) {
                out.println("Category title and description cannot be empty!");
                return;
            }

            
            String jdbcURL = "jdbc:mysql://localhost:3306/e-commerce"; 
            String dbUser = "root"; 
            String dbPassword = "root"; 

            // Insert category into the database
            String insertSQL = "INSERT INTO category (categoryTitle, categoryDescription) VALUES (?, ?)";

            try (Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
                 PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                 
            
                preparedStatement.setString(1, categoryTitle);
                preparedStatement.setString(2, categoryDescription);

                
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
            
            out.println("Invalid operation!");
        }
    }
}



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
