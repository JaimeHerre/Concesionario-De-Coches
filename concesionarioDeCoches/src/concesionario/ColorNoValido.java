/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Juan Antonio
 */
public class ColorNoValido extends Exception {

    public ColorNoValido(String el_color_no_es_valido) {
        super(el_color_no_es_valido);
    }
    
}
