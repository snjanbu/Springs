package main.springs;

public class Circle implements Shape{
	
	private Point centrePoint;
	
	private double radius;

	public Point getCentrePoint() {
		return centrePoint;
	}

	public void setCentrePoint(Point centrePoint) {
		this.centrePoint = centrePoint;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("Circle drawn at "+this.getCentrePoint()+" with radius "+this.getRadius());
	}

}
