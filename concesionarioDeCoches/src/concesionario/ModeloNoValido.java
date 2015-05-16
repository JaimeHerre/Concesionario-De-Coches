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
 public class ModeloNoValido extends Exception {

    public ModeloNoValido(String el_modelo_no_es_valido) {
        super(el_modelo_no_es_valido);
    }
    
}
