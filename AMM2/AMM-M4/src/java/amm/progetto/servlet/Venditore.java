/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.servlet;

import amm.progetto.Classi.OggettoVendita;
import amm.progetto.Classi.Utente;
import amm.progetto.Classi.UtenteVenditore;
import amm.progetto.Classi.UtentiFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author valerio
 */
@WebServlet(name = "Venditore", urlPatterns = {"/Venditore"})
public class Venditore extends HttpServlet {


    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        ArrayList<UtenteVenditore> listaUtenti = UtentiFactory.getInstance().getVenditori();
        HttpSession session = request.getSession(false);
        
            request.setAttribute("venditore", UtentiFactory.getInstance().getVenditore((int) session.getAttribute("id")));

            UtenteVenditore u = UtentiFactory.getInstance().getVenditore((int) session.getAttribute("id"));
            request.setAttribute("auth", true);

            String nomeOggetto = request.getParameter("NomeOggetto");
            String urlImg = request.getParameter("UrlImg");
            String descrizione = request.getParameter("DescrizioneOggetto");
            String prezzo = request.getParameter("PrezzoOggetto");
            String quantita = request.getParameter("QuantitaOggetto");
            
            if (nomeOggetto.isEmpty() || urlImg.isEmpty() || descrizione.isEmpty() || prezzo.isEmpty() || quantita.isEmpty()) {
                
                request.setAttribute("oggetti", UtentiFactory.getInstance().getOggetti((int) session.getAttribute("id")));
                request.setAttribute("utente", u);
                request.setAttribute("err", true);
                request.getRequestDispatcher("./venditore.jsp").forward(request, response);
               
            }
            
            OggettoVendita oggetto = new OggettoVendita();
            
            oggetto.setNome(request.getParameter("NomeOggetto"));
            oggetto.setUrlObject(request.getParameter("UrlImg"));
            oggetto.setDescrizione(request.getParameter("DescrizioneOggetto"));
            oggetto.setPrezzo(request.getParameter("PrezzoOggetto"));
            oggetto.setQuantita(request.getParameter("QuantitaOggetto"));
            
            
            request.setAttribute("nomeOggetto", nomeOggetto);
            request.setAttribute("urlImg", urlImg);
            request.setAttribute("descrizione", descrizione);
            request.setAttribute("prezzo", prezzo);
            request.setAttribute("quantita", quantita);
            
            request.setAttribute("object", oggetto);
           
            
            
           UtentiFactory.getInstance().addOggetto(oggetto , (Integer) session.getAttribute("id"));
           
          
             
            request.getRequestDispatcher("./venditore/oggettoCaricato.jsp")
                    .forward(request, response);
        
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
