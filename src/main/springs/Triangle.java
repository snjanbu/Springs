package main.springs;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

class Triangle implements DisposableBean,InitializingBean{
	
	String type;
	
	String degree;
	
	public Triangle(String type,String degree) {
		this.type=type;
		this.degree=degree;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDegree() {
		return degree;
	}

	public void draw() {
		System.out.println(getType() +"Triangle Drawn of degree "+getDegree());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing Bean By Interface");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying Bean By Interface");
	}
	
	public void myInit() {
		System.out.println("Initializing Bean By My Implementation");
	}
	
	public void myDestroy() {
		System.out.println("Destroying Bean By My Implementation");
	}
}
