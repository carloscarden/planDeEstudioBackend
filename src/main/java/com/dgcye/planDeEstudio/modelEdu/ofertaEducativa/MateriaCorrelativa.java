package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.dgcye.planDeEstudio.modelEdu.Materia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MATERIACORRELATIVA", schema = "ABC")
public class MateriaCorrelativa {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "IDMATERIA", referencedColumnName = "ID")
	@NotNull
	private Materia materia;
	
	@ManyToOne
	@JoinColumn(name = "IDMATERIACORRELATIVA", referencedColumnName = "ID")
	@NotNull
    private Materia materiaCorrelativa;

}
