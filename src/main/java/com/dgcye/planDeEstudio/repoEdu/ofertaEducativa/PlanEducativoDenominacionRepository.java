package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.PlanEducativoDenominacion;


public interface PlanEducativoDenominacionRepository 
       extends JpaRepository<PlanEducativoDenominacion, Integer> {
	
	List<PlanEducativoDenominacion> findByIdAtributoOrderByDescripcionAsc(Integer idAtributo);
	List<PlanEducativoDenominacion> findByIdAtributoOrderByDescripcionDesc(Integer idAtributo);
	
	PlanEducativoDenominacion findById(Integer id);
	
	
	
	Page<PlanEducativoDenominacion> 
			findByIdAtributoAndDescripcionLike(Integer tipo, String descripcion, Pageable page);
	
	Page<PlanEducativoDenominacion> findByIdAtributo(Integer tipo, Pageable page);
	
	PlanEducativoDenominacion findByDescripcion(String descripcion);
}
