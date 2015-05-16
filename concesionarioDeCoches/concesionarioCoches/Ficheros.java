/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionarioCoches;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Jaime Herrerias
 */
public class Ficheros {
    /** Este Metd*/
       // public static File archivo = new File("Sin_titulo.obj");
	
        public static void guardar(Concesionario concesionario,File file) throws FileNotFoundException, IOException{
		//archivo = name;
		try(ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(file))){
			save.writeObject(concesionario);
		}catch(FileNotFoundException e){
			System.out.println("error");
		}catch(IOException i){
			System.out.println("error");
		}
	}
	public  static Concesionario abrir(File file) throws FileNotFoundException, IOException, ClassNotFoundException{
		//File archivo  = new File(nombre);
		if (file.exists()) {
			ObjectInputStream open = new ObjectInputStream(new FileInputStream(
					file));
			return (Concesionario) open.readObject();
		}else{
			return null;
		}
		
	}
	public static void guardarComo(Concesionario concesionario, File file) throws FileNotFoundException, IOException{
		//File archivo = new File(name);
		if(file.exists()){
			
				guardar(concesionario,file);
			
		}else{
			guardar(concesionario,file);
		}
			
		
	}

    

   
	
    
}

