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
    
    /**
     * variable tipo String para guardar el codigo del libro
     */
    
    private String Codigo;

   /**
     * variable tipo String para guardar el titulo del libro
     */
    
    private String tituloDeLibro;
    
    /**
     * variable tipo String para guardar el o los autores del libro
     */
    
    private String autoresLibro;

    /**
     * variable tipo Double para guardar el precio para la venta del libro
     */
    
    private double precioVenta;
    
    /**
     * variable tipo Double para guardar el precio para la compra del libro al proveedor
     */

    
    private double precioCompra;

    
    /**
     * variable tipo int para guardar la cantidad del libro en stock
     */
   
    private int cantidadActual;

    /**
     * variable tipo ArrayList para guardar los libros que se compren o se vendan para llenar stock
     */
    
    private ArrayList<Compra> compras;

    /**
     *Constructor de la clase
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
     *Metodo para vender el libro recibiendo como parametro la cantidad
     * @param cCantidad
     * @return
     */
    public boolean vender( int cCantidad )
    {
        return false;
        
    }

    /**
     *Metodo para llenar el stock de dicho libro recibiendo como parametro la cantidad
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
