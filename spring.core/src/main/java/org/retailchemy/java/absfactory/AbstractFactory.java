/**
 * 
 */
package org.retailchemy.java.absfactory;

/**
 * @author Ritesh Kumar 3:39:48 AM
 */
public abstract class AbstractFactory {
	public abstract IShape getShape(String shapeType);

	public abstract IColor getColor(String colorName);
}
