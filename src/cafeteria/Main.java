package cafeteria;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);


Food f1=new Food(1,"veg meals",80);
Food f2=new Food(2,"Fish curry meals",120);
Food f3=new Food(3,"chappati veg curry",75);
Food f4=new Food(4,"chappati chicken curry",120);
Food f5=new Food(5,"fried rice",60);
Food f6=new Food(6,"chicken fried rice",150);

List<Food> list=Arrays.asList(f1,f2,f3,f4,f5,f6);

Employee e=new Employee(null,0);
System.out.println("Enter uid :");
e.setUid(s.nextInt());

System.out.println("Enter name :");
e.setName(s.next());

List<Employee> em=Arrays.asList(e);
em.forEach(t->System.out.println(t));
int ans,ch;
do {
	System.out.println("\n food details:\n");

list.forEach(t->System.out.println(t.getid()+"\t"+t.getFname()+"\t"+t.getFprice()+"\n"));
System.out.println("choose your choice :\n");
ch=s.nextInt();
System.out.println("\n do you want to change? 0 for yes 1 for no (0/1)");
ans=s.nextInt();
}while (ans==0);

int p=ch;
List<Food> lis=list.stream().filter(t->t.getid()==p).toList();
System.out.println("\n The details are :\n");

em.forEach(t->System.out.println("UID : "+t.getUid()+"\n"+"Name: "+t.getName()+"\n"));
lis.forEach(t->System.out.println("food name: "+t.getFname()+"\n"+"Food price :"+t.getFprice()));
	}
}

