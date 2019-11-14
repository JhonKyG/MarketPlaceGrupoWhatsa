/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.marketplace;

/**
 *
 * @author veget
 */
public class Factura {
    private String fecha;
    private String id;
    private int TotalPR;

    public Factura(String fecha, String id, int TotalPR) {
        this.fecha = fecha;
        this.id = id;
        this.TotalPR = TotalPR;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalPR() {
        return TotalPR;
    }

    public void setTotalPR(int TotalPR) {
        this.TotalPR = TotalPR;
    }

    @Override
    public String toString() {
        return "Factura{" + "fecha=" + fecha + ", id=" + id + ", TotalPR=" + TotalPR + '}';
    }
    
}
