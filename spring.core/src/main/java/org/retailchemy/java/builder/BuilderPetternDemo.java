/**
 * 
 */
package org.retailchemy.java.builder;

/**
 * @author Ritesh Kumar 5:00:13 PM
 */
public class BuilderPetternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.err.println("Veg Meals :");
		vegMeal.showItems();
		System.out.println("Total Cost : " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.err.println("Non Veg Meal :");
		nonVegMeal.showItems();
		System.out.println("Total Cost Non Veg Meal: " + nonVegMeal.getCost());

	}

}
