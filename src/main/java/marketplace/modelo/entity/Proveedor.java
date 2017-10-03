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
@Table(name="Proveedor")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Proveedor.obtenerTodos", query="select e from Proveedor e")
})
public class Proveedor {

	@Id
    //@Column(name = "Proveedor_id")
    @GeneratedValue(generator = "ProveedorGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ProveedorGen", sequenceName = "Proveedor_SEQ",allocationSize = 1)
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
    * -1--1-true 
    */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<Catalogo> catalogo;
    
    
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
    
	
	/*public List<Catalogo> getCatalogo(){
		if(catalogo!=null){
			catalogo=new ArrayList<Catalogo>(); 
		}
		return this.catalogo;
	}
	
	public void setCatalogo(List<Catalogo> catalogo){
		this.catalogo=catalogo;
	}*/
	
}
