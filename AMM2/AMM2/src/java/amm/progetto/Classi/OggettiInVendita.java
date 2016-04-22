/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Valerio
 */
public class OggettiInVendita {
    /** Attributi **/ 
    ArrayList<OggettoVendita> oggetti = new ArrayList<OggettoVendita>();
    
    /**
     * @return the listaOggeti
     */
     public ArrayList<OggettoVendita> getListaOggetti(){
         return this.oggetti;
     }
    
     /**
     * @return the listaOggeti di un Venditore
     */
    public ArrayList<OggettoVendita> getOggettiVenditore(UtenteVenditore venditore){ 
        ArrayList<OggettoVendita> lista = new ArrayList<OggettoVendita>();
       
        
       for ( int i = 0 ; i <= oggetti.size() ; i++)
       {    
           if ( oggetti.get(i).getVenditore().equals(venditore))
           {
                lista.add(oggetti.get(i));
            }
       }
        
        return lista;
    }
    
    /**
     * @param nome  il nome dell' object
     * @param urlImmagine the urlImmagine to object
     * @param quantita la quantità dell'immagine
     * @param prezzo il prezzo
     * @param venditore il venditore dell'oggetto
     * @param categoria la categoria dell'oggetto
     */
    public void addOggettoInVendita(String nome, String urlImmagine, Integer quantita ,
                                    Integer prezzo , UtenteVenditore venditore, String categoria) {
    
        OggettoVendita oggetto = new OggettoVendita();
        
        Integer id ;
        
        /** recupera l'id dell'ultimo oggetto inserito e lo incrementa di 1**/
        id = oggetti.get(oggetti.size()).getId() + 1;
        /** setta tutti i parametri dell'oggetto in vendita **/
        oggetto.setId(id);
        oggetto.setNome(nome);
        oggetto.setUrlObject(urlImmagine);
        oggetto.setQuantita(quantita);
        oggetto.setVenditore(venditore);
        oggetto.setCategoria(categoria);
    }
    
    
    
    
}
