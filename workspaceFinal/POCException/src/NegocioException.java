
public class NegocioException extends CalculadoraException {
	
	private static final long serialVersionUID = 8435519975798213184L;
		public NegocioException(String mensaje) {
			super(mensaje, "Negocio");
	}
		public NegocioException (String mensaje, Throwable exceptionRaiz) {
			super(mensaje,exceptionRaiz,"Datos");
			
		}

}
