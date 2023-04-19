package com.dgcye.planDeEstudio.modelEdu.establecimiento;

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
public class Domicilio {

	@Column(name = "CALLE")
	private String calle;
	
	@Column(name = "NRODIRECCION")
  	private String numero;
	
	@Column(name = "PISO")
  	private String piso;
	
	@Column(name = "CODIGOPOSTAL")
  	private String codigoPostal;
	
	@Column(name = "DESCRLOCALIDAD")
  	private String  localidad;
	
	@Column(name = "ENTRECALLES")
  	private String entreCalles;
	
	@Column(name = "BARRIOPARAJE")
  	private String barrioParaje;
	
}
