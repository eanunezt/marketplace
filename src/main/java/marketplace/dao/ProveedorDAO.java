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
public class ProveedorDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Proveedor> obtenerTodos(){
		return em.createNamedQuery("Proveedor.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Proveedor obtener(Long id){
		return em.find(Proveedor.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Proveedor guardar(Proveedor entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Proveedor.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Proveedor entidad){
		em.merge(entidad);
	}
	
	
}
