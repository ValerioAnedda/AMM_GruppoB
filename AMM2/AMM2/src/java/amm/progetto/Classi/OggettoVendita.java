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
public class OggettoVendita {
        /* Attributi */
    private Integer id;
    private String nome;
    private String urlImmagine;
    private Integer quantita;
    private Integer prezzo;
    private UtenteVenditore venditore; 
    private String categoria;

    /** Costruttore OggettoVendita ***/
    
    public OggettoVendita(){
            id = 0;
            nome = "";
            urlImmagine ="";
            quantita = 0;
            prezzo = 0;
            venditore = new UtenteVenditore();
            categoria = "";
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * @return the urlImmagine
     */
    public String getUrlObject(){
        return urlImmagine;
    }
    
    /**
     * @param urlImmagine the urlImmagine to set
     * 
     */
     public void setUrlObject(String urlImmagine){
        this.urlImmagine = urlImmagine;
    }
     
     /**
     * @return the quantita
     */
     public Integer getQuantita(){
         return quantita;
     }
       
     /**
     * @param quantita the quantita to set
     * 
     */
     public void setQuantita(Integer quantita){
         this.quantita = quantita;
     }
     
     
    /**
     * @return the prezzo
     */
     public Integer getPrezzo(){
         return this.prezzo;
     }
    /**
     * @param prezzo the prezzo to set
     * 
     */
     public void setPrezzo(Integer prezzo){
         this.prezzo=prezzo;
     }
     
     /**
     * @return the venditore
     */
     public UtenteVenditore getVenditore(){
         return this.venditore;
     }
     
     /**
     * @param venditore the venditore to set
     * 
     */
     public void setVenditore( UtenteVenditore venditore ){
         this.venditore = venditore;
     }
     
    /**
     * @return the categoria
     */
     public String getCategoria(){
         return this.categoria;
     }
     
     /**
     * @param categoria the categoria to set
     * 
     */
     public void setCategoria( String categoria ){
         this.categoria = categoria;
     } 
     
     
     
     
}
