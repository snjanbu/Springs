package main.springs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {
	
	public static void main(String args[]) {
		
//		Triangle triangle=new Triangle();
//		BeanFactory xmlBeanFactory=new XmlBeanFactory(new FileSystemResource("ApplicationContext.xml"));
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		applicationContext.registerShutdownHook();
		
		Shape triangle=(Shape)applicationContext.getBean("triangle");
		triangle.draw();
		
		Shape rectangle=(Shape)applicationContext.getBean("rectangle");
		rectangle.draw();
		
		Shape circle=(Shape)applicationContext.getBean("circle");
		circle.draw();
		
		Shape line=(Shape)applicationContext.getBean("line");
		line.draw();
		
		EmployeeInfo employeeInfo=(EmployeeInfo)applicationContext.getBean("employeeInfo");
		employeeInfo.show();
		
		AbstractApplicationContext autowireContext=new ClassPathXmlApplicationContext("AutowireContext.xml");
		autowireContext.registerShutdownHook();
		
		Shape autoRectangle=(Shape)autowireContext.getBean("rectangle");
		autoRectangle.draw();
		
	}

}
