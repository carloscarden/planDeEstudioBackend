package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.CalificacionPeriodoEvaluacion;


public interface CalificacionPeriodoEvaluacionRepository 
    extends JpaRepository<CalificacionPeriodoEvaluacion, Long> {

}
