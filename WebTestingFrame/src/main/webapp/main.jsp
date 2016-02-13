<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/runner.css" >
        <script src = "js/jquery-2.2.0.js"></script>
        <title>Runner</title>
   </head>
    <body>
        <h1>Please choose which one of the TEST SUITE do you want to run!!!</h1>
        <table class="table_runner">
            <caption>Run Test</caption>
            <tr class = "head">
                    <td>ID</td>
                    <td>Test Suite Name</td>
                    <td>Test Cases</td>
                    <td>Run Test</td>
            </tr>
            
            <tr>
                <td>1</td>
                <td>Sign Up Test</td>
                <td>Positive Login Test</td>
                <td><input  class="button" type="submit" value="Submit" /></td>
            </tr>
            
            <c:forEach var="item" items="${testsuitelist}">
                <tr>
                    <td><c:out value="${item.id}"/></td>
                    <td><c:out value="${item.test_suite_name}"/></td>
                </tr>
            </c:forEach>
                
        </table>
        </div>
    

    </body>
</html>
