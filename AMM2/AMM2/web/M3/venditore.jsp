<%-- 
    Document   : venditore
    Created on : 25-apr-2016, 15.32.02
    Author     : valerio
--%>

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
                   
                    <h2 aling="center"> Benevenuto nell'area del Venditore </h2>
                    <p> Qui potrai vendere tante belle cose inutili per tutti ma utili peri tuoi guadagni <br>
                        hai un vecchio tavolo? Hai un veccio tappeto, hai una lamapda a olio che non ti <br>
                        serve più? qui puoi metterla in vendita e ricavare i soldi per poter comprare altre<br>
                        cose inutili nel nostro bellissimo eCommerce.</p>
                        <h7> Per spendere tanti solti visita <a href="./cliente.jsp"> Area Clienti</a>. </h4> </h7>
                        <table class="tabellaVenditore">      
                            <td> <h4> compila i campi e diventa ricco!!</h4> </td>
                            <tbody>
                                <tr> <td>  <label for="nomeOggetto">inserisci il Nome Oggetto</label> </td>
                                         <td>    <input class="areaVenditore-input" name="NomeOggetto" id="nomeOggetto" type="text"/> </td> 
                                        </tr>
                                <tr>        <td> <label for="urlImg"> inseriscie l'url dell'immagine </label></td> 
                                           <td>  <input class="areaVenditore-input" name="urlImg" id="urlImg" type="text"/> </td> 
                                        </tr>
                                <tr>        
                                        <td>  <label for="descrizioneOggetto"> inserisci una descrizione </label></td>    
                                         <td>    <input  class="areaVenditore-input" name="descrizioneOggetto" id="descrizioneOggetto" type="text"/>  </td>      
                                        </tr>
                                <tr>            
                                        <td>  <label for="prezzoOggetto"> inserisci il Prezzo </label></td>    
                                            <td> <input class="areaVenditore-input"  name="prezzoOggetto" id="prezzoOggetto" type="text"/> </td>    
                                         </tr>
                                <tr>           
                                          <td> <label for="quantitàOggetto"> inserisci la quantità </label></td>    
                                           <td>  <input  class="areaVenditore-input" name="quantitàOggetto" id="quantitàOggetto" type="text"/>    </td>    
                                         </tr>
                                <tr>         

                                           <td>  <input name="richiesta" type="submit" formmethod="post" value ="Carica oggetto"/> </td>    
                                        </tr>
                            </tbody>
                        </table>

                   
   
            </div>  
            


        </div>
        <!--FINE CORPO DELLA PAGINA -->
         
       
        <!-- FOOTER -->
         <%@include file="include/footer.jsp" %> 
        <!-- FINE FOOTER-->  
        
        </body>
</html>
