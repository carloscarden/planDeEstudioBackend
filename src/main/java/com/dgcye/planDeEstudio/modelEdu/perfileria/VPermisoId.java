package com.dgcye.planDeEstudio.modelEdu.perfileria;


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
public class VPermisoId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "PERFILID", nullable = false)
	private Long perfilId;
	
	@Column(name = "CODIGOOPERACION", nullable = false)
	private String codigoOperacion;

}
