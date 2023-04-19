package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.MateriaDenominacion;


public interface MateriaDenominacionRepository extends JpaRepository<MateriaDenominacion ,Integer>{
	
	Page<MateriaDenominacion> findByDescripcion(String descripcion, Pageable pageable);
	MateriaDenominacion findByDescripcion(String descripcion);
}
