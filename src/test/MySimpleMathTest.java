package test;

import org.junit.Assert;
import org.junit.Test;

import testin.MySimpleMath;

public class MySimpleMathTest {
	@Test 
	public void testCheckSignPositive() {
		MySimpleMath sm = new MySimpleMath();
		Assert.assertEquals("positive", sm.checkSign(5));
		Assert.assertEquals("positive", sm.checkSign(0));
	}
	
	
	@Test 
	public void testDivisionNegativeQuotient() {
		MySimpleMath sm = new MySimpleMath();
		Assert.assertEquals(-2.0, sm.divide(10,-5),0);
	}

	
	@Test (expected=ArithmeticException.class)
	public void testArithmeticException() {
		MySimpleMath sm = new MySimpleMath();
		Assert.assertEquals(2.0, sm.divide(10,0),0);
	}

	
	
	

}
