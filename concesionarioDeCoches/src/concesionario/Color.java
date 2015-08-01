package concesionario;
/** 
 * 
 * @author  Juan Antonio Cubero Lopez;
 * @version 1.0.0
 * */
public enum Color {
	PLATA,
	ROJO,
	AZUL;
//	private String nombre;
//	private int valor;
	/** constructor de color*/
//	Color(String nombre,int valor){
//		setNombre(nombre);
//		setValor(valor);
//	}
	/** metodo que en funcion de un valor pasado por par&aacute;metro 
	 * devuelve el nombre de uno de los colores
	 * @param int valor
	 * @return color.getNombre
	 * @return null*/
	public static Color getColor(int valor){
		for (Color color : Color.values()) {
			if (color.ordinal() + 1 == valor) {
				return color;
			}
		}
		return null;
	}

	public static String[] toArray(){
		String[] array = new String[3];
		int i = 0;
		for (Color color : Color.values()) {
			array[i] = color.name();
			i++;
		}
		
		return array;
	}

}
