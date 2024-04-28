package co.edu.uco.pch.crosscutting.exception.custom;

import co.edu.uco.pch.crosscutting.exception.PCHException;
import co.edu.uco.pch.crosscutting.exception.enums.Lugar;

public final class DataPCHException extends PCHException{
	
	private static final long serialVersionUID = 1L;

	public DataPCHException(final String mensajeUsuiario) {
		super(mensajeUsuiario, Lugar.DATA);
	}

	public DataPCHException(final String mensajeTecnico, final Throwable excepcionRaiz, final String mensajeUsuario) {
		super(mensajeTecnico, Lugar.DATA, excepcionRaiz, mensajeUsuario);
	}


}
