/**
 * 
 */
package org.retailchemy.java.prototype;

/**
 * @author Ritesh Kumar 5:41:31 PM
 */
public abstract class Shape implements Cloneable {
	private String id;
	protected String type;
	
	protected abstract void draw();

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() {
		Object clone = null;
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}

}
