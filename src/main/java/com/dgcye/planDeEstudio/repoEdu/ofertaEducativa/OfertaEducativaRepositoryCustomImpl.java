package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.dgcye.planDeEstudio.dtos.busquedas.BusquedaRamaOfertaEducativaDTO;
import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaEducativa;




@Repository
public class OfertaEducativaRepositoryCustomImpl {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public Page<OfertaEducativa> busquedaDeLaRama(BusquedaRamaOfertaEducativaDTO b, Pageable page) {
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<OfertaEducativa> query = builder.createQuery(OfertaEducativa.class);
		Root<OfertaEducativa> ofertaEducativa = query.from(OfertaEducativa.class);
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		
		String titulo = b.getTitulo();
		String orientacion = b.getOrientacion();
		Integer nivelId = b.getNivel();
		Integer tipoOrganizacion = b.getTipoOrganizacion();
		String ramaResponsable = b.getRamaResponsable();
		Integer estadoId = b.getEstado();
		
		
		Predicate criteria = builder.conjunction();
		
		/************************************************************/
				// TITULO
		
		if (titulo != null && !"".equals(titulo)) {
			Predicate tituloLike = 
					builder.like(builder.lower(ofertaEducativa.get("titulo")), "%" + titulo + "%");
			criteria = builder.and(criteria, tituloLike);
		}
		/************************************************************/
				// ORIENTACION
		if (orientacion != null && !"".equals(orientacion)) {
			Predicate orientacionLike = builder.like(	
					                      builder.lower(ofertaEducativa.get("orientacion")), 
					           			  "%" + orientacion + "%" );
			criteria = builder.and(criteria, orientacionLike);
		}
		/************************************************************/
				// NIVEL
		if(nivelId != null && nivelId != -1) {

			Predicate estadoTituloEqual = 
						builder.equal(ofertaEducativa.get("nivel").<Integer>get("id"), nivelId);
			criteria = builder.and(criteria, estadoTituloEqual);
		}
		/************************************************************/
				// TIPO ORGANIZACION
		
		if(tipoOrganizacion != null && tipoOrganizacion != -1) {
			// TODO filtro por tipoOrganizacion
		}
		
		/************************************************************/
				// RAMA RESPONSABLE
		// para DIPREGEP 
		if ("1".equals(ramaResponsable)) {
			
			Predicate estadoTituloEqual = 	builder.equal(ofertaEducativa.get("idRama"), 11);
			criteria = builder.and(criteria, estadoTituloEqual);
		} else if ("0".equals(ramaResponsable)) {
			Predicate estadoTituloEqual = builder.notEqual(ofertaEducativa.get("idRama"), 11);
			criteria = builder.and(criteria, estadoTituloEqual);
		}
	
		/************************************************************/
				// ESTADO
		if (estadoId != null) {
			Predicate estadoTituloEqual = 
						builder.equal(ofertaEducativa.get("estado").<Integer>get("id"), estadoId);
			criteria = builder.and(criteria, estadoTituloEqual);
		}
	
		
		/************************************************************/
		
		query.select(ofertaEducativa).where(criteria);
		List<OfertaEducativa> listaOfertaEducativa = 
				entityManager.createQuery(query).setMaxResults(page.getPageSize())
				.setFirstResult(page.getPageNumber() * page.getPageSize()).getResultList();
		
		cq.select(builder.count(cq.from(OfertaEducativa.class))).where(criteria);
		Long cant = entityManager.createQuery(cq).getSingleResult();
		
		
		
		Page<OfertaEducativa> result = new PageImpl<OfertaEducativa>(listaOfertaEducativa, page, cant);
		return result;
		
	}
}
