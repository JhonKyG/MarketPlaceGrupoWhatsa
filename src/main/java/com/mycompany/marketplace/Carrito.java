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
public class Carrito {
    private String idCarrito;
    private String productoAgregado;
    private int precioTotal;
    private String empresaProducto;
    private int cantidad;

    public Carrito() {
    }

    public Carrito(String idCarrito, String productoAgregado, int precioTotal, String empresaProducto, int cantidad) {
        this.idCarrito = idCarrito;
        this.productoAgregado = productoAgregado;
        this.precioTotal = precioTotal;
        this.empresaProducto = empresaProducto;
        this.cantidad = cantidad;
    }

    public String getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(String idCarrito) {
        this.idCarrito = idCarrito;
    }

    public String getProductoAgregado() {
        return productoAgregado;
    }

    public void setProductoAgregado(String productoAgregado) {
        this.productoAgregado = productoAgregado;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getEmpresaProducto() {
        return empresaProducto;
    }

    public void setEmpresaProducto(String empresaProducto) {
        this.empresaProducto = empresaProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Carrito{" + "idCarrito=" + idCarrito + ", productoAgregado=" + productoAgregado + ", precioTotal=" + precioTotal + ", empresaProducto=" + empresaProducto + ", cantidad=" + cantidad + '}';
    }
    
    
}
