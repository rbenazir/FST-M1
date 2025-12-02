package activities;

import java.util.Arrays;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane=new Plane(10);
		plane.onboard(Arrays.asList("Raihana","Rizwana"));
		plane.takeOff();
		System.out.println(plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		System.out.println(plane.getLastTimeLanded());
	}

}
