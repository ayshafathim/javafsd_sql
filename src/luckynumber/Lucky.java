package luckynumber;
import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
	/*	int[] arr=new int[4];
		int length=arr.length;
		//int flag=0;
		System.out.println("enter the number");
		for(int i=0;i<length;i++) 
		 arr[i]=s.nextInt();	
		
	
	
	for(int i=0;i<length;i++) {
		if(arr[i]==3|arr[i]==6|arr[i]==9) 
			System.out.println("the number is a lucky number");
			//flag++;
		
		//if(flag==4) {
			//System.out.println("the number is a lucky number");
	
	
	else
			System.out.println("the number is not a lucky number");
		
	}}}*/
		System.out.println("enter the number");
		int num=s.nextInt();
		int f=0,r;
		while(num>0) {
			r=num%10;
			if(r==3|r==6|r==9) {
				f+=1;
			}
		num=num/10;	
		}
		if(f==4)
			System.out.println("the number is a lucky number");
		else
		{
			System.out.println("the number is not a lucky number");	
		}
		s.close();
	}}
	

