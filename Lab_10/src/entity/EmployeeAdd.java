package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entity.employee;

public class EmployeeAdd {
	public static void main( String[ ] args ) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Lab_10" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		employee employee = new employee ( );
		employee.setEno( 400 );		
		employee.setEname( "Vishal Layka" );
		employee.setSalary(65000);
		entitymanager.persist( employee );
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( );
	}
}