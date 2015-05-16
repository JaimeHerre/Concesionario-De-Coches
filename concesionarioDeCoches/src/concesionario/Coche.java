package concesionario;

import java.util.regex.Pattern;

import java.io.Serializable;

public class Coche implements Serializable {
        private static final long serialVersionUID = 587738811063465576L;
	private Modelo modelo;
        private Marca marca;
	private Color color;
	private String matricula;
	private Pattern p = Pattern.compile("^[0-9]{4}[B-Z]{3}$");
	public Color getColor() {
		return color;
	}
	public void setModelo(Modelo modelo) throws ColorNoValido, ModeloNoValido {
            if(modelo ==  null)
              throw new  ModeloNoValido("el modelo no es valido");
		this.modelo = modelo;
	}
	public void setColor(Color color) throws ColorNoValido {
            if(color == null)
                  throw  new  ColorNoValido("el color no es valido");
		this.color = color;
	}
	public void setMatricula(String matricula) throws MatriculaNoValidaException{
		
		if (p.matcher(matricula).matches()) {
			this.matricula = matricula;
		}else{
			
			throw new MatriculaNoValidaException("matricula no valida");
		}
	}
	
	Coche(Modelo modelo, Color color, String matricula) throws MatriculaNoValidaException, ColorNoValido, ModeloNoValido {
		setModelo(modelo);
		setColor(color);
		setMatricula(matricula);
                setMarca(modelo.getMarca());
	}
	public void setMarca(Marca marca){
            this.marca = marca;
        }
	public String getMatricula() {
		return matricula;
	}
        public Modelo getModelo(){
            return modelo;
        }
        public Marca getMarca(){
            return marca;
        }
	@Override
	public String toString() {
		return "coches [ marca= "+ marca + " modelo=" + modelo + ", color=" + color + ", matricula="
				+ matricula + "]";
	}
	
}
