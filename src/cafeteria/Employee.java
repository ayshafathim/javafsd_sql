package cafeteria;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", uid=" + uid + "]";
	}
	public String getName() {
		return name;
	}
	public int getUid() {
		return uid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	String name;
	int uid;
	public Employee(String name, int uid) {
		super();
		this.name = name;
		this.uid = uid;
	}
	
	

}
