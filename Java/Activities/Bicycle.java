package activities;

public class Bicycle implements BicycleParts,BicycleOperations {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	int gears,currentSpeed;
	Bicycle(int gears,int currentSpeed){
		this.gears=4;
		this.currentSpeed=50;
	}

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed=currentSpeed-decrement;
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed=currentSpeed+increment;
		
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
	}
}
