package hashmap1;

import java.util.HashMap;


public class EmployeData {
	
	public int getId() {
		return id;
	}


	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	int id,age;
	String name,Department;
	
	
	public EmployeData(int id, int age, String name, String department) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		Department = department;
	}

	

}
