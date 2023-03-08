package collections;

import java.util.*;

public class Target {

	public static void main(String[] args) {
		int flag = 0;
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("enter the numbers :");
		
		for(int i=1;i<=5;i++) {
			int n=s.nextInt();
			list.add(n);
			
		}
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) 
			{
				if(list.get(i)+list.get(j)==25)
					flag=1;
			}
		}
if(flag==1)
{
	System.out.println("Target found");
} 
else
{
	System.out.println("invalid");
}
	
	}

}
