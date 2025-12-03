package activities;

import java.util.ArrayList;

public class Activity9 {
	
	public static void main(String[] args) {
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("Test instacart story");
		myList.add("Update confluence page for automation count");
		myList.add("Automation story");
		myList.add("Complete homework tasks");
		myList.add("Shopping");
		for(String listItem:myList)
			System.out.println(listItem);
		System.out.println("Third element: "+myList.get(2));
		System.out.println(myList.contains("Grocery"));
		System.out.println("Size: "+myList.size());
		myList.remove(2);
		System.out.println("Size: "+myList.size());
	}

}
