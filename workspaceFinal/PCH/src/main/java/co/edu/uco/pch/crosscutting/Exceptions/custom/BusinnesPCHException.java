package co.edu.uco.pch.crosscutting.Exceptions.custom;

import co.edu.uco.pch.crosscutting.Exceptions.PCHException;
import co.edu.uco.pch.crosscutting.Exceptions.enums.Lugar;

public final class BusinnesPCHException extends PCHException{
	
	private static final long serialVersionUID = 1L;
	private static final Lugar lugar = Lugar.BUSINNES;

	public BusinnesPCHException(final String mensajeUsuario ) {
		super(mensajeUsuario, lugar);
	}
	
	public BusinnesPCHException(final String mensajeTecnico,final String mensajeUsuario, 
			final Throwable exceptionRaiz) {
		super(mensajeTecnico,mensajeUsuario,lugar, exceptionRaiz);
	}
	
	
	
}
