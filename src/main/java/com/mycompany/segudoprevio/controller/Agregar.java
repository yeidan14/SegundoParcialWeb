/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segudoprevio.controller;

import com.mycompany.segudoprevio.dao.PersonaJpaController;
import com.mycompany.segudoprevio.dao.Utilidad;
import com.mycompany.segudoprevio.dto.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel
 */
public class Agregar extends HttpServlet {

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

        String documento = request.getParameter("documento");
        String email = request.getParameter("email");
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String nacionalidad = request.getParameter("nacionalidad");
        String edad =request.getParameter("edad");
       

        Persona nuevo = new Persona();
        nuevo.setDocumento(documento);
        nuevo.setNombres(nombres);
        nuevo.setApellidos(apellidos);
        nuevo.setEmail(email);
        nuevo.setEdad(edad);        
        nuevo.setNacionalidad(nacionalidad);
       Utilidad u=new Utilidad();
        Conexion con = Conexion.getConexion();
        PersonaJpaController per = new PersonaJpaController(con.getBd());
      
        try {            
            if(per.findPersona(documento)==null){
                per.create(nuevo);
            String registrado="registrado";
            request.setAttribute("registrado", registrado);
            request.getRequestDispatcher("Agregar.jsp").forward(request, response);
            
            }
            else{
            
                 String registrado="yaexiste";
            request.setAttribute("registrado", registrado);
            request.getRequestDispatcher("Agregar.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("erroruser.jsp");
        }

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
