package main.dependencyInjection;

public class Drawing implements Shape{
	
	Shape shape;
	
	public void setShape(Shape shape) {
		this.shape=shape;
	}
	
	@Override
	public void draw() {
		this.shape.draw();
	}

}
