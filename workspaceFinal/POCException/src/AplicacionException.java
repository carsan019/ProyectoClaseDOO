
public class AplicacionException extends CalculadoraException{
	
	private static final long serialVersionUID = -5946920306313011015L;

	public AplicacionException(String mensaje) {
		super(mensaje, "Aplicacion");
	}
	
	public AplicacionException (String mensaje, Throwable exceptionRaiz) {
		super(mensaje,exceptionRaiz,"Datos");
		
	}

}
