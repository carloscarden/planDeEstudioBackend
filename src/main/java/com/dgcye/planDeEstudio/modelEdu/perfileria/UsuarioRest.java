package com.dgcye.planDeEstudio.modelEdu.perfileria;

import java.util.List;
import java.util.stream.Collectors;

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
public class UsuarioRest {
	private String documento;
	private String usuario;
	private String nombre;
	private List<Perfil> perfiles;

	public List<Perfil> buscarPerfilesRest(){
		List<Perfil> perfilesST = perfiles.stream()
				.filter(
						p -> 
							p.getPerfil().equals("EQUIPO_DE_CONDUCCION") || 
							p.getPerfil().equals("OPERADOR_MISALUMNOS_SUPERIOR") ||
							p.getPerfil().equals("OPERADOR_TITULOS"))
				.collect(Collectors.toList());

		return perfilesST;
	}
}
