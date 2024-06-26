package co.edu.uco.pch.crosscutting.helpers;
import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.pch.crosscutting.Exceptions.custom.CrosscuttingPCHException;
import co.edu.uco.pch.crosscutting.Exceptions.messagecatalog.MessageCatalogStrategy;
import co.edu.uco.pch.crosscutting.Exceptions.messagecatalog.data.CodigoMensaje;


public final class SQLHelper {

	private SQLHelper() {
		super();
	}

	public static final boolean isNull(final Connection connection) {
		return ObjectHelper.getObjectHelper().isNull(connection);
	}

	public static final boolean isOpen(final Connection connection) {
		try {
			return !isNull(connection) && !connection.isClosed();
		} catch (final SQLException exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00007);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		} catch (final Exception exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00008);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		}
	}

	public static final void close(final Connection connection) {
		try {
			if (!isOpen(connection)) {
				var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
				var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00009);

				throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
			}

			connection.close();
		} catch (final CrosscuttingPCHException exception) {
			throw exception;
		} catch (final SQLException exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00010);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		} catch (final Exception exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00011);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		}
	}

	public static final void commit(final Connection connection) {
		try {
			if (!isOpen(connection)) {
				var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
				var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00012);

				throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
			}

			if (connection.getAutoCommit()) {
				var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
				var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00013);

				throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
			}

			connection.commit();
		} catch (final CrosscuttingPCHException exception) {
			throw exception;
		} catch (final SQLException exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00014);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		} catch (final Exception exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00015);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		}
	}

	public static final void rollback(final Connection connection) {
		try {
			if (!isOpen(connection)) {
				var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
				var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00016);

				throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
			}

			if (connection.getAutoCommit()) {
				var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
				var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00017);

				throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
			}

			connection.rollback();
		} catch (final CrosscuttingPCHException exception) {
			throw exception;
		} catch (final SQLException exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00018);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		} catch (final Exception exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00019);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		}
	}

	public static final void initTransaction(final Connection connection) {
		try {
			if (!isOpen(connection)) {
				var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
				var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00020);

				throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
			}

			connection.setAutoCommit(false);
		} catch (final CrosscuttingPCHException exception) {
			throw exception;
		} catch (final SQLException exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00021);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		} catch (final Exception exception) {
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00022);

			throw new CrosscuttingPCHException(mensajeTecnico, mensajeUsuario);
		}
	}
}