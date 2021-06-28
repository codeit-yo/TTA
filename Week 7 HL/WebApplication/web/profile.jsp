<%-- 
    Document   : profile
    Created on : 28-Jun-2021, 13:58:21
    Author     : yoliv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <%
            HttpSession se = request.getSession(false);
            String firstName = se.getAttribute("firstName").toString();
            
            if(firstName == null || firstName.equals(" ") || firstName.equals(null)){
                
                out.print("You need to login first");
                request.getRequestDispatcher("login.jsp").include(request, response);
            }
            else{
            %>
                
            <center>
                <h1>Health is Wealth</h1><br/>
                <hr/>
                <div id="grad">
                <form action="logout" id="lout">
                    <table border="1" cellspacing="10">    
                            <tr>
                                <td><a href="https://www.healthline.com/">Healthline</a></td>
                                <td><a href="https://www.health.com/news">Health News</a></td>
                                <td><a href="https://www.health.com/fitness">Fitness</a></td>
                                <td><a href="https://www.health.com/mind-body">Mind & Body</a></td>
                                <td><a href="https://www.healthline.com/nutrition">Nutrition</a></td>
                            </tr>
                            <tr>
                                <td colspan="5"><input type="submit" value="Logout"/></td>
                            </tr>
                    </table>
                    <hr/>
                </form>
                   
            </center>
            <%
            }
        
        %>
                </div> 
       </body>
</html>
