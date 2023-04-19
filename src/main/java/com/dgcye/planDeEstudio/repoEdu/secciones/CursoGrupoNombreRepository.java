package com.dgcye.planDeEstudio.repoEdu.secciones;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.secciones.CursoGrupoNombre;


public interface CursoGrupoNombreRepository extends JpaRepository<CursoGrupoNombre, Integer>{

	
	List<CursoGrupoNombre> findByIdRama(Integer idRama);
}
