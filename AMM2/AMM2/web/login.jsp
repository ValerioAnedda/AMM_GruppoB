<%-- 
    Document   : login
    Created on : 25-apr-2016, 15.31.46
    Author     : valerio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Loign Spendi e Spandi</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Valerio Anedda 44940">
        <meta name="keywords" content="Login Spendi e Spandi">  
        <link href="src/css/style.css" rel="stylesheet" type="text/css"  media="screen"/>
    </head>
    <body> 
        <!-- HEADER -->
        <jsp:include page="include/header.jsp" /> 
        <!-- FINE HEADER --> 

        <!--    CORPO DELLA PAGINA -->
        <div class="container-page">

            <!--    Colonna Sinistra -->
            <jsp:include page="include/leftColumn.jsp" />

            <!--    Colonna Destra -->
            <jsp:include page="include/rightColumn.jsp" />

            <!--    Colonna Centrale -->
            <div id="column-container"> 
                 
                <c:if test="${!loggedId}">
                    <table class="areaLogin-table">
                        <td>Area login </td>
                        <form method="post" action="Login">
                            <input type="hidden" name="cmd" value="login">
                            <tbody>
                                <tr>
                                    <td>
                                        <label for="username">UserName</label>
                                    </td>
                                    <td colspan="2">
                                        <input class="areaLogin-input" name="Username" id="username" type="text"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label for="password">Password</label>
                                    </td>
                                    <td>
                                        <input  class="areaLogin-input"  type="Password" name="Password" id="password" type="text"/>                                           
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <input name="Submit" type="submit"value ="Login"/>   
                                    </td>
                                </tr>   
                            </tbody>
                    </table>
                    
                    <!-- In caso ci sia stato un errore nella login -->
                    <c:if test="${error}"> 
                        <p> campo password o username errati, riprovare </p> 
                    </c:if>

                </c:if>
                <c:if test="${loggedId}">
                    ciao ${tid}
                    <form method="post" action="Logout"> 
                    <input name="Submit" type="submit"value ="Logout"/> 
                    </form>
                     
                </c:if>       
            </div>  



        </div>
        <!--FINE CORPO DELLA PAGINA -->

        <!-- FOOTER -->
        <jsp:include page="include/footer.jsp" /> 
        <!-- FINE FOOTER-->
    </body>
</html>
