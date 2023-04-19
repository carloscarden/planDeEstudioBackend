package com.dgcye.planDeEstudio.dtos.mensajesDTO;

public enum ErrorAlumno {
	VACIO_DOCUMENTO("El documento es requerido"),
	VACIO_TIPODOC("El tipo de documento es requerido"),
	VACIO_NOMBRE("El nombre es requerido"),
	VACIO_APELLIDO("El apellido es requerido"),
	VACIO_FECHANAC("La fecha de nacimiento es requerida"),
	VACIO_SEXO("El sexo es requerido"),
	VACIO_IDSERCREADOR("No se encontró el establecimiento creador"),
	VACIO_OFERTAEDUCATIVA("No se encontró la oferta educativa");
	
	private String s;
	
	private ErrorAlumno(String unAlias) {
		this.setS(unAlias);
	}

	public String getS() {
		return s;
	}

	public void setS(String alias) {
		this.s = alias;
	}
	

}
