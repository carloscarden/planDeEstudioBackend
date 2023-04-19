package com.dgcye.planDeEstudio.repoEdu.secciones;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.secciones.CursoGrupo;


public interface CursoGrupoRepository extends JpaRepository<CursoGrupo, Integer>{

	List<CursoGrupo> findByIdCursoGrupoNombre(Integer idCursoGrupoNombre);
	
	
	CursoGrupo findByIdCursoGrupoNombreAndSecuenciaId(Integer idCursoGrupoNombre, Integer idSecuencia);
}
