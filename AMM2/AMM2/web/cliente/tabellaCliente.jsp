<%-- 
    Document   : tabellaCliente
    Created on : 25-apr-2016, 15.39.58
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
        <form action="Cliente" method="GET">

        <!--- 2 RIGA : ARIA FRESCA ---->
        


            <tr class="table-pari">

                <td class="table"><p> ${oggetto.nome}  </p></td>
                <td class="table"> <img title="${oggetto.nome}" src="${oggetto.getUrlObject()}"> </td>
                <td class="table"><p> ${oggetto.quantita} pz </p></td>
                <td class="table"><p> ${oggetto.quantita} euro </p></td>
                <td class="table"> 
                     <a href="Cliente?idOggetto=${oggetto.id}"> <img title="carrello" alt="vai al carrello"  
                                         src="src/img clienti/carrello.gif"> </a> </td>
            </tr>
        </form>

    </c:forEach>
           

</table>


