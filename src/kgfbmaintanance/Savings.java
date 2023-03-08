package kgfbmaintanance;

public class Savings extends Account implements Maintenancecharge {

	public Savings(String accountno, String customername, double balance) {
		super(accountno, customername, balance);
		// TODO Auto-generated constructor stub
	}
	public float calculateMaintanceCharge(float NoOfYears) {
		int m=50;
		float n=NoOfYears;
		float charge;
		charge=(m*n)+50;
		return charge;
	}
}
