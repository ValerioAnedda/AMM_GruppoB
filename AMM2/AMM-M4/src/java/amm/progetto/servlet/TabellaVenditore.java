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
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "TabellaVenditore", urlPatterns = {"/TabellaVenditore"})
public class TabellaVenditore extends HttpServlet {



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

        
        HttpSession session = request.getSession(false);
        
           UtenteVenditore u = UtentiFactory.getInstance().getVenditore((int) session.getAttribute("id"));
            //request.setAttribute("venditore", UtentiFactory.getInstance().getVenditore((int) session.getAttribute("id")));

           
            request.setAttribute("auth", true);
        
            
        
        
        
                int idOggetto = Integer.parseInt(request.getParameter("idOggetto"));

                UtentiFactory.getInstance().deleteOggetto(idOggetto);
                

        
        
                
                
                request.setAttribute("utente", u);
                request.setAttribute("oggetti", UtentiFactory.getInstance().getOggetti((int) session.getAttribute("id")));
                request.getRequestDispatcher("./venditore.jsp")
                        .forward(request, response);
        request.getRequestDispatcher("./venditore.jsp").forward(request, response);
        
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
