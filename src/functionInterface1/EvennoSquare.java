package functionInterface1;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class EvennoSquare {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(3,4,9,5,7);	
		List<Integer> squarenolist=s.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
		System.out.println(squarenolist);

	}

}
