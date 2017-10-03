package marketplace.dao;

import marketplace.modelo.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author eanunezt
  */
@Stateless
public class CatalogoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Catalogo> obtenerTodos(){
		return em.createNamedQuery("Catalogo.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Catalogo obtener(Long id){
		return em.find(Catalogo.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Catalogo guardar(Catalogo entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Catalogo.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Catalogo entidad){
		em.merge(entidad);
	}
	
	
}
