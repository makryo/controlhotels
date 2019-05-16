/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Constructores.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iUser
 */
public class SerId extends HttpServlet {

    

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
            String convert = request.getParameter("id");
            int id = Integer.parseInt(convert);
            Cliente li;
            li = DAO.DaoCliente.getById(id);
            request.setAttribute("Cliente", li);
            request.getRequestDispatcher("Update.jsp").forward(request, response);
            System.out.println(id);
    }
     

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
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
