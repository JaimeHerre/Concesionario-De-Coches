/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionarioCoches;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jaime
 */
public class Gestion {

	public static Concesionario concesionario = new Concesionario();
       private static Ficheros ficheros = new Ficheros();
	public static void darDeAlta(Modelo modelo, Color color, String matricula)
			throws MatriculaNoValidaException, ColorNoValidoException,
			ModeloNoValidoException, CocheYaExisteException {
		concesionario.annadir(matricula, color, modelo);

	}
       
	public static void eliminar(String matricula)
			throws MatriculaNoValidaException, CocheNoExisteException {
		concesionario.eliminar(matricula);

	}
        public static Concesionario getConcesionario(){
		return concesionario;	
	}

	public static String mostrarConcesionario() {
		return concesionario.toString();

	}

	public static String mostrarColor(Color color) {
		return concesionario.getCochesColor(color).toString();
	}

	public static String mostrarMatricula(String matricula)
			throws MatriculaNoValidaException, CocheNoExisteException {
		return concesionario.get(matricula).toString();
	}

	public static int mostrarNCoches() {
		return concesionario.size();
	}

	

}
