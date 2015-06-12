/**
 * 
 */
package org.retailchemy.java.builder;

/**
 * @author Ritesh Kumar 4:41:49 PM
 */
public class NonVegBurger extends Burger {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.retailchemy.java.builder.IItem#itemName()
	 */
	@Override
	public String itemName() {
		// TODO Auto-generated method stub
		return "Chicken Burger";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.retailchemy.java.builder.IItem#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 40.0f;
	}

}
