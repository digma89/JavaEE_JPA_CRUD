package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entity.employee;

public class EmployeeUpdate {
	public static void main( String[ ] args ) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Lab_10" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
		System.out.println("Before Update");
		employee employee = entitymanager.find( employee.class, 400 );
		System.out.println( employee.getSalary() );		
		employee.setSalary( 68000 );
		entitymanager.getTransaction( ).commit( );
		System.out.println("After Update");
		System.out.println(employee.getSalary() );
		
		entitymanager.close();
		emfactory.close();
	}
}
