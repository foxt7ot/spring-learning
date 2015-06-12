package org.retailchemy.java.builder;

/**
 * @author Ritesh Kumar
 *4:33:14 PM
 */
public abstract class Burger implements IItem {

	/* (non-Javadoc)
	 * @see org.retailchemy.java.builder.IItem#itemPacking()
	 */
	@Override
	public IPacking itemPacking() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

}
