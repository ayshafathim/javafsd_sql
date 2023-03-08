package hashmap1;
import java.util.HashMap;

public class HashmapExample {

	public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap<>();
	map.put("Aysha",23);
	map.put("Fathima",24);
	map.put("Ani",25);
	map.put("Isha",23);
	
	//int age=map.get("Aysha");
	//System.out.println("Age of Aysha is :"+age);
	
	boolean ContainsA=map.containsKey("Aysha");
	System.out.println("Hashmap contains Aysha :"+ ContainsA);
	
	//map.remove("Ani");
	//System.out.println("Ani is removed");
	
	for(String name:map.keySet()) {
		int value=map.get(name);
		System.out.println(name + " is " + value +" years old");
	}
	}

}
