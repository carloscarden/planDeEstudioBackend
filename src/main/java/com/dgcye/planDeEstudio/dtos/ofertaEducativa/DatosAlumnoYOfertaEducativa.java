package com.dgcye.planDeEstudio.dtos.ofertaEducativa;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DatosAlumnoYOfertaEducativa {

	private String documento;
	private Integer idTipoDocumento;
	private String nombre;
	private String apellido;
	private Integer idAlumno;
	private Integer idOferta;
	private String sexo;
	private String ciudadNacimiento;
	private String provinciaNacimiento;
	private Integer idProvincia;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd" , timezone = "UTC")
	private Date fechaNacimiento;
	private Integer idNacionalidad;
	private String pais;
	private Integer idSerCreador;


}
