/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.ArrayList;

/**
 *
 * @author Juan Antonio
 */
public class Gestion {
    public  static Concesionario concesionario = new Concesionario();
   private static Boolean comprobar = false;
   
    
    public static void  altaCoche(Modelo modelo,Color color, String matricula) throws CocheYaExisteException, CocheNoExisteException, MatriculaNoValidaException, ColorNoValido, ModeloNoValido{
        concesionario.altaCoches(modelo, color, matricula);
    }
    public static void bajaCoche(String matricula) throws CocheNoExisteException{
        concesionario.bajaCoches(matricula);
        
    }
    public static Coche mostrarCoche(String matricula) throws CocheNoExisteException{
        return concesionario.mostrarCoche(matricula);
    }
    public static int contarCoche(){
        return concesionario.contarCoches();
    }
    public static ArrayList mostrarCochesColor(Color color){
        return concesionario.mostrarCochesColor(color);
    }
    public static  Coche mostrarConcesionario(int i){
        return concesionario.mostrarConcesionario(i);
    }
    public static Concesionario getConcesionario(){
        return concesionario;
        
    }
    public static void setConcesionario(Concesionario concesionario1){
        concesionario = concesionario1;
    }
    public static void setModificado(Boolean validar){
        comprobar = validar;
    }
    public static boolean isModificado(){
        return comprobar;
    }
   
    
    
}
