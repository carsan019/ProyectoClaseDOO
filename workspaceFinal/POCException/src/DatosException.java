
public class DatosException extends CalculadoraException{
	private static final long serialVersionUID = 1291634403947795002L;

	public DatosException (String mensaje) {
		super(mensaje,"Datos");
		
	}
	public DatosException (String mensaje, Throwable exceptionRaiz) {
		super(mensaje,exceptionRaiz,"Datos");
		
	}
	
}
