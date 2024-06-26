package co.edu.uco.pch.crosscutting.Exceptions.messagecatalog;

import co.edu.uco.pch.crosscutting.Exceptions.messagecatalog.data.CodigoMensaje;
import co.edu.uco.pch.crosscutting.Exceptions.messagecatalog.data.Mensaje;

public interface MessageCatalog {
	
	void inicializar();
	
	String obtenerContenidoMensaje(final CodigoMensaje codigo, String...parametros);
	
	Mensaje obtenerMensaje(final CodigoMensaje codigo, String...parametros);
	
}
