package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.Orientacion;


public interface OrientacionRepository extends JpaRepository<Orientacion, Integer>{
	
	Page<Orientacion> findByDescripcion(String descripcion, Pageable pageable);
	

}
