package net.javaguides.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "Address")
	private String Address;
	
	@Column(name = "Phone_No")
	private String Phone_No;
	
	@Column(name = "Salary")
	private String Salary;
	
	public Employee() {
		
	}
	
	public Employee(long Id,String Name ,String Address, String Phone_No, String Salary) {
		super();
		this.Name = Name;
		this.Id = Id;
		this.Address = Address;
		this.Phone_No = Phone_No;
		this.Salary = Salary;
	}
	
	public long getId() {
		return Id;
	}
	public void setId(long Id) {
		this.Id = Id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}

	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(String Phone_No) {
		this.Phone_No = Phone_No;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String Salary) {
		this.Salary = Salary;
	}
}
