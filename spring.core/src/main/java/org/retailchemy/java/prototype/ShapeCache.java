/**
 * 
 */
package org.retailchemy.java.prototype;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Ritesh Kumar 6:01:31 PM
 */
public class ShapeCache {

	private static ConcurrentHashMap<String, Shape> shapeMap = new ConcurrentHashMap<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return cachedShape;
	}

	// for each shape run database query and create shape
	// shapeMap.put(shapeKey, shape);
	// for example, we are adding three shapes

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);

		Square square = new Square();
		square.setId("3");
		shapeMap.put(square.getId(), square);
	}
}
