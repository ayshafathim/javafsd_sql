package kgfbmaintanance;

public class Currentaccount extends Account implements Maintenancecharge {

	public Currentaccount(String accountno, String customername, double balance) {
		super(accountno, customername, balance);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public float calculateMaintanceCharge(float NoOfYears) {
		int m=100;
		float n=NoOfYears;
		float charge;
		charge=(m*n)+200;
		return charge;
	}

	
	
}
