package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dgcye.SistemaTitulos.dtos.ofertaEducativa.OfertaEducativaCalificacionXseccionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CALIFICACION_CALIFICACION_X_SECCION_OFERTA", schema = "ABC")
public class OfertaEducativaCalificacionXseccion {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "id_oferta_educativa")
	private Integer idOfertaEducativa;
	
	@ManyToOne
	@JoinColumn(name = "id_seccion", referencedColumnName = "id")
	private Seccion seccion;
	
	@ManyToOne
	@JoinColumn(name = "id_calificacion_metodo", referencedColumnName = "id")
	private CalificacionMetodo calificacion;	
	

	
	public OfertaEducativaCalificacionXseccion(OfertaEducativaCalificacionXseccionDTO c, 
			Integer idOfertaEducativa) {
		this.id = c.getId();
		this.idOfertaEducativa = idOfertaEducativa;
		this.seccion = new Seccion(c.getSeccion());
		this.calificacion = new CalificacionMetodo(c.getCalificacion());
	}

}
