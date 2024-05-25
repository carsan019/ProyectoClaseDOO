package co.edu.uco.pch.businnes.facade.impl.ciudad;

import java.util.List;

import co.edu.uco.pch.businnes.assembler.dto.impl.CiudadAssemblerDTO;
import co.edu.uco.pch.businnes.facade.FacadeWithReturn;
import co.edu.uco.pch.businnes.usecase.impl.ciudad.RegistrarCiudad;
import co.edu.uco.pch.crosscutting.Exceptions.PCHException;
import co.edu.uco.pch.crosscutting.Exceptions.custom.BusinnesPCHException;
import co.edu.uco.pch.data.dao.factory.DAOFactory;
import co.edu.uco.pch.dto.CiudadDTO;

public class ConsultarCiudadesFacade implements FacadeWithReturn<CiudadDTO, List<CiudadDTO>>{

	

	private DAOFactory daoFactory;
	
	public ConsultarCiudadesFacade(DAOFactory daoFactory) {
		daoFactory = DAOFactory.getFactory();
	}

	
	@Override
	public List<CiudadDTO> execute(final CiudadDTO dto) {
					
		try {
			var useCase = new ConsultarCiudadesFacade(daoFactory);
			var ciudadDomain = CiudadAssemblerDTO.getInstance().toDomain(dto);
			var resultadosDomain = useCase.execute(ciudadDomain);
			
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
		return null;
	}

}
