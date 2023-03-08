package functionInterface1;
import java.util.*;
import java.util.Scanner;
public class Newwords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the article :");
		String s=sc.nextLine();
	//String s="hello Hello HEllo hi hi: hi! Welcome, Welcome";
String a=s.replaceAll("[!@#$%^&*()/0-9,.?:;]","");
System.out.println(a);


String[] r=a.split(" ");
List<String> f=Arrays.asList(r);
System.out.println(f);
int w=f.size();
List<String> e=f.stream().map(t->t.toLowerCase()).distinct().sorted().toList();
System.out.println(e);

e.forEach(t->System.out.println(t));
int q=e.size();

System.out.println("Number of words :"+w);


System.out.println("No of unique words :"+q);
System.out.println("unique words are :");
e.forEach(t->System.out.println(t));
}
}
