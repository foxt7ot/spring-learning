/**
 * 
 */
package org.retailchemy.java.builder;

/**
 * @author Ritesh Kumar 4:35:54 PM
 */
public abstract class ColdDrink implements IItem {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.retailchemy.java.builder.IItem#itemPacking()
	 */
	@Override
	public IPacking itemPacking() {
		// TODO Auto-generated method stub
		return new Bottle();
	}
}
