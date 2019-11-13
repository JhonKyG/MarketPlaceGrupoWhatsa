/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.google.gson.Gson;
import com.mycompany.marketplace.Modelito;
import com.mycompany.marketplace.Usuario;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author as
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
public class ServletUsuario extends HttpServlet {

    

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
    
        Gson g = new Gson();
            
        String contQR= request.getParameter("contQR");
        
        //String nombre=request.getParameter("nombre");
        System.out.println(contQR);
        PrintWriter out = response.getWriter();

        
        Modelito m= new Modelito();
        
        String a=null;
        //String b=null;
        
        if(contQR!=null){
            a=g.toJson(m.filtroQR(contQR));
            //b=g.toJson(m.mostrarUsuario());
        }
        
        out.println(a);
        
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
            
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String cedula = request.getParameter("cedula");
        String correo=request.getParameter("correo");
        String celular=request.getParameter("celular");
        String contrasena = request.getParameter("contrasena");
        int saldo = Integer.parseInt(request.getParameter("saldo"));
        
        //System.out.println(nombre);
         PrintWriter out = response.getWriter();

        
        
      Usuario per =new Usuario(id, nombre, cedula, correo, celular, contrasena, saldo);
        
        Modelito m= new Modelito();
        m.guardarUsuario(per);
        
       String a;
       a=g.toJson(per);
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
