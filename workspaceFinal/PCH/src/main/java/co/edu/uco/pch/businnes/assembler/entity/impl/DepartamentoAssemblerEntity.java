package co.edu.uco.pch.businnes.assembler.entity.impl;

import java.util.List;

import co.edu.uco.pch.businnes.assembler.entity.AssemblerEntity;
import co.edu.uco.pch.businnes.domain.DepartamentoDomain;
import co.edu.uco.pch.businnes.domain.PaisDomain;
import co.edu.uco.pch.dto.DepartamentoDTO;
import co.edu.uco.pch.entity.DepartamentoEntity;
import co.edu.uco.pch.entity.PaisEntity;

public class DepartamentoAssemblerEntity implements AssemblerEntity<DepartamentoDomain,DepartamentoEntity> {

	private static final AssemblerEntity<PaisDomain,PaisEntity> paisAssembler= PaisAssemblerEntity.getInstance();
	private static final AssemblerEntity<DepartamentoDomain, DepartamentoEntity> instance=new DepartamentoAssemblerEntity();
	
	private DepartamentoAssemblerEntity(){
        super();
    }

    public static final AssemblerEntity<DepartamentoDomain, DepartamentoEntity> getInstance(){
        return instance;
    }
	
	@Override
	public DepartamentoDomain toDomain(DepartamentoEntity data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartamentoEntity toEntity(DepartamentoDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DepartamentoDomain> toDomainCollection(List<DepartamentoEntity> entityColleccion) {
		// TODO Auto-generated method stub
		return null;
	}

}
