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
public class OfertaXTipoOrgId implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "IDTIPOORGANIZACION", nullable = false)
	private Integer idTipoOrganizacion;
	
	@Column(name = "IDOFERTAEDUCATIVA", nullable = false)
	private Integer idOfertaEducativa;
}
