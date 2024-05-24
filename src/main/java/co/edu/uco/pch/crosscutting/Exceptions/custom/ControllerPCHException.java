package co.edu.uco.pch.crosscutting.Exceptions.custom;

import co.edu.uco.pch.crosscutting.Exceptions.PCHException;
import co.edu.uco.pch.crosscutting.Exceptions.enums.Lugar;

public final class ControllerPCHException extends PCHException{
	
	private static final long serialVersionUID = 1L;
	private static final Lugar lugar = Lugar.CONTROLLER;

	public ControllerPCHException(final String mensajeUsuiario) {
		super(mensajeUsuiario, lugar);
	}

	public ControllerPCHException(final String mensajeTecnico,final String mensajeUsuario, 
			final Throwable exceptionRaiz) {
		super(mensajeTecnico,mensajeUsuario, lugar, exceptionRaiz);
	}

	


	
}
