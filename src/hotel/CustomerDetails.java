package hotel;
import java.util.*;
import java.util.Arrays;
import java.util.List;


public class CustomerDetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
			Customer c1=new Customer(121, "Alisha","1234567890","alisha@gmail.com","Kottayam");
			Customer c2=new Customer(122, "lisha","1234567891","lisha@gmail.com","Thiruvalla");
			Customer c3=new Customer(123, "Anuja","1234567892","anuja@gmail.com","Ernakulam");
			Customer c4=new Customer(124, "lisa","1234567893","lisa@gmail.com","Thiruvalla");
			Customer c5=new Customer(125, "Meera","1234567894","meera@gmail.com","pathanamthitta");
			Customer c6=new Customer(126, "Finla","1234567895","finla@gmail.com","Thrissur");
			
			List<Customer> list=Arrays.asList(c1,c2,c3,c4,c5,c6);
			System.out.println("enter the customer id :");
			int n=s.nextInt();
			
			List<Customer> customlist=list.stream().peek(t->{
				if(n==t.getRegid()) {
					System.out.println(t);
				}
				
			}).toList();
			}

	}


