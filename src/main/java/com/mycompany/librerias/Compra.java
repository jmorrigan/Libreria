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
         *
         */
        comprarLibros,

        /**
         *
         */
        venderLibros;
        }
    
    private Compras tipo;

    private int cantidad;

    /**
     *
     * @param tipo
     * @param cantidad
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
