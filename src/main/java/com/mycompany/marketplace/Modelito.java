/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.marketplace;

import DAO.EmpresaDAO;
import DAO.ProductoDAO;
import DAO.UsuarioDAO;
import InterfazDAO.IEmpresaDAO;
import InterfazDAO.IProductoDAO;

import InterfazDAO.IUsuarioDAO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author as
 */
public class Modelito {
    //usuario
    public void guardarUsuario(Usuario p){
        //System.out.println("p="+p.getNombre());
        UsuarioDAO dao= new UsuarioDAO();
        dao.registrar(p);
    }
    
    public List<Usuario> mostrarUsuario(){
        List<Usuario> p = new ArrayList<Usuario>();
        IUsuarioDAO dao= new  UsuarioDAO();
	p=dao.obtener();
        return p;
    }
    
    public List<Usuario> filtroUsuario(String usuario, String contrasena){
        List<Usuario> p = new ArrayList<Usuario>();
        IUsuarioDAO dao= new  UsuarioDAO();
	p=dao.filtro(usuario, contrasena);
        return p;
    }
    
    public List<Usuario> obtenerSaldo(String usuario){
        List<Usuario> p = new ArrayList<Usuario>();
        IUsuarioDAO dao= new  UsuarioDAO();
	p=dao.obtenerSaldo(usuario);
        return p;
    }
    
    public List<Usuario> filtroQR(String usuario){
        List<Usuario> p = new ArrayList<Usuario>();
        IUsuarioDAO dao= new  UsuarioDAO();
	p=dao.filtroQR(usuario);
        return p;
    }
    
    public List<Usuario> actualizar(int saldo, String cedula){
        List<Usuario> p = new ArrayList<Usuario>();
        IUsuarioDAO dao= new  UsuarioDAO();
	p=dao.actualizar(saldo, cedula);
        return p;
    }
    
    /*public List<Usuario> actualizar(int saldo, String cedula){
        List<Usuario> p = new ArrayList<Usuario>();
        IUsuarioDAO dao= new  UsuarioDAO();
	p=dao.actualizar(saldo, cedula);
        return p;
    }*/
    
    //empresa
    public void guardarEmpresa(Empresa em){
        //System.out.println("p="+p.getNombre());
        EmpresaDAO dao= new EmpresaDAO();
        dao.registrar(em);
    }
    
    public List<Empresa> mostrarEmpresa(){
        List<Empresa> em = new ArrayList<Empresa>();
        IEmpresaDAO dao= new  EmpresaDAO();
	em=dao.obtener();
        return em;
    }
    
    public List<Empresa> filtroEmpresa(String usuario, String contrasena){
        List<Empresa> em = new ArrayList<Empresa>();
        IEmpresaDAO dao= new  EmpresaDAO();
	em=dao.filtro(usuario, contrasena);
        return em;
    }
    
    //usuario
    public void guardarProducto(Producto p){
        //System.out.println("p="+p.getNombre());
        ProductoDAO dao= new ProductoDAO();
        dao.registrar(p);
    }
    
    public List<Producto> mostrarProducto(){
        List<Producto> p = new ArrayList<Producto>();
        IProductoDAO dao= new  ProductoDAO();
	p=dao.obtener();
        return p;
    }
    
    public List<Producto> filtroProducto(String nombre){
        List<Producto> p = new ArrayList<Producto>();
        IProductoDAO dao= new  ProductoDAO();
	p=dao.filtro(nombre);
        return p;
    }
    
}
