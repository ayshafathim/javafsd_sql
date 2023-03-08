package functionInterface1;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class SquareList {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(3,4,9,5,7);	
List<Integer> squarenolist=s.stream().map(t->t*t).collect(Collectors.toList());
System.out.println(squarenolist);
	} 

}
