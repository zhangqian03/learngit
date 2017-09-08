package com.test.mock;
import org.easymock.EasyMock;
import org.junit.Test;

import junit.framework.Assert;

public class MathApplicationTester {
	
	MathApplication mathApplication=new MathApplication();
	
	CalculatorService calcService;
	@Test(expected = RuntimeException.class)
	public void testAdd(){
		EasyMock.expect(calcService.add(10.0,20.0)).andThrow(new RuntimeException("Add operation not implemented"));	
		EasyMock.replay(calcService);		
		Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
		EasyMock.verify(calcService);
	}
	
}
