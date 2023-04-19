package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaEducativaSeccion;


public interface OfertaEducativaSeccionRepository extends JpaRepository<OfertaEducativaSeccion, Long>{
	
	List<OfertaEducativaSeccion> findByIdOfertaEducativa(Integer idOfertaEducativa);
	
	OfertaEducativaSeccion findByIdOfertaEducativaAndSeccionId(Integer idOfertaEducativa, 
															   Integer idSeccion);

}
