package com.dgcye.planDeEstudio.modelEdu.perfileria;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Perfil {

	private String perfil;
	private List<String> servicios;
	private String[] permisos;

	public String getNombrePerfil() {
		EstabTiposPerfilDescripcion e = Enum.valueOf(EstabTiposPerfilDescripcion.class, perfil);
		return e.getDescripcion();
	}
}
