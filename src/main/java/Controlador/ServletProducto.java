/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.google.gson.Gson;
import com.mycompany.marketplace.Modelito;
import com.mycompany.marketplace.Producto;



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
@WebServlet(name = "ServletProducto", urlPatterns = {"/ServletProducto"})
public class ServletProducto extends HttpServlet {

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
        
        Gson g = new Gson();
            
        String nombre= request.getParameter("nombre");
        System.out.println(nombre);
        PrintWriter out = response.getWriter();

        
        Modelito m= new Modelito();
        
       String a;
        if (nombre==null) {
            a=g.toJson(m.mostrarProducto());
        }else{
            a=g.toJson(m.filtroProducto(nombre));
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
            
        int idProducto = Integer.parseInt(request.getParameter("idProducto"));
        int precio = Integer.parseInt(request.getParameter("precio"));
        String categoria=request.getParameter("categoria");
        String descripcion=request.getParameter("descripcion");
        String nombre=request.getParameter("nombre");
        String url = request.getParameter("url");
        
        //System.out.println(nombre);
         PrintWriter out = response.getWriter();

        
        
      Producto pro =new Producto(idProducto, precio, categoria, descripcion, nombre, url);
        
        Modelito m= new Modelito();
        m.guardarProducto(pro);
        
       String a;
       a=g.toJson(pro);
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
