package concesionarioCoches;


/**
 * Se limitar�n los colores a tres: plata, rojo y azul. Para solicitar el color
 * al dar de alta al coche podr� implementarse un m�todo pedirColor que mediante
 * la gesti�n de un men�, devolver� el color indicado
 * 
 * @author Jaime herrerias;
 * 
 */
public enum Color {
	/**
	 * Color plata
	 */
	PLATA, 
	/**
	 * Color rojo
	 */
	ROJO, 
	/**
	 * Color azul
	 */
	AZUL;

	private static final Color[] VALUES = Color.values();

	/**
	 * Genera las opciones para el men�
	 * @return las opciones para el men�
	 */
	public static String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[getValues().length + 1];
		int i = 0;
		for (Color color : getValues()) {
			opcionesMenu[i++] = color.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}

	/**
	 * Devuelve los valores de la enumeracion Color
	 * @return
	 */
	public static Color[] getValues() {
		return VALUES;
	}

}
