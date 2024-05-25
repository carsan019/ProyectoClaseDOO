package co.edu.uco.pch.businnes.facade.impl.ciudad;

import co.edu.uco.pch.businnes.assembler.dto.impl.CiudadAssemblerDTO;
import co.edu.uco.pch.businnes.domain.CiudadDomain;
import co.edu.uco.pch.businnes.facade.FacadeWithoutReturn;
import co.edu.uco.pch.businnes.usecase.UseCaseWithoutReturn;
import co.edu.uco.pch.businnes.usecase.impl.ciudad.RegistrarCiudad;
import co.edu.uco.pch.crosscutting.Exceptions.PCHException;
import co.edu.uco.pch.crosscutting.Exceptions.custom.BusinnesPCHException;
import co.edu.uco.pch.data.dao.factory.DAOFactory;
import co.edu.uco.pch.dto.CiudadDTO;

public class RegistrarCiudadFacade implements FacadeWithoutReturn<CiudadDTO>{

	private DAOFactory daoFactory;
	
	public RegistrarCiudadFacade() {
		daoFactory = DAOFactory.getFactory();
	}
	
	@Override
	public void exceute(final CiudadDTO data) {
		daoFactory.iniciarTransaccion();

		
		try {
			var useCase = new RegistrarCiudad(daoFactory);
			var ciudadDomain = CiudadAssemblerDTO.getInstance().toDomain(data);
			//ejecutar caso de uso
			
			daoFactory.confirmarTransaccion();
			
		}catch (final PCHException exeption) {
			
			daoFactory.cancelarTransaccion();
			throw exeption;
			
		}catch (final Exception exeption) {
			
			daoFactory.cancelarTransaccion();
			
			var mensajeUsusario = "Se ha presentado un problema tratando de registrar la informacion de la ciudad";
			var mensajeTecnico = "Se ha presentado un problema inesperado";
			
			throw new BusinnesPCHException(mensajeTecnico,mensajeUsusario,exeption);

		}finally {
			daoFactory.cerrarConexion();
		}
		
		
		
		// TODO Auto-generated method stub
		
	}
	

}
