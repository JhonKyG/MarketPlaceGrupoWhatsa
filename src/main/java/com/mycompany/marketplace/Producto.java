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
public class Producto {
    private int idProducto;
    private int precio;
    private String categoria;
    private String descripcion;
    private String nombre;
    private String url;

    public Producto() {
    }

    public Producto(int idProducto, int precio, String categoria, String descripcion, String nombre, String url) {
        this.idProducto = idProducto;
        this.precio = precio;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.url = url;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", precio=" + precio + ", categoria=" + categoria + ", descripcion=" + descripcion + ", nombre=" + nombre + ", url=" + url + '}';
    }

    
    
}
