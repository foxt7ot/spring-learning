/**
 * 
 */
package org.retailchemy.java.builder;

/**
 * @author Ritesh Kumar 4:41:01 PM
 */
public class VegBurger extends Burger {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.retailchemy.java.builder.IItem#itemName()
	 */
	@Override
	public String itemName() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.retailchemy.java.builder.IItem#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
