package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class MateriaOfertaMateriaIngresoID implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Column(name = "IDMATERIA", nullable = false)
	private Integer idMateria;
	
	
	@Column(name = "IDMATERIAINGRESO")
	private Integer idMateriaIngreso;

}
