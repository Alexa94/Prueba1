package sv.edu.ucad.et1.cineticket.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 @Table(name="Cargos")

public class Cargos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codcar")
private Long codcar;
	
	@Column(name="nomcar")
private String nomcar;
	
	@Column(name="descar")
private String descar;
	
	@Column(name="salcar")
private Double salcar;

}
