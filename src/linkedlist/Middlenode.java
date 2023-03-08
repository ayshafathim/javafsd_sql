package linkedlist;

import java.util.*;

public class Middlenode {

	public static void main(String[] args) {
		LinkedList <Integer> list=new LinkedList <Integer>();
list.add(2);
list.addFirst(5);
list.addLast(8);
list.addLast(6);
list.addLast(3);
list.addLast(1);
System.out.println(" "+list);
int middle=list.get(list.size()/2);
System.out.println("MIDDLE ELEMENT OF THE LIST IS :"+middle);
	}

}
