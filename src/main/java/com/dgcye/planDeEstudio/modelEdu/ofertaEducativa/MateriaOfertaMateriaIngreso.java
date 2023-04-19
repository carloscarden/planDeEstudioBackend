package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MATERIAOFERTAMATERIAINGRESO", schema = "ABC")
public class MateriaOfertaMateriaIngreso {
	
	
	
	@EmbeddedId
	private MateriaOfertaMateriaIngresoID materiaIngresoId;
	
	
	@Column(name = "CARGAHORARIA")
	private Float cargaHoraria;
	
	
	@Column(name = "DIVISIBLEPOFA")
	private Boolean divisiblePofa;


	public void setearIdMateria(Integer unIdMateria) {
		this.materiaIngresoId.setIdMateria(unIdMateria);
		
	}


	
	public Integer recuperarIdMateriaIngreso() {
		return this.materiaIngresoId.getIdMateriaIngreso();
	}


	public void setearIdMateriaIngreso(Integer idMateriaIngreso) {
		this.materiaIngresoId.setIdMateriaIngreso(idMateriaIngreso);
	}


	public Integer recuperarIdMateria() {
		return this.materiaIngresoId.getIdMateria();
	}
	
	

}
