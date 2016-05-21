/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author valerio
 */
public final class UtentiFactory {
    
    private static UtentiFactory singleton;
    public static UtentiFactory getInstance() {
        if (singleton == null) {
            singleton = new UtentiFactory();
        }
        return singleton;
    }
    
    // Lista Oggetti
    private ArrayList<OggettoVendita> listaOggetti = new ArrayList<>();
    // Lista Venditori
    private ArrayList<UtenteVenditore> listaVenditori = new ArrayList<>();
    // Lista Clienti
    private ArrayList<UtenteCliente> listaClienti = new ArrayList<>();
    //
    String connectionString = new String();
    
    
    /** COSTRUTTORE **/ 
    private UtentiFactory(){
        
        /*        listaVenditori = getVenditori();
        listaClienti = getClienti();
        listaOggetti = getOggetti();*/
    
    }
    
    
    /** METODI
     * @param s ****/
    
    
        public void setConnectionString(String s){
            this.connectionString = s;
         }

        public String getConnectionString(){
            return this.connectionString;
        } 
        
        /**
        * @return la lista totale degli utenti  **/
        public ArrayList getUtentiList (){
           ArrayList<Utente> listaUtenti = new ArrayList<>();

            listaUtenti.addAll(getVenditori());
            listaUtenti.addAll(getClienti());

           return listaUtenti;
        }

    
    /** METODI OGGETTI */
     
            /**
            * @return la lista totale degli oggetti  **/
            public ArrayList getOggetti (){
                    ArrayList<OggettoVendita> listaObject = new ArrayList<OggettoVendita>();
           
            try{
                String db = getConnectionString();
                
                Connection conn = DriverManager.getConnection(db , "amm", "amm");
                
                Statement stmt = conn.createStatement();
                String query = "select * from AMM.OGGETTOINVENDITA ";
                
                ResultSet set = stmt.executeQuery(query);
                
                while(  set.next()){
                    OggettoVendita object = new OggettoVendita();
                    
                    object.setId(set.getInt("id"));
                    object.setNome(set.getString("Nome"));
                    object.setUrlObject(set.getString("urlimmagine"));
                    object.setPrezzo(set.getDouble("Prezzo"));
                    object.setQuantita(set.getInt("quantita"));
                    object.setVenditore(getVenditore((Integer)set.getInt("idvenditore")));
                    
                    
                    listaObject.add(object);
                }                        
                stmt.close();
                conn.close();
            }
            catch(SQLException ex){
            //nel caso ci siano errori di connessione con il db
            Logger.getLogger( "Error in getUtentiList"  + ex );
            }
            
           return listaObject;
                    
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
            public ArrayList<UtenteVenditore> getVenditori (){
                
            ArrayList<UtenteVenditore> listaUtenti = new ArrayList<UtenteVenditore>();
           
            try{
                String db = getConnectionString();
                
                Connection conn = DriverManager.getConnection(db , "amm", "amm");
                
                Statement stmt = conn.createStatement();
                String query = "select * from AMM.utente where tipoutente = 'Venditore' ";
                
                ResultSet set = stmt.executeQuery(query);
                
                while(  set.next()){
                    UtenteVenditore user = new UtenteVenditore();
                    
                    user.setId(set.getInt("id"));
                    user.setNome(set.getString("nome"));
                    user.setCognome(set.getString("cognome"));
                    user.setPassword(set.getString("password"));
                    user.setUsername(set.getString("username"));
                    
                    
                    listaUtenti.add(user);
                }                        
                stmt.close();
                conn.close();
            }
            catch(SQLException ex){
            //nel caso ci siano errori di connessione con il db
            Logger.getLogger( "Error in getUtentiList"  + ex );
            }
            
           return listaUtenti;
              
            }

            /**
             * @param id id venditore da restituire
             @return restituisce il venditore di id settato*/
            public UtenteVenditore getVenditore(Integer id){
                UtenteVenditore user = new UtenteVenditore();
               try{
                String db = getConnectionString();
                
                Connection conn = DriverManager.getConnection(db , "amm", "amm");
                
                Statement stmt = conn.createStatement();
                String query = "select * from AMM.utente where tipoutente = 'Venditore' and id = " + id;
                
                ResultSet set = stmt.executeQuery(query);

                user.setId(set.getInt("id"));
                    user.setNome(set.getString("nome"));
                    user.setCognome(set.getString("cognome"));
                    user.setPassword(set.getString("password"));
                    user.setUsername(set.getString("username"));
                           
                    
                 
                                       
                stmt.close();
                conn.close();
            }
            catch(SQLException ex){
            //nel caso ci siano errori di connessione con il db
            Logger.getLogger( "Error in getUtentiList"  + ex );
            }
            
           return user;
            }
    
    
    /** METORDI CLIENTE **/ 
    
            /**
           * @return la lista totale dei Clienti  **/
           public ArrayList getClienti (){
               ArrayList<UtenteCliente> listaClienti = new ArrayList<UtenteCliente>();
           
            try{
                String db = getConnectionString();
                
                Connection conn = DriverManager.getConnection(db , "amm", "amm");
                
                Statement stmt = conn.createStatement();
                String query = "select * from AMM.utente where tipoutente = 'Cliente' ";
                
                ResultSet set = stmt.executeQuery(query);
                
                while(  set.next()){
                    UtenteCliente user = new UtenteCliente();
                    
                    user.setId(set.getInt("id"));
                    user.setNome(set.getString("nome"));
                    user.setCognome(set.getString("cognome"));
                    user.setPassword(set.getString("password"));
                    user.setUsername(set.getString("username"));
                           
                    
                    listaClienti.add(user);
                }                        
                stmt.close();
                conn.close();
            }
            catch(SQLException ex){
            //nel caso ci siano errori di connessione con il db
            Logger.getLogger( "Error in getUtentiList"  + ex );
            }
            
           return listaClienti;
           }

           /**
            * @param id id cliente da restituire
            @return restituisce il cliente di id settato*/
           public UtenteCliente getCliente(Integer id){
               UtenteCliente user = new UtenteCliente();
               try{
                String db = getConnectionString();
                
                Connection conn = DriverManager.getConnection(db , "amm", "amm");
                
                Statement stmt = conn.createStatement();
                String query = "select * from AMM.utente where tipoutente = 'Cliente' and id = " + id;
                
                ResultSet set = stmt.executeQuery(query);

                    user.setId(set.getInt("id"));
                    user.setNome(set.getString("nome"));
                    user.setCognome(set.getString("cognome"));
                    user.setPassword(set.getString("password"));
                    user.setUsername(set.getString("username"));
                                   
                                       
                stmt.close();
                conn.close();
            }
            catch(SQLException ex){
            //nel caso ci siano errori di connessione con il db
            Logger.getLogger( "Error in getUtentiList"  + ex );
            }
            
           return user;
               
               
               
           }
    
}
