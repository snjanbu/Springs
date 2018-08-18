package main.springs;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;//Generic 

@Component
public class Car implements Vehicle {

	private Wheel wheel;
	
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

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
		System.out.println(this.messageSource.getMessage("Drive.car", null,"Default Value",null));
		System.out.println(this.messageSource.getMessage("Parameter.passing", new Object[] {wheel},"DefaultValue",null));
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
