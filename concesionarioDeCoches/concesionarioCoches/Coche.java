package concesionarioCoches;

import java.io.Serializable;
import java.util.regex.Pattern;
/**
 * Clase Coche
 * @author Jaime herrerias;
 * @version 1.0
 *
 */
public class Coche  implements Serializable{
	/**
	 * Matricula del coche
	 */
	private String matricula;
	/**
	 * Color del coche
	 */
	private Color color;
	/**
	 * Modelo del coche
	 */
	private Modelo modelo;
	/**
	 * Patr�n para la matr�cula
	 */
	static final private Pattern patternMatricula = Pattern
			.compile("^\\d{4}[ -]?[[B-Z]&&[^QEIOU]]{3}$");

	/**
	 * Constructor de coche
	 * @param matricula
	 * @param color
	 * @param modelo
	 * @throws MatriculaNoValidaException
	 * @throws ColorNoValidoException
	 * @throws ModeloNoValidoException
	 */
	Coche(String matricula, Color color, Modelo modelo) throws MatriculaNoValidaException, ColorNoValidoException, ModeloNoValidoException {
		super();
		setMatricula(matricula);
		setColor(color);
		setModelo(modelo);
	}

	/**
	 * Constructor de coche
	 * @param matricula
	 * @throws MatriculaNoValidaException
	 */
	Coche(String matricula) throws MatriculaNoValidaException {
		setMatricula(matricula);
	}

	/**
	 * Comprueba si la matr�cula es v�lida
	 * @param matricula
	 * @return true si es v�lida, false si no es v�lida
	 */
	public static boolean esValida(String matricula) {

		return patternMatricula.matcher(matricula).matches();
	}

	/**
	 * Establece la matr�cula de Coche
	 * @param matricula
	 * @throws MatriculaNoValidaException
	 */
	private void setMatricula(String matricula) throws MatriculaNoValidaException {
		if (esValida(matricula)) {
			this.matricula = matricula;
		}else
			throw new MatriculaNoValidaException("La matr�cula no es v�lida");
		
	}

	/**
	 * Obtiene el color de Coche
	 * @return el color de Coche
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Establece el color de Coche
	 * @param color
	 * @throws ColorNoValidoException
	 */
	private void setColor(Color color) throws ColorNoValidoException {
		if (color == null) {
			throw new ColorNoValidoException("El color no es v�lido");
		}else
			this.color = color;
	}

	/**
	 * Establece el color de Coche
	 * @param modelo
	 * @throws ModeloNoValidoException
	 */
	private void setModelo(Modelo modelo) throws ModeloNoValidoException {
		if (modelo == null) {
			throw new ModeloNoValidoException("El modelo no es v�lido");
		}
		this.modelo = modelo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getMatricula() == null) ? 0 : getMatricula().hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (getMatricula() == null) {
			if (other.getMatricula() != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nCoche [matricula=" + getMatricula() + ", color=" + color
				+ ", modelo=" + getModelo() + "]";
	}

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @return the modelo
     */
    public Modelo getModelo() {

        return modelo;
    }

}
