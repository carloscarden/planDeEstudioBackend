package com.dgcye.planDeEstudio.dtos.establecimiento;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.EstadoOfertaDTO;
import com.dgcye.planDeEstudio.modelEdu.AlumnoTitulo;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoTituloDTO {

	private Long idAlumnoTitulo;
	
	private String observaciones;

	private EstadoOfertaDTO estado;
	
	private Integer idAlumnoEstabOferta;
	
	private String validezNacional;
	
	private String numeroRfifd;
	
	private String nroSerie;
	
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd" , timezone = "UTC")
	private Date fechaEgreso;
	
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd" , timezone = "UTC")
	private Date fechaEnvio;
	
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd" , timezone = "UTC")
	private Date fechaUltimoEstado;
	
	private Integer nroLibroMatriz;
	
	private Integer nroActa;
	
	private Integer nroFolio;
	
	private String estabNombre;
	
	private String estabCue;
	
	private String estabUbicadoEn;
	
	private String estabCiudad;

	private Integer tituloIntermedio;
	
	private String promedio;
	
	private Integer idRamaRuta;
	
	@JsonFormat(pattern = "MM-dd-yyyy")
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date fechaRuta;

	private String apynomListoParaEnviar;
	
	private String documentoListoParaEnviar;

	private String apynomEnviado;
	
	private String documentoEnviado;
	
	private String estabProvincia;
	
	public AlumnoTituloDTO(AlumnoTitulo unAlumnoTitulo) {
	
		super();
		this.setIdAlumnoTitulo(unAlumnoTitulo.getId());
		this.setPromedio(unAlumnoTitulo.getPromedio());
		this.setTituloIntermedio(unAlumnoTitulo.getTituloIntermedio());
		this.setObservaciones(unAlumnoTitulo.getObservaciones());
		this.setNumeroRfifd(unAlumnoTitulo.getNumeroRfifd());
		this.setValidezNacional(unAlumnoTitulo.getValidezNacional());
		this.setFechaEgreso(unAlumnoTitulo.getFechaEgreso());
		this.setEstabCiudad(unAlumnoTitulo.getEstabCiudad());
		this.setEstabProvincia(unAlumnoTitulo.getEstabProvincia());
		this.setEstabNombre(unAlumnoTitulo.getEstabNombre());
		this.setEstabUbicadoEn(unAlumnoTitulo.getEstabUbicadoEn());
		this.setEstabCue(unAlumnoTitulo.getEstabCue());
		if (unAlumnoTitulo.getNroActa() != null && unAlumnoTitulo.getNroActa() != 0) {
			this.setNroActa(unAlumnoTitulo.getNroActa());
		} else {
			this.setNroActa(null);
		}
		this.setNroFolio(unAlumnoTitulo.getNroFolio());
		this.setNroLibroMatriz(unAlumnoTitulo.getNroLibroMatriz());
		
		this.setEstado(new EstadoOfertaDTO(unAlumnoTitulo.getEstado()));
		this.setFechaUltimoEstado(unAlumnoTitulo.getFechaUltimoEstado());
		this.setIdAlumnoEstabOferta(unAlumnoTitulo.getIdAlumnoEstabOferta());
	}


}
