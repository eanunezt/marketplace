package marketplace.modelo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import marketplace.modelo.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  @generated
  *  @author eanunezt
  */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="Catalogo")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Catalogo.obtenerTodos", query="select e from Catalogo e")
})
public class Catalogo {

	@Id
    //@Column(name = "Catalogo_id")
    @GeneratedValue(generator = "CatalogoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CatalogoGen", sequenceName = "Catalogo_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombre")
    private String nombre;
    
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Proveedor proveedor;
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
	
	/**
	* @generated
	*/
	public Proveedor getProveedor() {
	    return this.proveedor;
	}
	
	/**
	* @generated
	*/
	public void setProveedor(Proveedor proveedor) {
	    this.proveedor = proveedor;
	}
	
}
