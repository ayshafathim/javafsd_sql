package functioninterface;
import java.util.function.Predicate;
import java.util.*;
public class PredicateDemo {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(23,64,90,57);
		s.stream().filter(t->t%2==0).forEach(t->System.out.println("Print even numbers"+t));

	}

}
