/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
        String connectionString = new String();

    
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
               try{ 
                        String db = getConnectionString();
                    // path, username, password
                    Connection conn = DriverManager.getConnection(connectionString,  "amm", "amm");
                    // Query
                    String query = "select * from AMM.utente ";
                    // Prepared Statement
                    PreparedStatement stmt = conn.prepareStatement(query);
                    // Si associano i valori

                    // Esecuzione query
                    ResultSet set = stmt.executeQuery();


                        while(  set.next()){
                            UtenteVenditore user = new UtenteVenditore();

                            int id = set.getInt("id");
                            String nome = set.getString("nome");
                            String cognome = set.getString("cognome");
                            String password = set.getString("password");
                            String username = set.getString("username"); 

                            user.setId(id);
                            user.setNome(nome);
                            user.setCognome(cognome);
                            user.setPassword(password);
                            user.setUsername(username);


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

    
    /** METODI OGGETTI */
     
            /**
            * @return la lista totale degli oggetti  **/
            public ArrayList getOggetti (){
                    ArrayList<OggettoVendita> listaObject = new ArrayList<OggettoVendita>();
           
            try{
            String db = getConnectionString();
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString,  "amm", "amm");
            // Query
            String query = "select * from AMM.OGGETTOINVENDITA ";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            
            // Esecuzione query
            ResultSet set = stmt.executeQuery();
            
                
                while(  set.next()){
                    OggettoVendita object = new OggettoVendita();
                    
                    object.setId(set.getInt("id"));
                    object.setNome(set.getString("Nome"));
                    object.setUrlObject(set.getString("urlimmagine"));
                    object.setPrezzo(set.getDouble("Prezzo"));
                    object.setQuantita(set.getInt("quantita"));
                    object.setVenditore((UtenteVenditore) getVenditore((Integer)set.getInt("idvenditore")));
                    
                    
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
            public ArrayList getVenditori (){
                
            ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
           
            try{
                
            String db = getConnectionString();
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString,  "amm", "amm");
            // Query
            String query = "select * from AMM.utente where tipoutente = 'Venditore' ";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            
            // Esecuzione query
            ResultSet set = stmt.executeQuery();
              
                
                while(  set.next()){
                    UtenteVenditore user = new UtenteVenditore();
                    
                    int id = set.getInt("id");
                    String nome = set.getString("nome");
                    String cognome = set.getString("cognome");
                    String password = set.getString("password");
                    String username = set.getString("username"); 
                    
                    user.setId(id);
                    user.setNome(nome);
                    user.setCognome(cognome);
                    user.setPassword(password);
                    user.setUsername(username);
                    
                    
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
            public Utente getVenditore(Integer id){
                UtenteVenditore user = new UtenteVenditore();
               try{
                 String db = getConnectionString();
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString,  "amm", "amm");
            // Query
                String query = "select * from AMM.utente where tipoutente = 'Venditore' and id = " + id;
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            
            // Esecuzione query
            ResultSet set = stmt.executeQuery();


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
               ArrayList<Utente> listaClienti = new ArrayList<Utente>();
           
            try{
               String db = getConnectionString();
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString,  "amm", "amm");
            // Query
                String query = "select * from AMM.utente where tipoutente = 'Cliente' ";            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            
            // Esecuzione query
            ResultSet set = stmt.executeQuery();

                
                
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
           public Utente getCliente(Integer id){
               UtenteCliente user = new UtenteCliente();
               try{
                 String db = getConnectionString();
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "amm", "amm");
            // Query
                String query = "select * from AMM.utente where tipoutente = 'Cliente' and id = " + id;
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            
            // Esecuzione query
            ResultSet set = stmt.executeQuery();
                


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
