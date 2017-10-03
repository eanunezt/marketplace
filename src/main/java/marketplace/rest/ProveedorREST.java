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
@Path("/proveedor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProveedorREST {
	@EJB
    private ProveedorServicio servicio;

	
	/**
	* retorna una lista con los Proveedor que se encuentran en la base de datos
	* @return retorna una lista de Proveedor
	* @generated
	*/
	@GET
	public List<Proveedor> obtenerTodosProveedors(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Proveedor
	* @return Proveedor del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Proveedor obtenerProveedor(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Proveedor
	 * @param entity Proveedor a guardar
	 * @return Proveedor con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Proveedor guardarProveedor(Proveedor entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Proveedor con el identificador dado
	 * @param id identificador del Proveedor
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarProveedor(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
