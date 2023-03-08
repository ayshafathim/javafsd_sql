package kgfbmaintanance;

import java.util.Scanner;

//import javax.management.loading.PrivateClassLoader;
public class UserInterface {


public static void main(String[] args) {
	
	int choice;
     String accountno;
	String customername;
	float noOfYears;
	double balance;

Scanner in =new Scanner(System.in);
System.out.println("1.Savings Account \t 2.Current Account\n");
choice=in.nextInt();
System.out.println("Enter the account number :");
accountno=in.next();
System.out.println("Enter the Customer name :");
customername=in.next();
System.out.println("Enter the number of years :");
noOfYears=in.nextFloat();
System.out.println("Enter the balance");
balance = in.nextDouble();

//Account a =new Account(accountno,customername,balance);
Currentaccount c=new Currentaccount(accountno,customername,balance);

Savings s=new Savings(accountno,customername,balance);

if(choice==1) {
	System.out.println(s.calculateMaintanceCharge(noOfYears));
}
else if(choice==2)
	System.out.println(c.calculateMaintanceCharge(noOfYears));
	else
		System.out.println("invalid");
		
}

}


