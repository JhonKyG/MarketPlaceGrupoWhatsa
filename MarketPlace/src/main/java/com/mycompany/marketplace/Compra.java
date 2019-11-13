/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.marketplace;

/**
 *
 * @author as
 */
public class Compra {
    private String fechaCompra;
    private String idCarrito;
    private String idUsuario;

    public Compra() {
    }

    public Compra(String fechaCompra, String idCarrito, String idUsuario) {
        this.fechaCompra = fechaCompra;
        this.idCarrito = idCarrito;
        this.idUsuario = idUsuario;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(String idCarrito) {
        this.idCarrito = idCarrito;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Compra{" + "fechaCompra=" + fechaCompra + ", idCarrito=" + idCarrito + ", idUsuario=" + idUsuario + '}';
    }
    
    
}
