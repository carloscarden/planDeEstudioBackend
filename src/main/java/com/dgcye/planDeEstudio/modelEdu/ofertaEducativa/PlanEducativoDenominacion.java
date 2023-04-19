package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.PlanEducativoDenominacionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OFERTADENOMINACIONESGENERALES", schema = "ABC")
public class PlanEducativoDenominacion {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "IDATRIBUTO")
	private Integer idAtributo;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	
	public PlanEducativoDenominacion(PlanEducativoDenominacionDTO unPlanEducativo) {
		this.id = unPlanEducativo.getId();
		this.idAtributo = unPlanEducativo.getIdAtributo();
		this.descripcion = unPlanEducativo.getDescripcion();
	}


	public void modificarPlanEducativo(PlanEducativoDenominacionDTO unPlanEducativo) {
		this.id = unPlanEducativo.getId();
		this.idAtributo = unPlanEducativo.getIdAtributo();
		this.descripcion = unPlanEducativo.getDescripcion();
		
	}

}
