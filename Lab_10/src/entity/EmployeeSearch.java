package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entity.employee;

public class EmployeeSearch {

	public static void main( String[ ] args ) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Lab_10" );
		EntityManager entitymanager = emfactory.createEntityManager();
		employee employee = entitymanager.find( employee.class, 400 );
	
	
		System.out.println("Employee NO = " + employee.getEno( ));
		System.out.println("Employee NAME = " + employee.getEname());
	}
}