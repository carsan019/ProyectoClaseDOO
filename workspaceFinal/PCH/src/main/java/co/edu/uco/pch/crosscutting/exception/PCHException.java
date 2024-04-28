package co.edu.uco.pch.crosscutting.exception;

import co.edu.uco.pch.crosscutting.exception.enums.Lugar;
import co.edu.uco.pch.crosscutting.helpers.ObjectHelper;
import co.edu.uco.pch.crosscutting.helpers.TextHelper;

public class PCHException extends RuntimeException{
	
	private static final long serialVersionUID = 1949396923453540967L;
	protected String mensajeUsuario;
	protected Lugar lugar;
	
	
	public PCHException(String mensajeTecnico, String mensajeUsuario, Lugar lugar,Throwable exceptionRaiz ) {
		super(mensajeTecnico,exceptionRaiz);
		setMensajeUsuario(mensajeUsuario);
		setLugar(lugar);
		
	}
	
	public PCHException(final String mensajeUsuario, final Lugar lugar) {
		super(mensajeUsuario,new Exception());
		setMensajeUsuario(mensajeUsuario);
		setLugar(lugar);
	}
	private final void setMensajeUsuario(final String mensajeUsuario) {
		this.mensajeUsuario = TextHelper.applyTrim(mensajeUsuario);
	}


	private final void setLugar(final Lugar lugar) {
		this.lugar = ObjectHelper.getObjectHelper().getDefaultValue(lugar,Lugar.DEFAULT);
	}
	private static final long getSerialversionuid() {
		return serialVersionUID;
	}

	private String getMensajeUsuario() {
		return mensajeUsuario;
	}

	private Lugar getLugar() {
		return lugar;
	}
	
	
	

}
