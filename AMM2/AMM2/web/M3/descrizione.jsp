<%-- 
    Document   : descrizione
    Created on : 25-apr-2016, 15.31.31
    Author     : valerio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Descrizione Generale</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Valerio Anedda 44940">
        <meta name="keywords" content="Descrizione Spendi e Spandi">  
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
                <h1> Benvenuti su Spendi e Spandi </h1>
                <h2 align="center"> eCommerce di oggetti fantastici allegri e spensierati </h2>
                <p> La nostra ditta opera dal 1990 nel settore dell'oggettistica fantastica e faffinata <br>
                    I nostri esperti selezionano ogni giorno i migliori oggetti per esser messi in vendita e soddisfare le vostre fantasie <br>
                    </p>
                    <h6> Citazioni che ci riguardano "Le cose che possiedi finiscono col possederti." [Fight Club] </h6>
                    <p> Non esiste nulla di necessario, nulla di utile, nulla di inutile esiste ciò che Vuoi e ciò che non vuoi.
                        </p>


                    <h2 align="center"> Come comprare con noi </h2>
                    <p align="center"> Nulla di più facile, basta 
                        <br> effettuare  <a href="./login.jsp"><b>LOGIN!</b></a><br>
                    e selezinare i prodotti da inserire nel carrello, una volta fatto preparate la carta di credito e con un click riceverete la merce direttamente a casa vostra
                    <br> forse...</p>

                    <a id="oggetti_vendita"> 
                        <h3> OGGETTI IN VENDITA </h3>
                    </a>
                    <p> <i>Non trovi ciò che cerchi? Tu ci dici cosa ti serve e noi te lo procuriamo 
                            <br> visita la pagina dedicata ai <a href="./cliente.jsp">clienti</a></i></p>
                            <p> Qui puoi trovare in vendita tutto ciò che ti serve. Dai calcinacci 
                                ai castelli di sabbia, da delle belle boccate di aria fresca a dei bellissimi sogni 
                            già nel cassetto.</p>



                      <a id="funzionalità_venditori">       
                     <h3> FUNZIONALITA' VENDITORI </h3>
                      </a>
                            <p>Sei un venditore? Vuoi arricchirti con noi? <br>
                            Hai a casa della vecchia roba che non ti serve più? Vuoi liberarti di quel vecchio divano? 
                            <br> pensi che sia arrivato il momento di liberarti di quel vecchio regalo ricevuto a natare di quattro anni fa
                            <br> Semplicemente vuoi cercare di far fesso qualcuno?
                            <br> Accedi <a href="./venditore.jsp">all'area Venditori</a> e metti in vendita i tuoi oggetti, decidi tu il prezzo, tanto qualcuno che li comprerà su 6 miliardi di persone lo trovi sicuramente!</p>



                    <a id="funzionalità_clienti">
                      <h3> FUNZIONALITA' CLIENTI  </h3>
                            <p>Semplice come un click. 
                                <br> Scegli, clicca sull'immagine del carrello e PAGA!<br>
                            Riceverai direttametne via mail un immagine di ciò che hai comprato!</p>
                    </a>
            </div>  
        </div>
        <!--FINE CORPO DELLA PAGINA -->      
        
        <!-- FOOTER -->
         <%@include file="include/footer.jsp" %> 
        <!-- FINE FOOTER-->
      </body>
</html>
