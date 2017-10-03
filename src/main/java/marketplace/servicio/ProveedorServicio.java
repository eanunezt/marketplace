package marketplace.servicio;


import marketplace.dao.*;
import marketplace.modelo.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author eanunezt
  */
@Stateless
public class ProveedorServicio {
	@EJB
    private ProveedorDAO dao;


	
	/**
	* retorna una lista con los Proveedor que se encuentran en la base de datos
	* @return retorna una lista de Proveedor
	* @generated
	*/
	public List<Proveedor> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Proveedor
	* @return Proveedor del id dado
	* @generated
	*/
	public Proveedor obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Proveedor
	 * @param entity Proveedor a guardar
	 * @return Proveedor con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Proveedor guardar(Proveedor entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Proveedor con el identificador dado
	 * @param id identificador del Proveedor
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Proveedor
	 * @param entity Proveedor a guardar
	 * @return Proveedor con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Proveedor entity){
		dao.actualizar(entity);
	}
	
	
}
