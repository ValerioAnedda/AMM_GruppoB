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
public class UtenteVenditore {
    
    /** Attributi Utente Venditore ***/
    private ArrayList<OggettoVendita> oggetti = new ArrayList<OggettoVendita>();
    
    
    public OggettoVendita getOggetto(int n){
        return oggetti.get(n);
    }
    
    
    
}
