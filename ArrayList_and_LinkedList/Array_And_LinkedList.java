package LinkedLists;

import java.util.*;

public class Array_And_LinkedList {
	public static void main(String[] args) {
		
//		-->Faster than LinkedList to search the number/character at perticular position
		ArrayList<String> list =new ArrayList<>();
		
		list.add("AH");
		list.add("SA");
		list.add("N.");
		
		
//		System.out.println(list);   -----> First way to print the characters/String in array format []
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i));
		
		System.out.println();
		
//		-->Faster than ArrayList to add the number/character at perticular position
		LinkedList<String> ll=new LinkedList<>();		
		
		ll.addFirst("AH");		
		ll.add("SA");
		ll.addLast("N.");
		
//		System.out.println(ll);      ----> First way to print the characters/String in array format []

		for(int i=0; i<ll.size();i++)
			System.out.print(ll.get(i));
		
		System.out.println();
	}
}
