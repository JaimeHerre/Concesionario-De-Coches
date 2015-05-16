/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Juan Antonio
 */
public class Fichero {
    /** Este Metd*/
	public  static void guardar(Concesionario concesionario,File file) throws FileNotFoundException, IOException{
		try(ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(file))){
			save.writeObject(concesionario);
		}catch(FileNotFoundException e){
			System.out.println("error");
		}catch(IOException i){
			System.out.println("error");
		}
	}
	public static Concesionario abrir(File file) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		if (file.exists()) {
			ObjectInputStream open = new ObjectInputStream(new FileInputStream(
					file));
			return (Concesionario) open.readObject();
		}else{
			return null;
		}
		
	}
	
    
}
