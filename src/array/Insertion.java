package array;

public class Insertion {

	  
	    void insertion(int a[]) /* function to sort an aay with insertion sort */  
	{  
	    int i, j, temp;  
	    int n = a.length;  
	    for (i = 1; i < n; i++) {  
	        temp = a[i];  
	        j = i - 1;  
	  
	        while(j>=0 && temp <= a[j])  /* Move the elements greater than temp to one position ahead from their current position*/  
	        {    
	            a[j+1] = a[j];     
	            j = j-1;    
	        }    
	        a[j+1] = temp;    
	    }  
	}  
	void printArr(int a[]) /* function to print the array */  
	{  
	    int i;  
	    int n = a.length;  
	    for (i = 0; i < n; i++)  
	    System.out.print(a[i] + " ");  
	}  
	  
	    public static void main(String[] args) {  
	    int a[] = {12,25,31,8,32,17 };  
	    Insertion i1 = new Insertion();  
	    System.out.println("\nBefore sorting array elements are - ");  
	    i1.printArr(a);  
	    i1.insertion(a);  
	    System.out.println("\n\nAfter sorting array elements are - ");  
	    i1.printArr(a);  
	    System.out.println();  
	    }  
	}
