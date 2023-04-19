package com.dgcye.planDeEstudio.modelEdu.perfileria;

public enum EstabTiposPerfilDescripcion {

	EQUIPO_CONDUCCION("EQUIPO DE CONDUCCION"),
	OPERADOR_MISALUMNOS_SUPERIOR("OPERADOR MISALUMNOS SUPERIOR: "),
	OPERADOR_TITULOS("OPERADOR TITULOS: ");

	private String descripcion;
	
	EstabTiposPerfilDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
