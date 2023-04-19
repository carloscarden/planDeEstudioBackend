package com.dgcye.planDeEstudio.repoEdu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.perfileria.VPerfil;


public interface VPerfilRepository extends JpaRepository<VPerfil, Integer>{

	
	@Query(value="SELECT  IDPERFIL, PERFIL, IDRAMA, DESCRIPCIONOBJETO "
			+ " FROM DGE.V_PERFIL_N vpn "
			+ " WHERE PERFIL IN ('AdministradorOferta', 'SUPER_ADMIN_ESTAB', 'IMPRESION_TITULOS') "
			+ " AND DOCUMENTO = :documento",
			nativeQuery=true)
	List<Object[]> recuperarOpcionesPerfil(@Param(value = "documento") String documento);
	
}
