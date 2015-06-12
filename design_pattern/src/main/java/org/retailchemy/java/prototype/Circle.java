/**
 * 
 */
package org.retailchemy.java.prototype;

/**
 * @author Ritesh Kumar 5:55:12 PM
 */
public class Circle extends Shape {

	public Circle() {
		// TODO Auto-generated constructor stub
		type = "Circle";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.retailchemy.java.prototype.Shape#draw()
	 */
	@Override
	protected void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle draw() ... >>>>>");
	}

}
