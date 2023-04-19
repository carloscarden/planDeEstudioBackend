package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "OFERTAXTIPOORG", schema = "ABC")
public class OfertaXTipoOrg {
	@EmbeddedId
	private OfertaXTipoOrgId ofertaXTipoOrgId;


	public Integer getIdTipoOrganizacion() {
		return this.ofertaXTipoOrgId.getIdTipoOrganizacion();
	}
	
	
	public void setIdOfertaEducativa(Integer unIdOfertaEducativa) {
		this.ofertaXTipoOrgId.setIdOfertaEducativa(unIdOfertaEducativa);
		
	}

	public void setIdTipoOrganizacion(Integer idTipoOrganizacion) {
		this.ofertaXTipoOrgId.setIdTipoOrganizacion(idTipoOrganizacion);
		
	}
}
