package com.dgcye.planDeEstudio.dtos.perfileria;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsrDTO {
	private String dniUsuario;
	private String nombreUsuario;
	private String rama;

}
