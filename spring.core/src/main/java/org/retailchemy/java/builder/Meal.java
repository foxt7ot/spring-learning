/**
 * 
 */
package org.retailchemy.java.builder;

import java.util.ArrayList;

/**
 * @author Ritesh Kumar 4:25:50 PM
 */
public class Meal {

	ArrayList<IItem> items = new ArrayList<IItem>();

	public void addItem(IItem argItem) {
		items.add(argItem);
	}

	public void showItems() {
		for (IItem item : items) {
			System.out.println("Item :  " + item.itemName());
			System.out.println("Item Price :  " + item.price());
			System.out
					.println("Item Packing : " + item.itemPacking().packing());
		}
	}

	public float getCost() {
		float totalCost = 0.0f;
		for (IItem item : items) {
			totalCost = totalCost + item.price();
		}
		return totalCost;
	}
}
