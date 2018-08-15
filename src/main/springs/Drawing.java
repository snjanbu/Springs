package main.springs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {
	
	public static void main(String args[]) {
		
//		Triangle triangle=new Triangle();
//		BeanFactory xmlBeanFactory=new XmlBeanFactory(new FileSystemResource("ApplicationContext.xml"));
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Triangle triangle=(Triangle)applicationContext.getBean("triangle");
		triangle.draw();
		
		Rectangle rectangle=(Rectangle)applicationContext.getBean("rectangle");
		rectangle.draw();
		
		Circle circle=(Circle)applicationContext.getBean("circle");
		circle.draw();
		
		Line line=(Line)applicationContext.getBean("line");
		line.draw();
		
		ApplicationContext autowireContext=new ClassPathXmlApplicationContext("AutowireContext.xml");
		Rectangle autoRectangle=(Rectangle)autowireContext.getBean("rectangle");
		autoRectangle.draw();
		
	}

}
