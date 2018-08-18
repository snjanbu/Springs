package main.springs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Controller;//Controller Object
import org.springframework.stereotype.Repository;//DAO Object
import org.springframework.stereotype.Service;//Service Object

@Controller
public class Bike implements Vehicle,ApplicationEventPublisherAware{
	
	private Wheel wheel;
	
	private ApplicationEventPublisher applicationEventPublisher;
	
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
		MyEvent myEvent =new MyEvent(this);
		applicationEventPublisher.publishEvent(myEvent);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher=applicationEventPublisher;
	}
}
