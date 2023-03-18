package ExceptionHandling;

import java.util.Scanner;

public class ExceptionMain {

		public static void main(String[] args) throws InvalidPhoneNumberException {
		
	ExceptionEmp e1 = new ExceptionEmp (null,null,"puthen bunglow",01,"Aysha","Kottayam",23500);
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter the phone no:");
		e1.setPhoneno(sc.next());
		System.out.println("Enter the Email Id:");
		e1.setEmailid(sc.next());
			try {
				 if (!e1.getPhoneno().matches("\\d{10}$")) {
				        throw new InvalidPhoneNumberException("Invalid phone number: ");
			} 
				 
			}
			catch (InvalidPhoneNumberException e) {
			    System.err.println(e.getMessage());
			}
			try {
				if (!e1.getEmailid().matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
			        throw new InvalidEmailIdException("Invalid email ID: " );
			    }
			}
			catch(InvalidEmailIdException e) {
				System.err.println(e.getMessage());
			}
		}
		public static class InvalidPhoneNumberException extends Exception {
		    public InvalidPhoneNumberException(String message) {
		        super(message);
		    }
		}
		public static class InvalidEmailIdException extends Exception {
		    public InvalidEmailIdException(String message) {
		        super(message);
		    }
		}
	}
		
		


