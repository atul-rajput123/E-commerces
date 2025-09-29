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
    fileSizeThreshold = 1024 * 1024,  
    maxFileSize = 50 * 1024 * 1024,   
    maxRequestSize = 100 * 1024 * 1024 
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
        Part PphotoPart = request.getPart("Pphoto");  
        InputStream PphotoInputStream = null;
        
        if (PphotoPart != null) {
            PphotoInputStream = PphotoPart.getInputStream(); 
        }

       
        String dbURL = "jdbc:mysql://localhost:3306/e-commerce"; 
        String dbUsername = "root"; 
        String dbPassword = "root";  

       
        String insertSQL = "INSERT INTO producte (Ptitle, Pdescription, Pprice, Pdiscount, Pquantity, Scategory, Pphoto) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
           
            Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            
            
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            
           
            statement.setString(1, Ptitle);
            statement.setString(2, Pdescription);
            statement.setBigDecimal(3, new java.math.BigDecimal(Pprice)); 
            statement.setBigDecimal(4, new java.math.BigDecimal(Pdiscount));  
            statement.setInt(5, Integer.parseInt(Pquantity)); 
            statement.setInt(6, Integer.parseInt(Scategory)); 
            
           
            if (PphotoInputStream != null) {
                statement.setBinaryStream(7, PphotoInputStream);  
            }

            
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                out.println("Product added successfully.");
            } else {
                out.println("Failed to add the product.");
            }

           
            statement.close();
            connection.close();

        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
