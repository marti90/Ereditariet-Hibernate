package main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.HibernateUtility;
import model.Docente;
import model.Persona;
import model.Studente;

public class EsempioMain {

	public static void main(String[] args) {
	
		Persona p= new Studente();
		p.setNome("Martina");
		p.setCognome("Debernardi");
		((Studente)p).setMedia(26);
		
		Studente s1 = new Studente("Marti","Debernardi",26.5);
		Docente d1 = new Docente("nomed","cognomed",1300);
		
		Session session=HibernateUtility.openSession();
		Transaction tx=null;
		
		try{
	        tx=session.getTransaction();
	        tx.begin();
	       
			//System.out.println(((Studente)p).getMedia());
	        session.persist(s1);
	        session.persist(d1);
	        session.persist(p);
	       
	        tx.commit(); 
            
	    }catch(Exception ex){
	         tx.rollback();

	    }finally{
	         session.close();
	    }
	}

}
