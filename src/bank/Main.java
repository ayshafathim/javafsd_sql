package bank;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer (10,"Aysha Fathima","aysha@gmail.com");
Savings s=new Savings (100,customer,10000,500);
System.out.println(s.withdraw(500));
System.out.println(s.getBalance());
}
}