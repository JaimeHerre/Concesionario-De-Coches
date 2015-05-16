package concesionarioCoches;
/**
 * Marcas de los coches del concesionario
 * @author Jaime herrerias;
 * @version 1.0
 *
 */
public enum Marca {
	/**
	 * Marca BMW 
	 */
	BMW, 
	/**
	 * Marca seat 
	 */
	SEAT;
        
    /**
     *
     * @param marca
     * @return
     */
    public static Marca getMarca (String marca) {
            Marca resultado=SEAT;
             
            if (marca.equals("Seat")) {
                return resultado=Marca.SEAT;
            }
             if (marca.equals("BMW")) {
                return resultado=Marca.BMW;
            } 
            return null;
        }
}
