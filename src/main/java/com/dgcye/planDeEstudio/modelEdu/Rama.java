package com.dgcye.planDeEstudio.modelEdu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RAMA", schema = "ABC")
public class Rama {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "CODIGO")
	private String codigo;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "IDNIVEL", referencedColumnName = "ID")
	@NotNull
	private Nivel nivel;

	@ManyToOne
	@JoinColumn(name = "IDMODALIDAD", referencedColumnName = "ID")
	@NotNull
	private Modalidad modalidad;

	@Column(name = "IDENSENANZA")
	private Integer ensenanza;

	@Column(name = "IDDEPENDENCIAFUNCIONAL")
	private Integer dependenciaFuncional;

	@Column(name = "AUDITORIATITULO")
	private Integer auditoriaTitulo;

	public String devolverDireccion() {
		if ("N".equals(this.codigo)) {
			return "DIRECCIÓN DE EDUCACIÓN DE GESTIÓN PRIVADA";
		} else if ("M".equals(this.codigo)) {
			return "DIRECCIÓN DE EDUCACIÓN SECUNDARIA";
		} else {
			String plus = " ";
			if ("D".equals(this.codigo)) {
				plus = " DE ";
			}
			return "DIRECCIÓN DE EDUCACIÓN" + plus + this.descripcion.toUpperCase();
		}
	}

}
