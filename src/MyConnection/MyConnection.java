
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author 1BestCsharp
 */
public class MyConnection {
    
    
    // create a function to connect with mysql database
    
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/md?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}



// watch this video for the design part: https://www.youtube.com/watch?v=XAowXcmQ-kA

// download the j connector from here: https://dev.mysql.com/downloads/connector/j/