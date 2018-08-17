package main.springs;

import java.util.List;

public class Car implements Vehicle {

	private Wheel wheel;

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(wheel);
	}

}
