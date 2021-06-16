package Assignment_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Assignment {

	public static void main(String[] args) {
		LinkedList monthsOfTheYear = new LinkedList();
		
		monthsOfTheYear.addFirst("January");
		monthsOfTheYear.add("February");
		monthsOfTheYear.add("March");
		monthsOfTheYear.add("April");
		
		Iterator itr1 = monthsOfTheYear.iterator();
		
		while (itr1.hasNext()) {
			System.out.println("list is " + itr1.next());
		}
		
		System.out.println("size of the list is " + monthsOfTheYear.size());
		
		monthsOfTheYear.add("May");
		monthsOfTheYear.add("June");
		monthsOfTheYear.add("July");
		monthsOfTheYear.add("August");
		
		Iterator itr2 = monthsOfTheYear.iterator();
		
		while (itr2.hasNext()) {
			System.out.println("list is " + itr2.next());
		}
		
		System.out.println("size of the list is " + monthsOfTheYear.size());
		
		monthsOfTheYear.addLast("September");
		monthsOfTheYear.addLast("October");
		
		Iterator itr3 = monthsOfTheYear.iterator();
		
		while (itr3.hasNext()) {
			System.out.println("list is " + itr3.next());
		}
		
		System.out.println("size of the list is " + monthsOfTheYear.size());
		
		monthsOfTheYear.addLast("November");
		monthsOfTheYear.addLast("December"); // monthsOfTheYear.addLast("Dec");
		
		Iterator itr4 = monthsOfTheYear.iterator();
		
		while (itr4.hasNext()) {
			System.out.println("list is " + itr4.next());
		}
		
		System.out.println("size of the list is " + monthsOfTheYear.size());
	}

}
