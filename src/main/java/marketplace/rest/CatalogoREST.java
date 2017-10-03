package marketplace.rest;

import marketplace.modelo.entity.*;
import marketplace.servicio.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
  *  @author eanunezt
  *  @generated
  */
@Stateless
@Path("/catalogo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CatalogoREST {
	@EJB
    private CatalogoServicio servicio;

	
	/**
	* retorna una lista con los Catalogo que se encuentran en la base de datos
	* @return retorna una lista de Catalogo
	* @generated
	*/
	@GET
	public List<Catalogo> obtenerTodosCatalogos(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Catalogo
	* @return Catalogo del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Catalogo obtenerCatalogo(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Catalogo
	 * @param entity Catalogo a guardar
	 * @return Catalogo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Catalogo guardarCatalogo(Catalogo entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Catalogo con el identificador dado
	 * @param id identificador del Catalogo
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarCatalogo(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
