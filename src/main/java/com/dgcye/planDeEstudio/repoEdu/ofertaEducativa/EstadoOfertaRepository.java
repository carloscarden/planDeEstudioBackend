package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.EstadoOferta;


public interface EstadoOfertaRepository extends JpaRepository<EstadoOferta ,Long>{

	EstadoOferta findByCodigoAndIdTablaDestino(String codigo, String idTablaDestino);
	
	List<EstadoOferta> findByIdTablaDestinoOrderByDescripcionAsc(String idTablaDestino);
}
