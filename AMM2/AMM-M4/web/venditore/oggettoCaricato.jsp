<%-- 
    Document   : oggettoCaricato
    Created on : 1-mag-2016, 22.13.24
    Author     : valerio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pagina riepilogo oggetto caricato</title>
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
            <div id ="column-container">
                
                <c:if test="${auth}" > 

                    <table class="tabella-cliente">
                        <tr class="table-pari">
                            <td class="table"> <p>${nomeOggetto} </p></td>
                            <td class="table"> <p>${descrizione} </p></td>
                            <td class="table"> <img   title="${nomeOggetto}" src="${urlImg}" width="120" height="141"> </td>
                            <td class="table" ><p> ${quantita} pz </p></td>
                            <td class="table"><p> ${prezzo} euro</p></td>

                        </tr>
                    </table>

                </c:if>

                <c:if test="${!auth}" >
                    non sei autorizzato ${!auth}
                </c:if> 


            </div>  
        </div>


    </div>
    <!--FINE CORPO DELLA PAGINA -->


    <!-- FOOTER -->
    <jsp:include page="../include/footer.jsp" /> 
    <!-- FINE FOOTER-->  

</body>
</html>

