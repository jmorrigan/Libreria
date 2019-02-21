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
     
    /**
     *Listado de libros para guardar en la variable catalogo
     */
    private ArrayList<Libro> catalogo;

    /**
     * variable tipo double para definir el valor en caja
     */
    
    private double caja;

    /**
     *constructor de la clase donde se crea la variable catalogo para guardar los objetos Libro y se inicializa la variable con un valor determinado 100000
     */
    public Stock( )
    {
        catalogo = new ArrayList<Libro>( );
        caja = 100000;
    }

    /**
     *Metodo para incrementar o decrementar caja respecto a las transacciones ya sean compras o ventas
     * @param cCaja parametro a recibir del metodo
     */
    public void cambiarCaja( double cCaja )
    {
      
    }

    /**
     *Metodo para buscar el libro por el titulo
     * @param tituloLibro parametro a recibir del metodo
     * @return
     */
    public Libro buscarLibroPorTitulo( String tituloLibro )
    {
        return null;
       
        
    }

    /**
     *Metodo para buscar el libro por la clave
     * @param codigo parametro tipo string que recibirá el metodo
     * @return
     */
    public Libro buscarClaveLibro( String codigo )
    {
        
        return null;
    }

    /**
     *Metodo para agregar el libro con sus atributos
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
     *Metodo para eliminar el libro recibiendo el parametro clave para encontrarlo
     * @param codigo
     * @return
     */
    public boolean eliminarLibro( String codigo )
    {
        
        return false;
    }

    /**
     *Metodo para surtir el stock de libros recibiendo como parametro el codigo de los libros y la cantidad a ingresar 
     * @param codigo
     * @param cantidad
     * @return
     */
    public boolean llenarStock( String codigo, int cantidad )
    {
        
        return false;
    }

    /**
     *Metodo para vender cierta cantidad de libros recibiendo como parametro el codigo y la cantidad a vender
     * @param codigo
     * @param cantidad
     * @return
     */
    public boolean vender( String codigo, int cantidad )
    {

        return false;
    }

    /**
     *Metodo para saber cual es el libro mas costoso en el stock, no recibe parametros
     * @return
     */
    public Libro libroMasCostoso( )
    {
       
        return null;
    }

    /**
     *Metodo para saber que libro es el mas vendido del stock, no recibe parametros
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
