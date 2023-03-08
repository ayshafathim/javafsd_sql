package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add("Guva");
		list.add("Pineapple");
		list.add("Lemon");
		list.add("Green apple");
		list.add("Banana");
		list.add("Pomegranate");
		list.add("Grapes");
		//System.out.println(list);
		//Iterator itr=list.iterator();  
		//while(itr.hasNext()){  
		//System.out.println(itr.next());  
		
		for(String fruits:list)
		{
			
			System.out.println(fruits);
	}

}
}

