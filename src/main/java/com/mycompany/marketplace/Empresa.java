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
public class Empresa {
    private int idEmpresa;
    private String nombre;
    private String nit;
    private String correo;
    private String celular;
    private String contrasena;

    public Empresa() {
    }

    public Empresa(int idEmpresa, String nombre, String nit, String correo, String celular, String contrasena) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.nit = nit;
        this.correo = correo;
        this.celular = celular;
        this.contrasena = contrasena;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Empresa{" + "idEmpresa=" + idEmpresa + ", nombre=" + nombre + ", nit=" + nit + ", correo=" + correo + ", celular=" + celular + ", contrasena=" + contrasena + '}';
    }

    
    
    
    
    
}
