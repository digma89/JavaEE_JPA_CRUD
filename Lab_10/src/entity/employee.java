package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	@Id
	private int eno;
	private int salary;
	private String ename;

	public employee() {
	}

	public employee(final int no, final int sal, final String name) {
		this.eno = no;
		this.salary = sal;
		this.ename = name;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEno() {
		return this.eno;
	}

	public void setEno(final int no) {
		this.eno = no;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(final int sal) {
		this.salary = sal;
	}
}
