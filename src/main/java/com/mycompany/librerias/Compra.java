/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerias;

/**
 *
 * @author JDMorrigan
 *  @author Tatiana Almansa
 * Juan David Ojeda Bernal
 * Karen Tatiana Almansa Jimenez
 */
public class Compra {
    
    /**
     *
     */
    public enum Compras{

        /**
         *variable de seleccion para saber que tipo de transaccion se hará
         */
        comprarLibros,

        /**
         *variable de seleccion para saber que tipo de transaccion se hará
         */
        venderLibros;
        }
    
    /**
    *variable de seleccion para saber que tipo de transaccion se hará
    */
    
    private Compras tipo;
    
    
     /**
    *variable entera para definir la cantidad de libros que se venderán o comprarán
    */
    

    private int cantidad;

    /**
     *
     * @param tipo caracteristica de la transaccion
     * @param cantidad cantidad de libros que se venden o compran segun lo que se desea
     */
    public Compra(Compras tipo, int cantidad) {
        
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    /**
     *
     * @return
     */
    public Compras getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(Compras tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
}
