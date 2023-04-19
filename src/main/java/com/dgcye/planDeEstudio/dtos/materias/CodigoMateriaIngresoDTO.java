package com.dgcye.planDeEstudio.dtos.materias;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.MateriaIngreso;
import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.MateriaOfertaMateriaIngreso;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CodigoMateriaIngresoDTO {
	private Integer idMateria;
	private Integer idMateriaIngreso;
	private String descripcion;
	private Float cargaHoraria;
	private Boolean divisiblePofa;
	
	
	
	public CodigoMateriaIngresoDTO(MateriaOfertaMateriaIngreso materiaOfIng, 
			MateriaIngreso materiaIngreso) {
		this.descripcion =  materiaIngreso.getDescripcion()+" ("+materiaIngreso.getCodigo()+")";
		this.idMateria = materiaOfIng.recuperarIdMateria();
		this.idMateriaIngreso = materiaOfIng.recuperarIdMateriaIngreso();
		this.cargaHoraria = materiaOfIng.getCargaHoraria();
		this.divisiblePofa = materiaOfIng.getDivisiblePofa();
		
		
	}
}
