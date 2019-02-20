/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerias;

import java.util.ArrayList;

/**
 *
 * @author JDMorrigan
 */
public class Libro {
    
    private String Codigo;

   
    private String tituloDeLibro;
    
    
    private String autoresLibro;

    
    private double precioVenta;

    
    private double precioCompra;

   
    private int cantidadActual;

    
    private ArrayList<Compra> compras;

    public Libro(String Codigo, String TituloLibro, String autoresLibro, double precioVenta, double precioCompra, int cantidadActual, ArrayList<Compra> transacciones) {
        this.Codigo = Codigo;
        this.tituloDeLibro = TituloLibro;
        this.autoresLibro = autoresLibro;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.cantidadActual = 0;
        this.compras = transacciones;
    }

  
     
   

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTituloDeLibro() {
        return tituloDeLibro;
    }

    public void setTituloDeLibro(String tituloDeLibro) {
        this.tituloDeLibro = tituloDeLibro;
    }

    public String getAutoresLibro() {
        return autoresLibro;
    }

    public void setAutoresLibro(String autoresLibro) {
        this.autoresLibro = autoresLibro;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    
  

    public boolean vender( int cCantidad )
    {
        return false;
        
    }

    
    public void llenarStock( int cCantidad )
    {

    }

}
