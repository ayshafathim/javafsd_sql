package hashmap1;

import java.util.HashMap;

public class HashmapExample1 {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Aysha",23);
		map.put("Fathima",24);
		map.put("Ani",25);
		map.put("Isha",23);
		
		int hashcode=map.hashCode();
		System.out.println("The Hashcode is :"+hashcode);

	}

}
