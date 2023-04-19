package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.MateriaIngreso;


public interface MateriaIngresoRepository extends JpaRepository<MateriaIngreso, Integer> {

	Page<MateriaIngreso> findAll(Pageable pageable);

	Page<MateriaIngreso> findByDescripcion(String descripcion, Pageable pageable);

}
