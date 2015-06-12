package org.retailchemy.java.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	protected void draw() {
		System.out.println("Inside Rectangle draw() .....>>>>>>");
	}

}
