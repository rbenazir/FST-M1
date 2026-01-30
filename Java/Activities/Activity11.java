package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> colors=new HashMap<Integer,String>();
		colors.put(1,"black");
		colors.put(2, "white");
		colors.put(3,"yellow");
		colors.put(4, "orange");
		colors.put(5, "magenta");
		colors.remove(5);
		System.out.println("To check if green is present "+colors.containsValue("green"));
		System.out.println("Size of the map "+colors.size());
	}

}
