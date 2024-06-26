package co.edu.uco.pch.businnes.assembler.entity.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import co.edu.uco.pch.businnes.assembler.entity.AssemblerEntity;
import co.edu.uco.pch.businnes.domain.CiudadDomain;
import co.edu.uco.pch.crosscutting.helpers.ObjectHelper;
import co.edu.uco.pch.dto.CiudadDTO;
import co.edu.uco.pch.entity.CiudadEntity;

public class CiudadAssemblerEntity implements AssemblerEntity<CiudadDomain, CiudadEntity>{

	
	
private static final AssemblerEntity<CiudadDomain, CiudadEntity> instance=new CiudadAssemblerEntity();
	
	private CiudadAssemblerEntity() {
		super();
	}
	
	public static final AssemblerEntity<CiudadDomain, CiudadEntity> getInstance(){
		return instance;
	}
	
	
	@Override
	public CiudadDomain toDomain(CiudadEntity data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CiudadEntity toEntity(CiudadDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public final List<CiudadDomain> toDomainCollection(final List<CiudadEntity> entityColleccion) {
		var entityColleccionTmp = ObjectHelper.getObjectHelper().getDefaultValue(entityColleccion,new ArrayList<CiudadEntity>());
		
		return entityColleccionTmp.stream().map(this::toDomain).toList();
		
	}

}
