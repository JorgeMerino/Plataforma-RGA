package tfg.excepcion;

public class ExcepcionPeticionHTTP extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int codigoEstadoPeticion;
	
	public ExcepcionPeticionHTTP(int codigoEstadoPeticion) {
		super();
		this.codigoEstadoPeticion = codigoEstadoPeticion;
	}
	
	@Override
	public String getMessage() {
		return "Error " + codigoEstadoPeticion + ". No se ha podido establecer conexión.";
	}
}
