/**
 * 
 */
package org.retailchemy.java.absfactory;

/**
 * @author Ritesh Kumar 3:49:11 AM
 */
public class ColorFactory extends AbstractFactory {

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
		if (colorName == null) {
			return null;
		}

		if (colorName.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (colorName.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (colorName.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

}
