package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.dgcye.planDeEstudio.modelEdu.AlumnoTitulo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ALUMNOTITULOOBSERVACIONES", schema = "ABC")
public class AlumnoTituloObservaciones {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "IDALUMNOTITULO")
	private Long idAlumnoTitulo;
	
	
	@Column(name = "IDESTADOALUMNOTITULO")
	private Integer idEstadoAlumnoTitulo;
	
	@Column(name = "AUDITORIAOBSERVACIONES")
	private String auditoriaObservaciones;
	
	@Column(name = "FECHA")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Column(name = "ESRAMA")
	private Integer esRama;

	public void llenarObservacionDeEstab(AlumnoTitulo titulo, String observaciones) {
		this.setFecha(new Date());
		this.setIdAlumnoTitulo(titulo.getId());
		this.setIdEstadoAlumnoTitulo(titulo.getEstado().getId());
		this.setAuditoriaObservaciones(observaciones);
		this.setEsRama(0);
	}

	public void llenarObservacionDeRama(AlumnoTitulo titulo, String observaciones) {
		this.setFecha(new Date());
		this.setIdAlumnoTitulo(titulo.getId());
		this.setIdEstadoAlumnoTitulo(titulo.getEstado().getId());
		this.setAuditoriaObservaciones(observaciones);
		this.setEsRama(1);
	}
}
