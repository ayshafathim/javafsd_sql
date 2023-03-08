package cafeteria;

public class Food {
@Override
	public String toString() {
		return "Food [fname=" + fname + ", fprice=" + fprice + ",id=\" + id + \"]";
	}
public String getFname() {
		return fname;
	}
	public int getFprice() {
		return fprice;
	}
	public int getid() {
		return id;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setFprice(int fprice) {
		this.fprice = fprice;
	}
	public void setid(int id) {
		this.id = id;
	}
private String fname;
 private int fprice;
 private int id;
public Food(int id,String fname, int fprice) {
	super();
	this.id=id;
	this.fname = fname;
	this.fprice = fprice;
}

}
