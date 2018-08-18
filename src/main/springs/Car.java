package main.springs;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;//Generic 

@Component
public class Car implements Vehicle {

	private Wheel wheel;

	public Wheel getWheel() {
		return wheel;
	}

	@Resource(name="CarWheel")
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(wheel);
	}
	
	@PostConstruct
	public void myInitMethod() {
		System.out.println("Initialization Method");
	}
	
	@PreDestroy
	public void myDestroyMethod() {
		System.out.println("Destroy Method");
	}

}
