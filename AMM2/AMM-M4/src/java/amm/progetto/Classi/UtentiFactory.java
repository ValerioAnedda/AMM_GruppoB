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
            // path, username, password
            Connection conn = DriverManager.getConnection(db,  "amm", "amm");
            // Query
            String query = "select * from OGGETTOINVENDITA ";
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
            
            
            /**
             * @param id Id del Venditore
            * @return la lista totale degli oggetti di un venditgore  **/
            public ArrayList getOggetti (int idVenditore){
                    ArrayList<OggettoVendita> listaObject = new ArrayList<OggettoVendita>();
           
            try{
            String db = getConnectionString();
            // path, username, password
            Connection conn = DriverManager.getConnection(db,  "amm", "amm");
            // Query
            String query = "select * from OGGETTOINVENDITA Where idVenditore =" + idVenditore ;
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
             * @param object object da caricare
             */
            public void addOggetto(OggettoVendita object, Integer idVenditore){
                    try{
                        
                        
                        /*
                        String db = getConnectionString();
                        Connection conn = DriverManager.getConnection(db, "amm", "amm");
                        
                        String query = "insert into AMM.OggettoInVendita( id, nome, urlImmagine, quantita, prezzo, descrizione, idVenditore, idCategoria) "
                        + "values (default, ?, ?, ?, ?, ?, ?, 1);";
                        
                        PreparedStatement stmt = conn.prepareStatement(query);
                        
                        stmt.setString(1, object.getNome());
                        stmt.setString(2, object.getUrlObject());
                        stmt.setInt(3, object.getQuantita());
                        stmt.setDouble(4, object.getPrezzo());
                        stmt.setString(5, object.getDescrizione());
                        stmt.setInt(6, idVenditore);
                        
                        
                        int rows = stmt.executeUpdate(query);
                        stmt.close();
                        conn.close();*/

                        
                        /**********************************************************/
                            String db = getConnectionString();
                            // path, username, password
                            Connection conn = DriverManager.getConnection(db,  "amm", "amm");
                            
                            Statement stmt =conn.createStatement();
                            // Query
                            String query = "INSERT INTO AMM.OggettoInVendita ( id, nome, urlImmagine, quantita, prezzo, descrizione, idVenditore )"+
                            "VALUES( default , '"+ object.getNome() +"' , '"+ object.getUrlObject() + "', "+ object.getQuantita()
                            +", "+ object.getPrezzo()+ ", '" + object.getDescrizione()+"', " + idVenditore+ ")" ;
                            
                            stmt.executeUpdate(query);
                                stmt.close();
                                conn.close();
                               
                            }
                    catch(SQLException ex){
                    //nel caso ci siano errori di connessione con il db
                    Logger.getLogger( "Error in getUtentiList"  + ex );
                    }
             }
            /**
             * @param object object da caricare
             */
            public void deleteOggetto( Integer idOggetto){
               try{
                        
                            String db = getConnectionString();
                            // path, username, password
                            Connection conn = DriverManager.getConnection(db,  "amm", "amm");
                            
                           // Statement stmt =conn.createStatement();
                            // Query
                            String query = "Delete From AMM.OggettoInVendita Where id = "+idOggetto ;
                            
                            
                             PreparedStatement stmt = conn.prepareStatement(query);
                                                
                             stmt.executeQuery();
                            
                            
                                stmt.close();
                                conn.close();
                               
                            }
                    catch(SQLException ex){
                    //nel caso ci siano errori di connessione con il db
                    Logger.getLogger( "Error in getUtentiList"  + ex );
                    }
             }
    
        
    /** METODI VENDITORE **/
    
            /**
            * @return la lista totale dei Venditori  **/
            public ArrayList getVenditori (){
                
            ArrayList<UtenteVenditore> listaUtenti = new ArrayList<UtenteVenditore>();
           
            try{
                
            String db = getConnectionString();
            // path, username, password
            Connection conn = DriverManager.getConnection(db,  "amm", "amm");
            // Query
            String query = "select * from utente where tipoutente = 'Venditore' ";
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
            public UtenteVenditore getVenditore(Integer id){
                UtenteVenditore user = new UtenteVenditore();
               try{
                        String db = getConnectionString();
                   // path, username, password
                         Connection conn = DriverManager.getConnection(db,  "amm", "amm");
                   // Query
                       String query = "select * from utente where tipoutente = 'Venditore' and id = " + id;
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
               ArrayList<UtenteCliente> listaClienti = new ArrayList<UtenteCliente>();
           
            try{
               String db = getConnectionString();
            // path, username, password
            Connection conn = DriverManager.getConnection(db,  "amm", "amm");
            // Query
                String query = "select * from  utente where tipoutente = 'Cliente' ";            // Prepared Statement
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
           public UtenteCliente getCliente(Integer id){
               UtenteCliente user = new UtenteCliente();
               try{
                 String db = getConnectionString();
            // path, username, password
            Connection conn = DriverManager.getConnection(db, "amm", "amm");
            // Query
                String query = "select * from utente where tipoutente = 'Cliente' and id = " + id;
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
