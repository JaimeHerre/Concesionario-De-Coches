package concesionarioCoches;

public enum Modelo {

	/**
	 * Modelo serie 1 y marca BMW
	 */
	SERIE1(Marca.BMW),

	/**
	 * Modelo serie 2 y marca BMW
	 */
	SERIE2(Marca.BMW),
		
	/**
	 * Modelo serie 3 y marca BMW
	 */
	SERIE3(Marca.BMW),

	/**
	 * Modelo serie 5 y marca BMW
	 */
	SERIE5(Marca.BMW),

	/**
	 * Modelo c�rdoba y marca seat
	 */
	CORDOBA(Marca.SEAT),

	/**
	 * Modelo ibiza y marca seat
	 */
	IBIZA(Marca.SEAT),

	/**
	 * Modelo toledo y marca seat
	 */
	TOLEDO(Marca.SEAT);
	private Marca marca;


	/**
	 * Constructor de Modelo
	 * @param marca
	 */
	private Modelo(Marca marca) {
		this.marca = marca;
	}
        
      
        

	/**
	 * Devuelve la marca
	 * @return
	 */
	public Marca getMarca() {
		return marca;
	}

	public String toString() {
		return name();// + ", " + getMarca();

	}

	/**
	 * Contiene los valores de Modelo
	 */
	private static final Modelo[] VALUES = Modelo.values();

	/**
	 * Genera las opciones para el men�
	 * @return
	 */
	static String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[VALUES.length + 1];
		int i = 0;
		for (Modelo modelo : VALUES) {
			opcionesMenu[i++] = modelo.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}

	/**
	 * obtiene los valores de Modelo
	 * @return los valores de Modelo
	 */
	public static Modelo[] getValues() {
		return VALUES;
	}
        
        
        public static String[] getValuesForMarca(Marca marca) {
            String [] resultado = new String[4];
            int i=0;
            for (Modelo modelo : VALUES) {
                if (modelo.getMarca().equals(marca)) {
                    resultado[i++]=modelo.toString();
                }
            }
            return resultado;
        }
	// -------------------------------------------------

        public static Modelo getModelo (Marca m, String model) throws  ModeloNoValidoException {
            if (model==null)
                throw new ModeloNoValidoException("Modelo No Válido.");
            
            Modelo resultado= Modelo.SERIE1;
            switch (m) {
                case BMW: {
                    if (model.equals("SERIE1")){
                        resultado= Modelo.SERIE1;
                    }
                    else if (model.equals("SERIE2")){
                        resultado =Modelo.SERIE2;
                    }
                    else if (model.equals("SERIE3")){
                        resultado =Modelo.SERIE3;
                    }
                    else if (model.equals("SERIE5")){
                        resultado =Modelo.SERIE5;
                    }
                    /*else {
                        throws 
                    }*/
                    break;
                }
                case SEAT: {
                    if (model.equals("IBIZA")){
                        resultado =Modelo.IBIZA;
                    } 
                    else if (model.equals("TOLEDO")){
                        resultado =Modelo.TOLEDO;
                    } 
                    else if (model.equals("CORDOBA")){
                        resultado =Modelo.CORDOBA;
                    } 
                }
            }
            return resultado;
        }
}
