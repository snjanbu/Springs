package main.springs;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

public class MyEvent extends ApplicationEvent{

	public MyEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Drive Event Occured";
	}

}
