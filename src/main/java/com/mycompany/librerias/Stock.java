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
public class Stock {
     
    private ArrayList<Libro> catalogo;

    private double caja;

    /**
     *
     */
    public Stock( )
    {
        catalogo = new ArrayList<Libro>( );
        caja = 100000;
    }

    /**
     *
     * @param cCaja
     */
    public void cambiarCaja( double cCaja )
    {
      
    }

    /**
     *
     * @param tituloLibro
     * @return
     */
    public Libro buscarLibroPorTitulo( String tituloLibro )
    {
        return null;
       
        
    }

    /**
     *
     * @param codigo
     * @return
     */
    public Libro buscarClaveLibro( String codigo )
    {
        
        return null;
    }

    /**
     *
     * @param tituloLibro
     * @param codigoLibro
     * @param precioVentaLibro
     * @param precioCompraLibro
     * @param autorLibro
     * @return
     */
    public Libro registrarLibro( String tituloLibro, String codigoLibro, double precioVentaLibro, double precioCompraLibro, String autorLibro )
    {
        return null;
       
    }

    /**
     *
     * @param codigo
     * @return
     */
    public boolean eliminarLibro( String codigo )
    {
        
        return false;
    }

    /**
     *
     * @param codigo
     * @param cantidad
     * @return
     */
    public boolean llenarStock( String codigo, int cantidad )
    {
        
        return false;
    }

    /**
     *
     * @param codigo
     * @param cantidad
     * @return
     */
    public boolean vender( String codigo, int cantidad )
    {

        return false;
    }

    /**
     *
     * @return
     */
    public Libro libroMasCostoso( )
    {
       
        return null;
    }

    /**
     *
     * @return
     */
    public Libro darLibroMasVendido( )
    {
        return null;
        
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    /**
     *
     * @param catalogo
     */
    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    /**
     *
     * @return
     */
    public double getCaja() {
        return caja;
    }

    /**
     *
     * @param caja
     */
    public void setCaja(double caja) {
        this.caja = caja;
    }


}
