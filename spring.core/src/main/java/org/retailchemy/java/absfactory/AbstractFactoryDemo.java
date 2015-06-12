/**
 * 
 */
package org.retailchemy.java.absfactory;

/**
 * @author Ritesh Kumar 4:02:46 AM
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		shapeFactory.getShape("TRIANGLE").draw();
		shapeFactory.getShape("CIRCLE").draw();

		colorFactory.getColor("GREEN").fillColor();
		colorFactory.getColor("BLUE").fillColor();
	}

}
