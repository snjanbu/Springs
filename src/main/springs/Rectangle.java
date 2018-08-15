package main.springs;

class Rectangle {
	
	Point pointOne;
	Point pointTwo;
	Point pointThree;
	Point pointFour;
	
	public Point getPointOne() {
		return pointOne;
	}
	public void setPointOne(Point pointOne) {
		this.pointOne = pointOne;
	}
	public Point getPointTwo() {
		return pointTwo;
	}
	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
	}
	public Point getPointThree() {
		return pointThree;
	}
	public void setPointThree(Point pointThree) {
		this.pointThree = pointThree;
	}
	public Point getPointFour() {
		return pointFour;
	}
	public void setPointFour(Point pointFour) {
		this.pointFour = pointFour;
	}
	
	public void draw() {
		System.out.println(this.getPointOne());
		System.out.println(this.getPointTwo());
		System.out.println(this.getPointThree());
		System.out.println(this.getPointFour());
	}
}
