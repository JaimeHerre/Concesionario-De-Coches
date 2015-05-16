/**
 * 
 */
package concesionario;

/**
 * @author Juan Antonio Cubero Lopez
 * @version 1.0.0
 *
 */
public enum Modelo {
	SERIE1(Marca.BMW),
	SERIE2(Marca.BMW),
	SERIE3(Marca.BMW),
	SERIE5(Marca.BMW),
	CORDOBA(Marca.SEAT),
	IBIZA(Marca.SEAT),
	TOLEDO(Marca.SEAT);
	
	
        private Marca marca;
	/** constructor de Modelos*/
        private Modelo(Marca marca){
            this.marca = marca;
        }
        private Modelo(){
            
        }
	public static Modelo getModelo(int valor){
		for (Modelo modelo : Modelo.values()) {
			if (modelo.ordinal() == valor) {
				return modelo;
			}
			
		}
		return null;
	}
	/** getter de nombre
	 * @return nombre */
//	
	public static Modelo[] toArray(){
		Modelo[] array = new Modelo[7];
		int i = 0;
		for (Modelo modelo : Modelo.values()) {
			array[i] = modelo;
			i++;
		}
		
		return array;
	}
        public Marca getMarca(){
            return marca;
        }
}
