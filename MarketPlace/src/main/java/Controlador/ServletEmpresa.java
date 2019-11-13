/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.google.gson.Gson;
import com.mycompany.marketplace.Empresa;
import com.mycompany.marketplace.Modelito;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author as
 */
@WebServlet(name = "ServletEmpresa", urlPatterns = {"/ServletEmpresa"})
public class ServletEmpresa extends HttpServlet {


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
            throws ServletException, IOException {
        
        
        
                
        Gson g = new Gson();
            
        int idEmpresa = Integer.parseInt(request.getParameter("idEmpresa"));
        String nombre = request.getParameter("nombre");
        String nit = request.getParameter("nit");
        String correo=request.getParameter("correo");
        String celular=request.getParameter("celular");
        String contrasena = request.getParameter("contrasena");
        
        //System.out.println(nombre);
         PrintWriter out = response.getWriter();

        
        
      Empresa em =new Empresa(idEmpresa, nombre, nit, correo, celular, contrasena);
        
        Modelito m= new Modelito();
        m.guardarEmpresa(em);
        
       String a;
       a=g.toJson(em);
       //out.println(per);
        
        out.println(a);
      
        System.out.println(a);
        
        
       

      
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
