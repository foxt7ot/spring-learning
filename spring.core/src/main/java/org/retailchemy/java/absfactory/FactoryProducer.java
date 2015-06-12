/**
 * 
 */
package org.retailchemy.java.absfactory;

/**
 * @author Ritesh Kumar 3:57:43 AM
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice == null) {
			return null;
		}

		if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		} else if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		return null;
	}
}
