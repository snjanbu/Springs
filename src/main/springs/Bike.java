package main.springs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bike implements Vehicle{
	
	private Wheel wheel;
	
	public Wheel getWheel() {
		return wheel;
	}

	@Autowired
	@Qualifier("BikeSearch")
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void drive() {
		System.out.println(wheel);
	}
}
