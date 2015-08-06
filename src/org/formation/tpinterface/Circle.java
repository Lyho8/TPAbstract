package org.formation.tpinterface;

import javafx.scene.shape.Shape;

public class Circle extends Surface implements IFXDrawable, IPrintable {

	private double radius;
	private javafx.scene.shape.Circle sh;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
		sh = new javafx.scene.shape.Circle();
		sh.setRadius(radius);
		this.forme = "Cercle";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public void printMe(String t) {
		System.out.println(t + ". I am a circle. My radius is " + radius + " cm.");
		
	}

	@Override
	public Shape getShape() {
		return sh;
	}

}
