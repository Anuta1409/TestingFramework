<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/login.css" >
        <script src = "js/jquery-2.2.0.js"></script>
        <title>Login</title>
        <script>
        function checkFields(){
                var login = $("#login").val();
                var password =$("#password").val();
                login.trim();
                password.trim();
                if(login === undefined || login.length === 0){
                   alert("firstname mail shouldn't be empty");
                   return false;
                }
                if(password === undefined || password.length === 0){
                   alert("password shouldn't be empty");
                   return false;
                }
                if(login.length > 32){
                   alert("lastname shouldn't be  more 32 chars");
                   return false;
                }
                if(password.length > 32){
                   alert("lastname shouldn't be more 32 chars");
                   return false;
                }
                return true;
            }
//            function deleteUser(id){
//                var url = "deleteuser";
//                $.get(
//                        url,
//                        {id:id},
//                       function (data){
//                            $("#item"+id).remove();
//                            return false;
//                        }
//                    );
//            return false
//            }
  </script>
    </head>
    <body>
        <div id="login_block">
            <h1 >Log in</h1>
            <form method ="post" action="login">
                <div>
                    <input type="text" name="login" required="required" placeholder="User Name or mail@mail.com" id = "login"/>
                </div>
                <div>
                    <input type="password" name="password" required="required"  placeholder="Password" id ="password" />  
                </div>
                <div>
                <input class="button" type="submit" value="Submit" onclick="return checkFields()"/>    
                </div>
            </form>
        </div>
    </body>
</html>
