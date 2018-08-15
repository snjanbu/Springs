package main.dependencyInjection;

class Triangle implements Shape{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

public class ShapingObjects {
	
	public static void main(String args[]) {
		Drawing drawing = new Drawing();
		
		Triangle triangle=new Triangle();
		drawing.setShape(triangle);
		drawing.draw();
		
		Rectangle rectangle=new Rectangle();
		drawing.setShape(rectangle);
		drawing.draw();
		
	}
	
	
}
