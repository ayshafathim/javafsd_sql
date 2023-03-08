package functionInterface1;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class City {

	public static void main(String[] args) {
		List<String> s=Arrays.asList("trivandrum","Kochi","Thrissur","Kottayam"	);
		List<String> city=s.stream().filter(t->t.toLowerCase().startsWith("t")).collect(Collectors.toList());
System.out.println(city);
	}

}
