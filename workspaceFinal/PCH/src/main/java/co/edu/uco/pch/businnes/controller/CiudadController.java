package co.edu.uco.pch.businnes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.pch.businnes.controller.response.CiudadResponse;
import co.edu.uco.pch.crosscutting.Exceptions.PCHException;
import co.edu.uco.pch.dto.CiudadDTO;

@RestController
@RequestMapping("/api/v1/ciudades")

public class CiudadController {
	
	@GetMapping("/dummy")
	public CiudadDTO dummy() {
		return CiudadDTO.build();
	}
	
	@GetMapping("/que")
	public ResponseEntity<CiudadResponse> consultar(){
		var httpStatusCode = HttpStatus.ACCEPTED;
		var ciudadResponse = new CiudadResponse();
		
		try {
			
		}catch(final PCHException exception) {
			httpStatusCode = HttpStatus.BAD_REQUEST;
		}catch (final Exception exception) {
			httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
			
			
		}
		
		return new ResponseEntity<CiudadResponse>(ciudadResponse, httpStatusCode);
		
	}

}
