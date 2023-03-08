package functionInterface1;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequencynames {
	String names;
	public Frequencynames(String names) {
		this.names = names;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}



	public static void main(String[] args) {
	
	List<String> n=Arrays.asList("Aysha","Meera","Aysha","Anuja");
	Map<String,Long>dupe=n.stream().map(t->t.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(dupe);
	

	}

}
