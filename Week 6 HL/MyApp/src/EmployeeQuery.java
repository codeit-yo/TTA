import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;



public class EmployeeQuery {
    
    //INSERT
    public int insert(int eid, String firstName, String lastName, double salary)
    {
       int row_insert = 0;
       
       try
       {
           Connection con = Connection1.connect();
           Statement stmt = con.createStatement();
           
           String qry = "Insert into employee(eid,firstName,lastName,salary) values("+eid+",'"+firstName+"', '"+lastName+"', "+salary+")";
           
           row_insert = stmt.executeUpdate(qry);
       }//try ends
       catch(Exception ex)
       {
           System.out.println("Insert Error :"+ex);
       }//catch ends
       return row_insert;
    }//insert ends
    
    
    //UPDATE
    public int update(int eid, double up_salary)
    {
        int row_update = 0;
        try
        {
            Connection con = Connection1.connect();
            Statement stmt = con.createStatement();
            
            String qry = "Update employee set salary="+up_salary+" where eid="+eid;
            
            row_update = stmt.executeUpdate(qry);
            
        }//try ends
        catch(Exception ex){
            System.out.println("Update Error :"+ex);
        }
        return row_update;
    }//update
    
    
    
    //DELETE
    public int delete(int eid){
        int row_delete = 0;
        try
        {
            Connection con = Connection1.connect();
            Statement stmt = con.createStatement();
            
            String qry = "Delete from employee where eid="+eid;
            
            row_delete = stmt.executeUpdate(qry);
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Delete Error :"+ex);
        }//catch ends
        return row_delete;
    }//delete
    
    
    //DISPLAY
    public void display(){
        try
        {
            Connection con = Connection1.connect();
            Statement stmt = con.createStatement();
            
            String qry = "Select * from employee";
            
            ResultSet rs = stmt.executeQuery(qry);
            
            while(rs.next())
            {
                int i = rs.getInt("eid");
                String f = rs.getString("firstName");
                String l = rs.getString("lastName");
                double s = rs.getDouble("salary");
                
                System.out.println("EID :"+i);
                System.out.println("FIRST NAME :"+f);
                System.out.println("LAST NAME :"+l);
                System.out.println("SALARY :"+s);
            }//while ends
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Display Error :"+ex);
        }//catch ends
        
    }//display ends
}//class ends
