package array;
import java.util.Scanner;
public class CumulativeSum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
int size;
	
	System.out.println("enter the no of elements :");
	size=s.nextInt();
	
	
	int[] array=new int[size];
	int[] array2=new int[size];
	int sum=0;
	System.out.println("enter the elements of array :");
	for(int i=0;i<size;i++) {
		array[i]=s.nextInt();
	sum+=array[i];
	array2[i]=sum;
	}
	
	System.out.println(" the  array is :");
	for(int i=0;i<size;i++) {
		System.out.println(array2[i]+"\t");
	}
}


}
