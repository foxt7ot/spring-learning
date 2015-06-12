/**
 * 
 */
package org.retailchemy.java.factory;

/**
 * @author Ritesh Kumar 2:09:38 AM
 */
public class ShapeFactory {
	public IShape getShape(String shapeType) {
		
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		return null;
	}

}
