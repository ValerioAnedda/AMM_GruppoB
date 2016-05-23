<%-- 
    Document   : nuovoOggettoVenditore
    Created on : 1-mag-2016, 20.48.42
    Author     : valerio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table class="tabella-cliente">
    <!----- PRIMA RIGA COLONNA INTESTAZIONE --->
    <tr class="table-title">
        <th> Nome Prodotto</th>            
        <th> immagine</th>
        <th> Quantità</th>
        <th> prezzo</th>
        <th> carrello</th>
    </tr> 
    
    <c:forEach var="oggetto" items="${oggetti}">
        <form action="TabellaVenditore" method="POST">

        <!--- 2 RIGA : ARIA FRESCA ---->
        


            <tr class="table-pari">

                <td class="table"><p> ${oggetto.nome}  </p></td>
                <td class="table"> <img title="${oggetto.nome}" src="${oggetto.getUrlObject()}"> </td>
                <td class="table"><p> ${oggetto.quantita} pz </p></td>
                <td class="table"><p> ${oggetto.quantita} euro  </p></td>
            <input type ="hidden" name ="idOggetto" value="${oggetto.getId()}" />
                <td class="table">  <input name="elimina" type="submit"  value ="Elimina" />
                    </td>
            </tr>
        </form>

    </c:forEach>
           

</table>