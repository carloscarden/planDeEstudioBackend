package com.dgcye.planDeEstudio.dtos.ofertaEducativa;

import java.util.Date;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.AlumnoTituloObservaciones;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoTituloObservacionesDTO {

	private Long id;
	private Long idAlumnoTitulo;
	private Integer idEstadoAlumnoTitulo;
	private String auditoriaObservaciones;
	@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
	private Date fecha;
	private Long fechaLong;
	
	private Integer esRama;


	public AlumnoTituloObservacionesDTO(AlumnoTituloObservaciones observaciones) {
		this.id = observaciones.getId();
		this.idAlumnoTitulo = observaciones.getIdAlumnoTitulo();
		this.idEstadoAlumnoTitulo = observaciones.getIdEstadoAlumnoTitulo();
		this.auditoriaObservaciones = observaciones.getAuditoriaObservaciones();
		this.fecha = observaciones.getFecha();
		this.fechaLong = observaciones.getFecha().getTime();
		this.esRama = observaciones.getEsRama();
	}
}
