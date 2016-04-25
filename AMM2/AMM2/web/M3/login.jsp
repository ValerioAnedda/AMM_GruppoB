<%-- 
    Document   : login
    Created on : 25-apr-2016, 15.31.46
    Author     : valerio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Loign Spendi e Spandi</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Valerio Anedda 44940">
        <meta name="keywords" content="Login Spendi e Spandi">  
        <link href="src/css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body> 
            <!-- HEADER -->
         <%@include file="include/header.jsp" %> 
        <!-- FINE HEADER --> 
        
        <!--    CORPO DELLA PAGINA -->
        <div class="container-page">
               
            <!--    Colonna Sinistra -->
            <%@include file="include/leftColumn.jsp" %>
              
            <!--    Colonna Destra -->
            <%@include file="include/rightColumn.jsp" %>
               
            <!--    Colonna Centrale -->
            <div id="column-container"> 
                   <div id="areaLogin"> 
                            <table class="areaLogin-table">
                                 <td>Area login </td>
                                 <tbody>
                                    <tr>
                                        <td>
                                            <label for="username">UserName</label>
                                            </td>
                                                <td colspan="2">
                                                    <input class="areaLogin-input" name="username"id="username"type="text"/>
                                                 </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label for="password">Password</label>
                                         </td>
                                        <td>
                                        <input  class="areaLogin-input"  type="password" name="password"id="password"type="text"/>                                           
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input name="login" type="submit" formmethod="post" value ="Login"/> <br>   
                                        </td>
                                    </tr>   
                                 </tbody>
                            </table>
                   </div>
            </div>  
            


        </div>
        <!--FINE CORPO DELLA PAGINA -->
        
        <!-- FOOTER -->
         <%@include file="include/footer.jsp" %> 
        <!-- FINE FOOTER-->
</body>
</html>
