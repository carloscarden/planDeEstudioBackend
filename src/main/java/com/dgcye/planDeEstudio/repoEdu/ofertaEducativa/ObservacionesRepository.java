package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.AlumnoTituloObservaciones;


public interface ObservacionesRepository extends JpaRepository<AlumnoTituloObservaciones, Long>{

	List<AlumnoTituloObservaciones> findByIdAlumnoTitulo(Long idAlumnoTitulo);
	
	@Query("SELECT COUNT(u) FROM AlumnoTituloObservaciones u WHERE u.idAlumnoTitulo = :idAlumnoTitulo")
    long contarObservacionesDelTitulo(@Param("idAlumnoTitulo") Long idAlumnoTitulo);	
	
	void deleteByIdAlumnoTitulo(Long idAlumnoTitulo);
}