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
 * @author Tatiana Almansa
 * Juan David Ojeda Bernal
 * Karen Tatiana Almansa Jimenez
 */
public class Libro {
    
    private String Codigo;

   
    private String tituloDeLibro;
    
    
    private String autoresLibro;

    
    private double precioVenta;

    
    private double precioCompra;

   
    private int cantidadActual;

    
    private ArrayList<Compra> compras;

    /**
     *
     * @param Codigo
     * @param TituloLibro
     * @param autoresLibro
     * @param precioVenta
     * @param precioCompra
     * @param cantidadActual
     * @param transacciones
     */
    public Libro(String Codigo, String TituloLibro, String autoresLibro, double precioVenta, double precioCompra, int cantidadActual, ArrayList<Compra> transacciones) {
        this.Codigo = Codigo;
        this.tituloDeLibro = TituloLibro;
        this.autoresLibro = autoresLibro;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.cantidadActual = 0;
        this.compras = transacciones;
    }

     /**
     *
     * @param cCantidad
     * @return
     */
    public boolean vender( int cCantidad )
    {
        return false;
        
    }

    /**
     *
     * @param cCantidad
     */
    public void llenarStock( int cCantidad )
    {

    }
    
    
    
    
    
    /**
     *
     * @return
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     *
     * @param Codigo
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     *
     * @return
     */
    public String getTituloDeLibro() {
        return tituloDeLibro;
    }

    /**
     *
     * @param tituloDeLibro
     */
    public void setTituloDeLibro(String tituloDeLibro) {
        this.tituloDeLibro = tituloDeLibro;
    }

    /**
     *
     * @return
     */
    public String getAutoresLibro() {
        return autoresLibro;
    }

    /**
     *
     * @param autoresLibro
     */
    public void setAutoresLibro(String autoresLibro) {
        this.autoresLibro = autoresLibro;
    }

    /**
     *
     * @return
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     *
     * @param precioVenta
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     *
     * @return
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     *
     * @param precioCompra
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     *
     * @return
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     *
     * @param cantidadActual
     */
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    /**
     *
     * @return
     */
    public ArrayList<Compra> getCompras() {
        return compras;
    }

    /**
     *
     * @param compras
     */
    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

   

}
