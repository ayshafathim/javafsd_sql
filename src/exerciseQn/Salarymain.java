package exerciseQn;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Salarymain {

	public static void main(String[] args) {
		Money m1=new Money("123", "Alisha", 200000);
		Money m2=new Money("113", "Isha", 2000);
		Money m3=new Money("103", "Kitty", 70000);
		Money m4=new Money("132", "Meera", 20000);
		Money m5=new Money("131", "Finla", 3000);
		Money m6=new Money("102", "Anuja", 80000);
		List<Money> list=Arrays.asList(m1,m2,m3,m4,m5,m5,m6);
		List<Money> lis = list.stream().sorted(Comparator.comparing(Money::getSalary).reversed())
				.peek(k->{
				if((k.getSalary()>=50000)&&(k.getSalary()<100000))
					k.setSalary(k.getSalary()+(0.1)*k.getSalary());
				else if(k.getSalary()>=100000)
					k.setSalary(k.getSalary()+(0.05)*k.getSalary());}
			      ).toList();
				
		
					 
		System.out.println(lis);
		
	}

}

