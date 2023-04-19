package com.dgcye.planDeEstudio.modelEdu.establecimiento;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_LOCALIZACION", schema = "ABC")
public class Localizacion {
	
	@Id
	@Column(name = "IDESTAB")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEstab;
	
	@Column(name = "IDSER")
	private Integer idSer;
	
	@Column(name = "CLAVEESTAB")
	private String claveEstab;
	
	@Column(name = "IDENSENANZA")
	private Integer idEnsenanza;
	
	@Column(name = "CUE")
	private String cue;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "NUMERO")
	private String numero;
	
	@Column(name = "IDDISTRITO")
	private Integer idDistrito;
	
	@Embedded
	private Domicilio domicilio;

}
