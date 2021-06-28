
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author yoliv
 */
public class LoginServlet extends HttpServlet {
    String firstName;
    int sid;
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
            //DB Connection
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String URL = "jdbc:mysql://localhost:3306/tta?autoReconnect=true&useSSL=false"; //DB Location
            String user = "root";
            String pwd = "250602J#b";
            
            Connection con = DriverManager.getConnection(URL, user , pwd);
            
            Statement stmt = con.createStatement();
            
            firstName = request.getParameter("firstName");
            sid = Integer.parseInt(request.getParameter("sid"));
            
      
            String qry2 ="select * from student where firstName ='"+firstName+"' and sid ="+sid+"";
            ResultSet rs1 = stmt.executeQuery(qry2);
            
            //user input First Name Lee, Sudent ID 101
            //user input First Name Bee, Student ID 102
            
            if (rs1.next()){
                
                HttpSession se = request.getSession();
                
                se.setAttribute("firstName",firstName);
                
                out.print("Welcome "+firstName);
                request.getRequestDispatcher("profile.jsp").include(request, response);
                
            }
            else{
                out.print("Sorry..can not login");
                out.print("<br/>");
                out.print("Try again");
                request.getRequestDispatcher("login.jsp").include(request, response);
            }
            
            
        }
        catch(Exception ex){
            System.out.println("DB error :"+ex);
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
