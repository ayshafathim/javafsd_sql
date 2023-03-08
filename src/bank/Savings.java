package bank;

public class Savings extends Account {
	/**
	 * @return the minimumbalance
	 */
	public double getMinimumbalance() {
		return minimumbalance;
	}

	/**
	 * @param minimumbalance the minimumbalance to set
	 */
	public void setMinimumbalance(double minimumbalance) {
		this.minimumbalance = minimumbalance;
	}

	private double minimumbalance;

	public Savings(int accountnumber, Customer customerobj, double balance,double minimumbalance) {
		super(accountnumber, customerobj, balance);
		this.minimumbalance = minimumbalance;
	}

	
	@Override
	public boolean withdraw(double amount) {
		if(balance>minimumbalance)
		{
			balance=balance-amount;
			return true;
		}
		return false;
	}

	 

}
