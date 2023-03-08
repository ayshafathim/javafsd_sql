/**
 * 
 */
package bank;

/**
 * @author Administrator
 *
 */
public abstract class Account {
/**
	 * @return the accountnumber
	 */
	public int getAccountnumber() {
		return accountnumber;
	}

	/**
	 * @return the customerobj
	 */
	public Customer getCustomerobj() {
		return customerobj;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param accountnumber the accountnumber to set
	 */
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	/**
	 * @param customerobj the customerobj to set
	 */
	public void setCustomerobj(Customer customerobj) {
		this.customerobj = customerobj;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

protected int accountnumber;
protected Customer customerobj;
protected double balance;
public Account(int accountnumber, Customer customerobj, double balance) {
	super();
	this.accountnumber = accountnumber;
	this.customerobj = customerobj;
	this.balance = balance;
	
}

public abstract boolean withdraw(double amount);
}
