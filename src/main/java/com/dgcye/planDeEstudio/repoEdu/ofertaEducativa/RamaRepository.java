package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.Rama;


public interface RamaRepository extends JpaRepository<Rama, Integer>{
	
	Rama findById(Integer id);

}
