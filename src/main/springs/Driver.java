package main.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ConfigContext.xml");

		Vehicle bike=(Vehicle)context.getBean("bike");
		bike.drive();

		Vehicle car=(Vehicle)context.getBean("car");
		car.drive();
	}

}
