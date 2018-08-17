package main.springs;

public class Wheel {
	
	private int noOfWheels;

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	@Override
	public String toString() {
		return "Driving "+noOfWheels+" vehicle";
	}

}
