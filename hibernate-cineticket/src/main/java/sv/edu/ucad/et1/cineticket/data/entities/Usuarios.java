package sv.edu.ucad.et1.cineticket.data.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Transient;

@Entity
@Table(name="usuarios")
@Access(value=AccessType.PROPERTY)

public class Usuarios {
	
	private Long codusu;
	private String apeusu;
	private String nomusu;
	private String celusu;
	private String dirusu;
	private String maiusu;
	private Date fechusunac;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codusu", updatable=false)
	public Long getCodusu() {
		return codusu;
	}
	public void setCodusu(Long codusu) {
		this.codusu = codusu;
	}
	
	@Column(name="apeusu", nullable=false)
public String getApeusu() {
	return apeusu;
}
	public void setApeusu(String apeusu) {
		this.apeusu = apeusu;
	}
	
	@Column(name="nomusu")
public String getNomusu() {
		return nomusu;
		}
	public void setNomusu(String nomusu) {
		this.nomusu = nomusu;
	}
	
	@Column(name="celusu")
public String getCelusu() {
		return celusu;
	}
	public void setCelusu(String celusu) {
		this.celusu = celusu;
	}
	
	@Column(name="dirusu")
	public String getDirusu() {
		return dirusu;
	}
	public void setDirusu(String dirusu) {
		this.dirusu = dirusu;
	}
	
	@Column(name="maiusu")
public String getMaiusu() {
		return maiusu;
	}
	public void setMaiusu(String maiusu) {
		this.maiusu = maiusu;
	}
	
	@Column(name="fechusunac")
public Date getFechusunac() {
		return fechusunac;
}
	public void setFechusunac(Date fechusunac) {
		this.fechusunac = fechusunac;

	}
	//Propiedad bandera que se declara como la anotacion @Transient
		private boolean estado;
		@Transient
		public boolean isEstado() {
			return estado;	
			}
		public void setEstado(boolean estado) {
				this.estado = estado;
			}
			//Fin de propiedad declarada
}


