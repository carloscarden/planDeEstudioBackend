package com.dgcye.planDeEstudio.dtos.materias;


import com.dgcye.planDeEstudio.dtos.ofertaEducativa.MateriaDenominacionDTO;
import com.dgcye.planDeEstudio.dtos.ofertaEducativa.SeccionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MateriaOfertaDTO {

	private Integer id;
	private MateriaDenominacionDTO materiaDenominacion;
	private SeccionDTO seccion;
	private String marcaModulo;
	private Float cargaHoraria;
	private Integer opcional;
	private Integer orden;
	private Integer codigosChequeados;
	private Integer idTipoMateria;
	private Integer obligatoriedad;
	private Integer unidadCargaPedagogica;
	
	

}
