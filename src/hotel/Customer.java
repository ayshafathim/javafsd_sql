package hotel;

public class Customer {
	

	@Override
	public String toString() {
		return "Customer [regid=" + regid + ", name=" + name + ", phno=" + phno + ", emailid=" + emailid + ", location="
				+ location + "]";
	}
	int regid;
	String name;
	String phno;
	String emailid;
	String location;
	public Customer(int regid, String name, String phno, String emailid, String location) {
	
		this.regid = regid;
		this.name = name;
		this.phno = phno;
		this.emailid = emailid;
		this.location = location;
	}
	
	public int getRegid() {
		return regid;
	}
	public String getName() {
		return name;
	}
	public String getPhno() {
		return phno;
	}
	public String getEmailid() {
		return emailid;
	}
	public String getLocation() {
		return location;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
