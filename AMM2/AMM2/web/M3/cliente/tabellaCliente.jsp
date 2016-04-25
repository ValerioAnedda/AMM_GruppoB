<%-- 
    Document   : tabellaCliente
    Created on : 25-apr-2016, 15.39.58
    Author     : valerio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tabella Cliente</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Valerio Anedda 44940">
        <meta name="keywords" content="Tabella Cliente Spendi e Spandi">  
        <link href="src/css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <table class="tabella-cliente">
            <!----- PRIMA RIGA COLONNA INTESTAZIONE --->
            <tr class="table-title">
                <th> Nome Prodotto</th>            
                <th> immagine</th>
                <th> Quantità</th>
                <th> prezzo</th>
                <th> carrello</th>
            </tr> 
            
            <!--- 2 RIGA : ARIA FRESCA ---->
            <tr class="table-pari">
                 <td class="table"><p> Aria fresca </p></td>
                 <td class="table"> <img title="aria fresca" alt="aria fresca" 
                           src="src/img clienti/ariaFresca.jpg"> </td>
                 <td class="table"><p> 1000 pz </p></td>
                 <td class="table"><p> 4 euro </p></td>
                 <td class="table"> <a href="#"> <img title="carrello" alt="vai al carrello"  
                                        src="src/img clienti/carrello.gif"> </a></td>
            </tr>

            <!--- 3 RIGA : SOGNI nel Cassetto ---->
            <tr class="table-dispari">
                <td class="table"> <p> Sogni <br> nel cassetto </p></td>
                 <td class="table"> <img  title="Sogni" alt="Sogni nel Cassetto" 
                           src="src/img clienti/SogniNelCassetto.jpg" > </td>
                 <td class="table"><p> 3 pz </p></td>
                 <td class="table"><p> 40 euro </p></td>
                 <td class="table"> <a href="#"> <img title="carrello" alt="vai al carrello"  
                                        src="src/img clienti/carrello.gif" > </a></td>
            </tr>

            <!--- 4 RIGA : Attico in centro ---->
            <tr class="table-pari">
                <td class="table"> <p> Attico <br> in centro </p></td>
                 <td class="table"> <img   title="attico" alt="attico in centro" 
                           src="src/img clienti/atticoInCentro.jpg" > </td>
                 <td class="table"><p> 1 pz </p></td>
                 <td class="table"><p> 4000000,05 euro </p></td>
                 <td class="table"> <a href="#"> <img title="carrello" alt="vai al carrello" 
                                        src="src/img clienti/carrello.gif"> </a></td>
            </tr>

            <!--- 5 RIGA : Tre Euro ---->
            <tr class="table-dispari">
                <td class="table"> <p> Tre <br> Euri  </p></td>
                 <td class="table"> <img   title="treEuro" alt="Tre euri" 
                           src="src/img clienti/tre_euro.jpg"> </td>
                 <td class="table"><p> 4 pz </p></td>
                 <td class="table"><p> 2.99 euro </p></td>
                 <td class="table"> <a href="#"> <img title="carrello" alt="vai al carrello" 
                                        src="src/img clienti/carrello.gif" > </a></td>
            </tr>

             <!--- 6 RIGA : Abbraccio ---->
            <tr class="table-pari">
                <td class="table"> <p> Un <br> Abbraccio  </p></td>
                 <td class="table"> <img   title="Un Abbraccio" alt="Un abbraccio forte forte" 
                           src="src/img clienti/unAbbraccio.png" width="120" height="141"> </td>
                 <td class="table" ><p > 1000000000 pz </p></td>
                 <td class="table"><p> 1 euro </p></td>
                 <td class="table"> <a href="#"> <img title="carrello" alt="vai al carrello" 
                                        src="src/img clienti/carrello.gif" > </a></td>
            </tr>

        </table>
    </body>
</html>
