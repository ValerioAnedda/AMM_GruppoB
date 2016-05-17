/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

/**
 *
 * @author valerio
 */
public class ContoUtente {
        /** Attributi ***/
        
        Double saldo ;
        
        public ContoUtente(){
            saldo = 0.0;
        }
        
        public ContoUtente(Double saldo){
            this.saldo = saldo;
        }
        
     /**
     * @param incremento incrementa il conto dell'utente.
     */
    public void incrementConto(Double incremento) {
        this.saldo = this.saldo + incremento; 
    }
    
    /**
     * @param decremento decrementa il conto dell'utente.
     */
    public void decrementConto(Double decremento) {
        this.saldo = this.saldo - decremento; 
    }
}
