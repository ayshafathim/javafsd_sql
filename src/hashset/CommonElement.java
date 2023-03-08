package hashset;

import java.util.*;


public class CommonElement {

	static Set<Integer> set = new HashSet<Integer>();

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 9, 16, 25, 36 };
    int[] arr2 = { 36, 5, 16, 3, 4, 1 };
    for(int i=0;i<arr1.length;i++)
    {
    	System.out.print(" "+arr1[i]);
    }
    System.out.println(" ");
    
    for(int i=0;i<arr2.length;i++)
    {
    	System.out.print(" "+arr2[i]);
    }
    System.out.println(" ");	
		Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<arr1.length;i++) 
        {
        	set1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++) 
        {
        	set2.add(arr2[i]);
        }
        
        set1.retainAll(set2);
        System.out.println("Common elements :  " + set1);
       

	}

}
