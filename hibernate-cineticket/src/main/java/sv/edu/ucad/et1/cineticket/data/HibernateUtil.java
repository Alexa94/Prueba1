package sv.edu.ucad.et1.cineticket.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import sv.edu.ucad.et1.cineticket.data.entities.Usuarios;

public class HibernateUtil {
private static final SessionFactory sessionFactory = buildSessionFactory();

private static SessionFactory buildSessionFactory(){
	try {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Usuarios.class);
		//return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
		return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
	}catch(Exception e){
		e.printStackTrace();
		throw new RuntimeException("Ocurrio un error en la Sesion Factory");
	}
  }//fin Build Session Factory 
public static SessionFactory getSessionFactory(){
	return sessionFactory;
}
}//fin hibernateUtil