<%-- 
    Document   : venditore
    Created on : 25-apr-2016, 15.32.02
    Author     : valerio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pagina Vendor</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Valerio Anedda 44940">
        <meta name="keywords" content="Pagine Clienti Spendi e Spandi">  
        <link href="src/css/style.css" rel="stylesheet" type="text/css"/>
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
            <c:if test="${loggedId}">
                <c:if test="${tid == 'Venditore' }" > 

                    <jsp:include page="venditore/form_venditore.jsp" />

                </c:if>

                <c:if test="${!(tid == 'Venditore')}" >
                    <h2 align="center">non sei autorizzato devi avere le credenziali da Venditore</h2>  
                </c:if> 
            </c:if>



            <c:if test="${!loggedId}">
                <h2 align="center"> Prima di accedere alla tua area Venditore ricordatevi di fare il <a href="./login.jsp">LOGIN!!</a></h6>
                    <h4 align="center"> per maggiori informazioni visitate la pagina di <a href="./descrizione.jsp"> Descrizione</a>. </h4>

                </c:if>

        </div>  



    </div>
    <!--FINE CORPO DELLA PAGINA -->


    <!-- FOOTER -->
    <jsp:include page="include/footer.jsp" /> 
    <!-- FINE FOOTER-->  

</body>
</html>
