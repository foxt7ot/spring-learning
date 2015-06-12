package org.retailchemy.addition.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.retailchemy.addition.AdditionMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ritesh Kumar
 *4:00:55 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring.xml" })
public class AdditionTest {

	@Autowired
	public AdditionMethod additin;
	
	@Test
	public void testAddPositive()
	{
		int input1=10;
		int input2=25;
		int actualOutput= additin.add2Nos(input1,input2);
		int expectedOutPut= 35;
		Assert.assertEquals(actualOutput, expectedOutPut);
		
	}
	
	@Test
	public void testAddNegative()
	{
		int input1=10;
		int input2=25;
		int actualOutput= additin.add2Nos(input1,input2);
		int expectedOutPut= 5;
		Assert.assertNotSame(actualOutput, expectedOutPut);
		
	}
}
