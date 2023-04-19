package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.CalificacionMetodo;


public interface CalificacionMetodoRepository extends JpaRepository<CalificacionMetodo, Long>{

	List<CalificacionMetodo> findByIdRama(Integer idRama);
	
}
