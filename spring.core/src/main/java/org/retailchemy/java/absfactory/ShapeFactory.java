/**
 * 
 */
package org.retailchemy.java.absfactory;

/**
 * @author Ritesh Kumar 3:44:09 AM
 */
public class ShapeFactory extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.retailchemy.java.absfactory.AbstractFactory#getShape(java.lang.String
	 * )
	 */
	@Override
	public IShape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.retailchemy.java.absfactory.AbstractFactory#getColor(java.lang.String
	 * )
	 */
	@Override
	public IColor getColor(String colorName) {
		// TODO Auto-generated method stub
		return null;
	}

}
