/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Constructores.Habitacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author iUser
 */
public class SerUpdateHab extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 

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
            throws ServletException, IOException, NumberFormatException {
    // Servlet para actualizar habitacion
    try{
    Habitacion hab;
        
    String sid = request.getParameter("id");
    int id = Integer.parseInt(sid);
    String num = request.getParameter("numero");
    String tipo = request.getParameter("tipo");
    String esta = request.getParameter("estado");
    String preci = request.getParameter("precio");
    
    hab = new Habitacion(id,num,tipo,esta,preci);
    
    DAO.DaoHabitacion.update(hab);
    
    response.sendRedirect("http://localhost:8080/ControlHotels/SerHabTab");
    }
    catch(NumberFormatException e)
    {
    System.out.println("error al actualizar" +e);
    response.sendRedirect("http://localhost:8080/ControlHotels/SerHabTab");
    }
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
