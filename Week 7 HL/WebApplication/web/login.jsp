
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
    <center>
        <h1>Health Is Wealth Center</h1>
        <hr/>
        <div id="grad">
            <img src="img/user.png" width="130" height="130" alt="user logo"/>
            <h2>User Login</h2>
        
            <form action="check" method="POST">
                <table cellspacing="15">
                        <tr>
                            <td><label>First Name</label><br/>
                                <input type="text" name="firstName"/></td>
                        </tr>
                        <tr>
                            <td><label>Student ID</label><br/>
                                <input type="number" name="sid"/></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Login" /></td>
                        </tr>
                        <tr>
                            <td><input type="reset" value="Clear" /></td>
                        </tr>
                </table>

            </form>
        </div>
    </center>
    </body>
</html>
