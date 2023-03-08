package kgfbmaintanance;

public class Account {
/**
	 * @return the accountno
	 */
	public String getAccountno() {
		return accountno;
	}
	/**
	 * @return the customername
	 */
	public String getCustomername() {
		return customername;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param accountno the accountno to set
	 */
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	/**
	 * @param customername the customername to set
	 */
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
private String accountno;
private String customername;
double balance;
public Account(String accountno, String customername, double balance) {
	super();
	this.accountno = accountno;
	this.customername = customername;
	this.balance = balance;
}

}
