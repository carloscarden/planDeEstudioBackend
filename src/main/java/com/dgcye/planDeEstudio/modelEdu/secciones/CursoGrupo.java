package com.dgcye.planDeEstudio.modelEdu.secciones;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.secciones.CursoGrupoDTO;
import com.dgcye.planDeEstudio.modelEdu.alumnos.CicloEstudio;
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
@Table(name = "CURSOGRUPO", schema = "ABC")
public class CursoGrupo {
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "CODIGO")
	private String codigo; 
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "IDSECUENCIA", referencedColumnName = "ID")
	private Seccion secuencia;
	
	@Column(name = "EDAD")
	private Integer edad;
	
	@Column(name = "IDCURSOGRUPONOMBRE")
	private Integer idCursoGrupoNombre;
	
	@ManyToOne
	@JoinColumn(name = "IDCICLOESTUDIO", referencedColumnName = "id")
	private CicloEstudio cicloEstudio;
	
	@Column(name = "LEYENDAPLANILLA")
	private String leyendaPlanilla;
	
	public String toString(String alias) {
		String cicloEstudioString="";
		String codigo="";
		 if(this.getCicloEstudio()!=null){
    		cicloEstudioString=" - "+this.getCicloEstudio().getDescripcion();
    	} else {
    		cicloEstudioString="";
    	};
    	if(this.getCodigo()!=null){
    		codigo=" ("+this.getCodigo()+")";
    	};
    	return this.getSecuencia().getGrado()+"- "+alias+" "+this.getDescripcion()+ codigo + cicloEstudioString;
	}

	public CursoGrupo(CursoGrupoDTO unCursoGrupo) {
		this.cicloEstudio = new CicloEstudio(unCursoGrupo.getCicloEstudio());
		this.codigo = unCursoGrupo.getCodigo();
		this.descripcion = unCursoGrupo.getDescripcion();
		this.edad = unCursoGrupo.getEdad();
		this.idCursoGrupoNombre = unCursoGrupo.getIdCursoGrupoNombre();
		this.secuencia = new Seccion(unCursoGrupo.getSecuencia());
		this.leyendaPlanilla = unCursoGrupo.getLeyendaPlanilla();
	}

	public void modificarCursoGrupo(CursoGrupoDTO unCursoGrupo) {
		this.cicloEstudio = new CicloEstudio(unCursoGrupo.getCicloEstudio());
		this.codigo = unCursoGrupo.getCodigo();
		this.descripcion = unCursoGrupo.getDescripcion();
		this.edad = unCursoGrupo.getEdad();
		this.idCursoGrupoNombre = unCursoGrupo.getIdCursoGrupoNombre();
		this.secuencia = new Seccion(unCursoGrupo.getSecuencia());
		this.leyendaPlanilla = unCursoGrupo.getLeyendaPlanilla();
	}       
	
}
