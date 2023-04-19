package com.dgcye.planDeEstudio.dtos.perfileria;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpcionPerfilDTO {

	private Long id;
	private String descripcion;

}
