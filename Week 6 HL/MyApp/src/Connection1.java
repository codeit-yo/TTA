import java.sql.Connection;
import java.sql.DriverManager;



public class Connection1 {
    public static Connection connect() {
        
        Connection con = null;
        try
        {
            String URL = "jdbc:mysql://localhost:3306/tta";
            String user = "root";
            String pwd = "250602J#b";
            
            con = DriverManager.getConnection(URL, user, pwd);
            
        }//try ends
        catch(Exception ex)
        {
            System.out.println("DB Error :"+ex);
        }//catch ends
        
        return con;
    }//main ends
    
}//class ends
