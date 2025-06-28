package Product;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name = "ProductAdd1", urlPatterns = {"/ProductAdd1"})
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024,  // 1MB threshold before writing to disk
    maxFileSize = 50 * 1024 * 1024,   // 50MB max file size
    maxRequestSize = 100 * 1024 * 1024 // 100MB max request size
)
public class ProductAdd1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        // Get form data
        String Ptitle = request.getParameter("Ptitle");
        String Pdescription = request.getParameter("Pdescription");
        String Pprice = request.getParameter("Pprice");
        String Pdiscount = request.getParameter("Pdiscount");
        String Pquantity = request.getParameter("Pquantity");
        String Scategory = request.getParameter("Scategory");

        // Get the image file from the form
        Part PphotoPart = request.getPart("Pphoto");  // Assuming the input name for the image file is "Pphoto"
        InputStream PphotoInputStream = null;
        
        if (PphotoPart != null) {
            PphotoInputStream = PphotoPart.getInputStream();  // Get the image as InputStream
        }

        // Database connection parameters
        String dbURL = "jdbc:mysql://localhost:3306/e-commerce"; // Change the database URL as per your setup
        String dbUsername = "root";  // Change to your MySQL username
        String dbPassword = "root";  // Change to your MySQL password

        // JDBC Insert query
        String insertSQL = "INSERT INTO producte (Ptitle, Pdescription, Pprice, Pdiscount, Pquantity, Scategory, Pphoto) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            
            // Create PreparedStatement to insert data
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            
            // Set the values in the PreparedStatement
            statement.setString(1, Ptitle);
            statement.setString(2, Pdescription);
            statement.setBigDecimal(3, new java.math.BigDecimal(Pprice));  // Convert string to BigDecimal for price
            statement.setBigDecimal(4, new java.math.BigDecimal(Pdiscount));  // Convert string to BigDecimal for discount
            statement.setInt(5, Integer.parseInt(Pquantity));  // Convert string to Integer for quantity
            statement.setInt(6, Integer.parseInt(Scategory));  // Convert string to Integer for category ID
            
            // If the image is uploaded, set it as a BLOB
            if (PphotoInputStream != null) {
                statement.setBinaryStream(7, PphotoInputStream);  // Set the image as a BLOB
            }

            // Execute the update
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                out.println("Product added successfully.");
            } else {
                out.println("Failed to add the product.");
            }

            // Close resources
            statement.close();
            connection.close();

        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
