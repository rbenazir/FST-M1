package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs=new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		hs.add("f");
		System.out.println("Hash set size: "+hs.size());
		hs.remove("f");
		hs.remove("g");
		System.out.println("check if k is present "+hs.contains("k"));
		for(String entry:hs)
			System.out.println(entry);

	}

}
