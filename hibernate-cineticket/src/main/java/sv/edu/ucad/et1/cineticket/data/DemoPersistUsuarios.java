package sv.edu.ucad.et1.cineticket.data;

import java.util.Date;
import org.hibernate.Session;
import sv.edu.ucad.et1.cineticket.data.entities.Usuarios;

public class DemoPersistUsuarios {

	public static void main(String[] args) {
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		sesion.getTransaction().begin();
	

	// instancia de la clase Entidad Usuarios
	Usuarios usuarios = new Usuarios();
	
	// uso de los metodos para asignar valores a las propiedades
	
	 usuarios.setApeusu("Huezo");
	 usuarios.setNomusu("Daniela");
	 usuarios.setCelusu("6150327"); 
	 usuarios.setDirusu("Cuscatlan");
	 usuarios.setMaiusu("dany2005@yahoo.com"); 
	 usuarios.setFechusunac((new Date()));
	 
	 //metodo de persistencia para guardar la data
	 sesion.save(usuarios);
	 
	 //metodo para confirmar la transaccion
	 sesion.getTransaction().commit();
	 
	 //Propiedad para probar la propiedad updatable=false class20
	 sesion.beginTransaction();
	 Usuarios usuUpdatable = (Usuarios) sesion.get(Usuarios.class, usuarios.getCodusu());
	 usuUpdatable.setNomusu("Rodrigo Jose");
	 sesion.update(usuUpdatable);
	 sesion.getTransaction().commit();
	 //Fin de codigo de prueba de updatable=false class20
	 
	 //cierre la sesion activa
	 sesion.close();
	 
}//fin del metodo main
}//fin del metodo demopersistUsuarios
