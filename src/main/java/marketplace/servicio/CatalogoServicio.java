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
public class CatalogoServicio {
	@EJB
    private CatalogoDAO dao;


	
	/**
	* retorna una lista con los Catalogo que se encuentran en la base de datos
	* @return retorna una lista de Catalogo
	* @generated
	*/
	public List<Catalogo> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Catalogo
	* @return Catalogo del id dado
	* @generated
	*/
	public Catalogo obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Catalogo
	 * @param entity Catalogo a guardar
	 * @return Catalogo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Catalogo guardar(Catalogo entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Catalogo con el identificador dado
	 * @param id identificador del Catalogo
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Catalogo
	 * @param entity Catalogo a guardar
	 * @return Catalogo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Catalogo entity){
		dao.actualizar(entity);
	}
	
	
}
