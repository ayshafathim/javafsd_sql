package hashmap1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		int id,age;
		String name,Department;
		Scanner s=new Scanner(System.in);
		HashMap<Integer,EmployeData> map=new HashMap<>();
		
		EmployeData emp1=new EmployeData(121455,23,"Aysha","IT");
		EmployeData emp2=new EmployeData(122344,24,"Isha","Cyber");
		EmployeData emp3=new EmployeData(123345,22,"Zena","HR");
		EmployeData emp4=new EmployeData(124346,25,"Iman","Cloud");
		
		map.put(1,emp1);
		map.put(2,emp2);
		map.put(3,emp3);
		map.put(4,emp4);
		
		for(Integer k:map.keySet()) {
			EmployeData emp=map.get(k);
			System.out.println(emp.hashCode());
		}
	}
}
		
		/*  int hashcode1=emp1.hashCode();
		int hashcode2=emp2.hashCode();
		int hashcode3=emp3.hashCode();
		int hashcode4=emp4.hashCode();
		
		System.out.println(hashcode1);
		System.out.println(hashcode2);
		System.out.println(hashcode3);
		System.out.println(hashcode4);
	}

}*/
