<%-- 
    Document   : passoAcquista
    Created on : 2-mag-2016, 20.11.15
    Author     : valerio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pagina Passo Acquista</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Valerio Anedda 44940">
        <meta name="keywords" content="Pagine Clienti Spendi e Spandi">  
        <link href="src/css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <!-- HEADER -->
        <jsp:include page="../include/header.jsp" /> 
        <!-- FINE HEADER --> 

        <!--    CORPO DELLA PAGINA -->
        <div class="container-page">

            <!--    Colonna Sinistra -->
            <jsp:include page="../include/leftColumn.jsp" />

            <!--    Colonna Destra -->
            <jsp:include page="../include/rightColumn.jsp" />


            <!--    Colonna Centrale -->
          
            
            ${idOggetto} ${id} 

            <!-- Fine colonana centrale -->

        </div>
        <!--FINE CORPO DELLA PAGINA -->


        <!-- FOOTER -->
        <jsp:include page="../include/footer.jsp" /> 
        <!-- FINE FOOTER-->

    </body>
</html>
