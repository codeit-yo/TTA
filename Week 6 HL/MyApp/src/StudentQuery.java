import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;



public class StudentQuery {
    
    //INSERT
    public int insert(int sid, String firstName, String lastName, int score)
    {
       int row_insert = 0;
       try
       {
           Connection con = Connection1.connect();
           Statement stmt = con.createStatement();
           
           String qry = "insert into student(sid,firstName,lastName,score) values("+sid+","+firstName+","+lastName+","+score+")";
           
           row_insert = stmt.executeUpdate(qry);
           
       }//try ends
       catch(Exception ex)
       {
           System.out.println("Insert Error :"+ex);
       }//catch ends
       
       return row_insert;
    }//insert ends
    
    
    //UPDATE
    public int update(int sid, int up_score)
    {
           int row_update = 0;
           try
           {
               Connection con = Connection1.connect();
               Statement stmt = con.createStatement();
               
               String qry = "update student set score="+up_score+" where sid="+sid;
               
               row_update = stmt.executeUpdate(qry);
               
           }//try ends
           catch(Exception ex)
           {
               System.out.println("Update Error :"+ex);
           }//catch ends
           
           return row_update;
        
    }//update ends
    
    
    //DELETE
    public int delete(int sid)
    {
           int row_delete = 0;
           try
           {
               Connection con = Connection1.connect();
               Statement stmt = con.createStatement();
               
               String qry = "delete form student where sid="+sid;
               
               row_delete = stmt.executeUpdate(qry);
           }//try ends
           catch(Exception ex)
           {
               System.out.println("Delete Error :"+ex);
           }//catch ends
        
           return row_delete;
    }//delete ends
    
    
    //DISPLAY
    
    public void display()
    {
       try
       {
           Connection con = Connection1.connect();
           Statement stmt = con.createStatement();
           
           String qry = "select * from student";
           
           ResultSet rs = stmt.executeQuery(qry);
           
           while(rs.next())
           {
               int i = rs.getInt("sid");
               String f = rs.getString("firstName");
               String l = rs.getString("lastName");
               int s = rs.getInt("score");
           
               System.out.println("SID :"+i);
               System.out.println("FIRST NAME :"+f);
               System.out.println("LAST NAME :"+l);
               System.out.println("SCORE :"+s);
               
           }//while ends
       }//try ends
       catch(Exception ex)
       {
           System.out.println("Display Error :"+ex);
       }//catch ends
       
    }//display ends
    
}//class ends
