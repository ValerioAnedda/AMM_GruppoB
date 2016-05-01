/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

import java.util.ArrayList;

/**
 *
 * @author valerio
 */
public class UtentiFactory {
    
    private static UtentiFactory singleton;
    public static UtentiFactory getInstance() {
        if (singleton == null) {
            singleton = new UtentiFactory();
        }
        return singleton;
    }
    
    // Lista Oggetti
    private ArrayList<OggettoVendita> listaOggetti = new ArrayList<OggettoVendita>();
    // Lista Venditori
    private ArrayList<Utente> listaVenditori = new ArrayList<Utente>();
    // Lista Clienti
    private ArrayList<Utente> listaClienti = new ArrayList<Utente>();
    
    
    /** COSTRUTTORE **/ 
    private UtentiFactory(){
        
       
        
        // Oggetti in vendita
        
        /* Oggetto 1 */
        OggettoVendita oggetto1 = new OggettoVendita(); 
        /* Set attributi oggetto 1 */ 
        oggetto1.setId(1); oggetto1.setNome("Aria fresca"); oggetto1.setUrlObject("src/img clienti/ariaFresca.jpg"); oggetto1.setQuantita(1000); 
        oggetto1.setPrezzo(4.0); 
        listaOggetti.add(oggetto1);
        
         /* Oggetto 2 */
        OggettoVendita oggetto2 = new OggettoVendita(); 
        /* Set attributi oggetto 2 */ 
        oggetto2.setId(2); oggetto2.setNome("Sogni nel cassetto"); oggetto2.setUrlObject("src/img clienti/SogniNelCassetto.jpg"); oggetto2.setQuantita(3); 
        oggetto2.setPrezzo(40); 
        listaOggetti.add(oggetto2);
        
         /* Oggetto 3 */
        OggettoVendita oggetto3 = new OggettoVendita(); 
        /* Set attributi oggetto 3 */ 
        oggetto3.setId(3); oggetto3.setNome("Attico in centro"); oggetto3.setUrlObject("src/img clienti/atticoInCentro.jpg"); oggetto3.setQuantita(1); 
        oggetto3.setPrezzo(4000000.05); 
        listaOggetti.add(oggetto3);
        
         /* Oggetto 4 */
        OggettoVendita oggetto4 = new OggettoVendita(); 
        /* Set attributi oggetto 4 */ 
        oggetto4.setId(4); oggetto4.setNome("Tre Euri"); oggetto4.setUrlObject("src/img clienti/tre_euro.jpg"); oggetto4.setQuantita(4); 
        oggetto4.setPrezzo(2.99); 
        listaOggetti.add(oggetto4);
        
        /* Oggetto 5 */
        OggettoVendita oggetto5 = new OggettoVendita(); 
        /* Set attributi oggetto 5 */ 
        oggetto5.setId(5); oggetto5.setNome("Un Abbraccio"); oggetto5.setUrlObject("src/img clienti/unAbbraccio.png"); oggetto5.setQuantita(1000000000); 
        oggetto5.setPrezzo(1);
        listaOggetti.add(oggetto5);
        
        
        // Venditore 1
        UtenteVenditore venditore_1 = new UtenteVenditore();
        venditore_1.setUsername("Venditore1");
        venditore_1.setPassword("Venditore1");
        venditore_1.setNome("Mario");
        venditore_1.setCognome("Rossi");
        venditore_1.setId(1);
        
        ArrayList<OggettoVendita> arrayOggettiVenditaVenditore_1 = new ArrayList<OggettoVendita>();
        arrayOggettiVenditaVenditore_1.add(oggetto1);
        arrayOggettiVenditaVenditore_1.add(oggetto2);
        arrayOggettiVenditaVenditore_1.add(oggetto3);
        arrayOggettiVenditaVenditore_1.add(oggetto4);
       
        listaVenditori.add(venditore_1);
        
        // Venditore 2
        UtenteVenditore venditore_2 = new UtenteVenditore();
        venditore_2.setUsername("Venditore2");
        venditore_2.setPassword("Venditore2");
        venditore_2.setNome("Carlo");
        venditore_2.setCognome("Bianchi");
        venditore_2.setId(2);
        
        ArrayList<OggettoVendita> arrayOggettiVenditaVenditore_2 = new ArrayList<OggettoVendita>();
        arrayOggettiVenditaVenditore_2.add(oggetto5);
       
        listaVenditori.add(venditore_2);
        
        
        
       // Cliente 1 
       UtenteCliente cliente_1 = new UtenteCliente();
       cliente_1.setId(1); 
       cliente_1.setUsername("Cliente1"); cliente_1.setPassword("Cliente1");
       cliente_1.setNome("Paolo"); cliente_1.setCognome("Verdi");
       listaClienti.add(cliente_1);
       
       // Cliente 2 
       UtenteCliente cliente_2 = new UtenteCliente();
       cliente_1.setId(2); 
       cliente_1.setUsername("Cliente2"); cliente_1.setPassword("Cliente2");
       cliente_1.setNome("Giovanni"); cliente_1.setCognome("Gialli");
       listaClienti.add(cliente_2);
     
    }
    
    
    /** METODI ****/
        
            /**
            * @return la lista totale degli utenti  **/
            public ArrayList getUtentiList (){
               ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
        
                listaUtenti.addAll(listaVenditori);
                listaUtenti.addAll(listaClienti);
        
               return listaUtenti;
            }
    
    
    /** METODI OGGETTI */
     
            /**
            * @return la lista totale degli oggetti  **/
            public ArrayList getOggetti (){
                return this.listaOggetti;
            }

            /**
             * @param id id oggetto da restituire
             @return restituisce l'oggetto con id*/
            public OggettoVendita getOggetto(Integer id){

                return listaOggetti.get(id-1);
             }
    
        
    /** METODI VENDITORE **/
    
            /**
            * @return la lista totale dei Venditori  **/
            public ArrayList getVenditori (){
                return this.listaVenditori;
            }

            /**
             * @param id id venditore da restituire
             @return restituisce il venditore di id settato*/
            public Utente getVenditore(Integer id){

                return listaVenditori.get(id-1);
            }
    
    
    /** METORDI CLIENTE **/ 
    
            /**
           * @return la lista totale dei Clienti  **/
           public ArrayList getClienti (){
               return this.listaClienti;
           }

           /**
            * @param id id cliente da restituire
            @return restituisce il cliente di id settato*/
           public Utente getCliente(Integer id){

               return listaClienti.get(id-1);
           }
    
}
