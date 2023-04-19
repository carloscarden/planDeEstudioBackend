package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import javax.persistence.Column;
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
@Table(name = "CALIFICACION_CALIFICACION_X_METODO", schema = "ABC")
public class CalificacionCalificacionXMetodo {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "ID_CALIFICACION_METODO")
	private Long idCalificacionMetodo;
	

	@Column(name = "VALOR")
	private String valor;

}
