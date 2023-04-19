package com.dgcye.planDeEstudio.repoEdu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgcye.planDeEstudio.modelEdu.perfileria.VPermiso;
import com.dgcye.planDeEstudio.modelEdu.perfileria.VPermisoId;


public interface VPermisoRepository extends JpaRepository<VPermiso, VPermisoId>{
	
	List<VPermiso> findByVPermisoIdPerfilId(Long perfilId);

}
