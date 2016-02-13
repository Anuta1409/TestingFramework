<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/error.css" >
        <title>test</title>
    </head>
    <body>
        
        <div class = "error_message">
            <h1>Sorry, but you add not valid email or password!!!Return to the home page and try again!!!</h1>
        </div>
        
        <div class = "button_error">
            <input type="submit" value="Submit" onclick='history.back()'/>    
        </div>
        
    </body>
</html>
