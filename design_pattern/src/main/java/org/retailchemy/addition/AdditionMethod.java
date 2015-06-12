package org.retailchemy.addition;

import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author Ritesh Kumar
 *3:47:47 PM
 */
@Configurable
public class AdditionMethod {

	public int add2Nos(int a, int b){
		return a+b;
	}
}
