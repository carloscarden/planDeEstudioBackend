package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.OfertaEducativaEdadXSeccionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OFERTAEDUCATIVAEDADSECCION", schema = "ABC")
public class OfertaEducativaEdadXSeccion {
	  @EmbeddedId
	  private OfertaEducativaEdadXseccionId id;

	  @ManyToOne
	  @JoinColumn(name = "idEdad", referencedColumnName = "id", nullable = false)
	  private PlanEducativoDenominacion edad;


	public OfertaEducativaEdadXSeccion(OfertaEducativaEdadXSeccionDTO e, Integer idOfertaEducativa) {
		// TODO Auto-generated constructor stub
	}
	
	
	public Seccion dameSeccion() {
		return id.getSeccion();
	}
	
	public void seteameSeccion(Seccion unaSeccion) {
		this.id.setSeccion(unaSeccion);
	}

	public void seteameIdOfertaEducativa(Integer unIdOfertaEducativa) {
		this.id.setOfertaEducativaId(unIdOfertaEducativa);
	}


}
