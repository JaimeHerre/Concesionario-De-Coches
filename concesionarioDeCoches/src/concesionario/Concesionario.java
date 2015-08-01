package concesionario;

import java.util.ArrayList;
import java.util.regex.Pattern;

import java.io.Serializable;

public class Concesionario implements Serializable {
	private ArrayList<Coche> listaCoches;
        private static final long serialVersionUID = 6529685098267757690L;
       

	public Concesionario() {
		super();
		listaCoches = new ArrayList<Coche>();  ;
	}
	public void altaCoches(Modelo modelo,Color color,String matricula) throws  CocheYaExisteException, CocheNoExisteException, MatriculaNoValidaException, ColorNoValido, ModeloNoValido{
		Coche coche = new Coche(modelo, color, matricula);
		if (listaCoches.contains(coche) && validarMatricula(matricula)) {
			throw new CocheYaExisteException("este coche ya existe , no se volvera a a�adir");
		}
                
		listaCoches.add(coche);
		
		
	}
	public String bajaCoches(String Matricula) throws CocheNoExisteException{

		if (listaCoches.remove(comprobarMatricula( Matricula))==false) {
			throw new CocheNoExisteException("el coche no ha sido eliminado");
		}
		return "el coche ha sido eliminado";
	}
	private Coche comprobarMatricula(String matricula) throws CocheNoExisteException {
		for (Coche coche : listaCoches) {
			if (matricula.equals(coche.getMatricula())) {
				return coche;
			}
		}
		throw new CocheNoExisteException("no se ha encontrado el coche");
	}
	public Coche mostrarCoche(String matricula) throws CocheNoExisteException{
		return comprobarMatricula(matricula);
	}
	public Coche mostrarConcesionario(int i){
            return listaCoches.get(i);
        }
	public int contarCoches(){
		return listaCoches.size();
	}
	public ArrayList mostrarCochesColor(Color Color){
		ArrayList <Coche> color = new ArrayList<Coche>();
		for (Coche coche : listaCoches) {
			if (Color == coche.getColor()) {
				color.add(coche);
			}
		}
                return color;
		
	}

    private boolean validarMatricula(String matricula) {
        for (Coche coche: listaCoches) {
            if (matricula.equals(coche.getMatricula())) {
                return true;
            }
        }
        return false;//To change body of generated methods, choose Tools | Templates.
    }
    public void vaciar(){
        listaCoches.clear();
    }
	
	
	
}
