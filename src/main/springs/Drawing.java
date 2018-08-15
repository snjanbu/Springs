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
		Triangle triangle=(Triangle)applicationContext.getBean("triangle");
		triangle.draw();
		
		Rectangle rectangle=(Rectangle)applicationContext.getBean("rectangle");
		rectangle.draw();
		
		Circle circle=(Circle)applicationContext.getBean("circle");
		circle.draw();
		
		Line line=(Line)applicationContext.getBean("line");
		line.draw();
		
		EmployeeInfo employeeInfo=(EmployeeInfo)applicationContext.getBean("employeeInfo");
		employeeInfo.show();
		
		AbstractApplicationContext autowireContext=new ClassPathXmlApplicationContext("AutowireContext.xml");
		autowireContext.registerShutdownHook();
		Rectangle autoRectangle=(Rectangle)autowireContext.getBean("rectangle");
		autoRectangle.draw();
		
	}

}
