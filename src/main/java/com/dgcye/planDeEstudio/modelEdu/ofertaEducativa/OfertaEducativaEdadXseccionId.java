package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class OfertaEducativaEdadXseccionId implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "idSeccion", referencedColumnName = "id", nullable = false)
	private Seccion seccion;

	@Column(name = "idOfertaEducativa")
	private Integer ofertaEducativaId;
}
