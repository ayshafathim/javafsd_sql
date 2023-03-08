package palindrome;
import java.util.*;
public class Stringpalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=s.next();
		String rev="";
		for(int f=str.length()-1;f>=0;f--) {
			rev=rev+str.charAt(f);
		}
		if(rev.equals(str)) {
			System.out.println("the number is a palindrome");
		}
		else
		{
			System.out.println("the number is not a palindrome");
		}

	}

}
