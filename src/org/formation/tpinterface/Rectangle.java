package org.formation.tpinterface;

public class Rectangle extends Surface {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		this.forme = "Rectangle";
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

}
