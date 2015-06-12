/**
 * 
 */
package org.retailchemy.java.factory;

/**
 * @author Ritesh Kumar 2:15:38 AM
 */
public class ShapeFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();

		shapeFactory.getShape("CIRCLE").draw();
		shapeFactory.getShape("RECTANGLE").draw();
		shapeFactory.getShape("TRIANGLE").draw();
		shapeFactory.getShape("SQUARE").draw();
	}

}
