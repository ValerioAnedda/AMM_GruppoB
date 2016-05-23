<%-- 
    Document   : nuovoOggettoVenditore
    Created on : 1-mag-2016, 20.48.42
    Author     : valerio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="column-container"> 

    <h2 aling="center"> Benevenuto nell'area del Venditore ${utente.getNome()} </h2>
    <p> Qui potrai vendere tante belle cose inutili per tutti ma utili peri tuoi guadagni <br>
        hai un vecchio tavolo? Hai un veccio tappeto, hai una lamapda a olio che non ti <br>
        serve più? qui puoi metterla in vendita e ricavare i soldi per poter comprare altre<br>
        cose inutili nel nostro bellissimo eCommerce.</p>

    <table class="tabellaVenditore"> 
        <form action="Venditore" method="GET">

            <td> <h4> compila i campi e diventa ricco!!</h4> </td>
            <tbody>
                <tr> <td>  <label for="nomeOggetto">inserisci il Nome Oggetto</label> </td>
                    <td>    <input class="areaVenditore-input" name="NomeOggetto" id="nomeOggetto" type="text"/> </td> 
                </tr>
                <tr>        <td> <label for="urlImg"> inseriscie l'url dell'immagine </label></td> 
                    <td>  <input class="areaVenditore-input" name="UrlImg" id="urlImg" type="text"/> </td> 
                </tr>
                <tr>        
                    <td>  <label for="descrizioneOggetto"> inserisci una descrizione </label></td>    
                    <td>  <textarea  class="areaVenditore-input" name="DescrizioneOggetto" id="descrizioneOggetto" cols="40" rows="10" ></textarea> </td>      
                </tr>
                <tr>            
                    <td>  <label for="prezzoOggetto"> inserisci il Prezzo </label></td>    
                    <td> <input class="areaVenditore-input"  name="PrezzoOggetto" id="prezzoOggetto" type="text"/> </td>    
                </tr>
                <tr>           
                    <td> <label for="quantitàOggetto"> inserisci la quantità </label></td>    
                    <td>  <input  class="areaVenditore-input" name="QuantitaOggetto" id="quantitaOggetto" type="text"/>    </td>    
                </tr>
                <c:if test="${err}"><tr><td> <p>*compilare tutti i campi </p> </td></tr> </c:if>
                <tr>         

                    <td>  <input name="richiesta" type="submit"  value ="Carica oggetto"/> </td>    
                </tr>


            </tbody>


        </form>
    </table>

