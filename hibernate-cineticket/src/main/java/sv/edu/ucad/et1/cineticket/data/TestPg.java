package sv.edu.ucad.et1.cineticket.data;

import org.hibernate.Session;

public class TestPg {
public static void main(String[] args){
	Session sesion = HibernateUtil.getSessionFactory().openSession();
	sesion.beginTransaction();
	sesion.close();
}
}