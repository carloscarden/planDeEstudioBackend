package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MATERIAINGRESO", schema = "ABC")
public class MateriaIngreso {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "CODIGO")
	private String codigo;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;

}
