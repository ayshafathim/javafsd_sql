package collections;
import java.util.*;
public class Pascaltriangle {
	
	public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the no of rows: ");
		n=s.nextInt();
		
		Pascaltriangle p=new Pascaltriangle();
		for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
 
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
 
                System.out.print( " " + p.factorial(i)/ (p.factorial(i - j)
                             * p.factorial(j)));
            }
 
            System.out.println();
        }
    }
		
		
	

	}

