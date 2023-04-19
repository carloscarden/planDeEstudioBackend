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

import com.dgcye.planDeEstudio.dtos.materias.DatosExtraMateriasDTO;
import com.dgcye.planDeEstudio.dtos.materias.MateriaOfertaDTO;
import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.MateriaDenominacion;
import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaEducativa;
import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.Seccion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MATERIA", schema = "ABC")
public class Materia {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "IDMATERIADENOMINACION", referencedColumnName = "ID")
	@NotNull
	private MateriaDenominacion materiaDenominacion;

	@ManyToOne
	@JoinColumn(name = "IDOFERTAEDUCATIVA", referencedColumnName = "ID")
	@NotNull
	private OfertaEducativa ofertaEducativa;

	@ManyToOne
	@JoinColumn(name = "IDSECCION", referencedColumnName = "ID")
	@NotNull
	private Seccion seccion;

	@Column(name = "MARCAMODULO")
	private String marcaModulo;

	@Column(name = "CARGAHORARIA")
	private Float cargaHoraria;

	@Column(name = "OPCIONAL")
	private Integer opcional;

	@Column(name = "ORDEN")
	private Integer orden;

	@Column(name = "CODIGOSCHEQUEADOS")
	private Integer codigosChequeados;

	@Column(name = "IDTIPOMATERIA")
	private Integer idTipoMateria;

	@Column(name = "OBLIGATORIEDAD")
	private Integer obligatoriedad;

	@Column(name = "UNIDADCARGAPEDAGOGICA")
	private Integer unidadCargaPedagogica;

	public Materia(MateriaOfertaDTO m) {
		// TODO Auto-generated constructor stub
	}

	public Materia duplicarMateria(Materia materia, OfertaEducativa oferta) {
		Materia materiaNueva = new Materia();
		materiaNueva.setCargaHoraria(materia.getCargaHoraria());
		materiaNueva.setMarcaModulo(materia.getMarcaModulo());
		materiaNueva.setMateriaDenominacion(materia.getMateriaDenominacion());
		materiaNueva.setOpcional(materia.getOpcional());
		materiaNueva.setOrden(materia.getOrden());
		materiaNueva.setSeccion(materia.getSeccion());
		materiaNueva.setCodigosChequeados(materia.getCodigosChequeados());
		materiaNueva.setOfertaEducativa(oferta);
		return materiaNueva;
	}

	public void cargarDatosExtra(DatosExtraMateriasDTO datosExtraMateria) {
		this.obligatoriedad = datosExtraMateria.getObligatoriedad();
		this.idTipoMateria = datosExtraMateria.getTipoMateria();
		this.unidadCargaPedagogica = datosExtraMateria.getUnidadCargaPedagogica();
	}

}
