package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.CalificacionCalificacionXMetodo;


public interface CalificacionCalificacionXMetodoRepository 
			extends JpaRepository<CalificacionCalificacionXMetodo, Long>{
	
	List<CalificacionCalificacionXMetodo> findByIdCalificacionMetodo(Long idCalificacionMetodo);
	
	

}
