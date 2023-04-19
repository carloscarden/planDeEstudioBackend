package com.dgcye.planDeEstudio.dtos.establecimiento;


import com.dgcye.planDeEstudio.modelEdu.AlumnoTitulo;
import com.dgcye.planDeEstudio.modelEdu.establecimiento.TituloEstablecimiento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstablecimientoImpresionDTO {

	private String nombreEstab;
	private String cueNro;
	private String direccion;
	private String provincia;
	private String ciudad;

	public void llenarEstabImpresionConTitulo(AlumnoTitulo aluTitulo) {
		this.nombreEstab = aluTitulo.getEstabNombre();
		this.cueNro = aluTitulo.getEstabCue();
		this.direccion = aluTitulo.getEstabUbicadoEn();
		this.ciudad = aluTitulo.getEstabCiudad();
		this.provincia = aluTitulo.getEstabProvincia();
	}

	public void llenarEstabImpresionConEstab(TituloEstablecimiento estab) {
		if (estab != null) {
			this.setCueNro(estab.getCue());
			this.setDireccion(estab.getUbicadoEn());
			this.setProvincia("BUENOS AIRES");
			this.setCiudad(estab.getCiudad());
			this.setNombreEstab(estab.getNombreTrim());
		}
	}
}
