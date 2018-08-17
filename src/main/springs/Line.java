package main.springs;

import java.util.List;

public class Line implements Shape{
	List <Point> pointList;

	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}
	
	public void draw() {
		System.out.println("Line drawn with the below points");
		for(Point point:pointList) {
			System.out.println(point);
		}
	}
}
