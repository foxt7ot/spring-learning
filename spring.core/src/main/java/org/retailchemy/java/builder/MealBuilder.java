/**
 * 
 */
package org.retailchemy.java.builder;

/**
 * @author Ritesh Kumar 4:56:14 PM
 */
public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new NonVegBurger());
		meal.addItem(new Coke());
		return meal;
	}

}
