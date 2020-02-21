package com.cts.JUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.cts.JUnit.Even;


	/**
	 * Unit test for simple even.
	 */
	public class EvenDemo {
	
		private Even e=new Even();
	    /**
	     * Rigorous Test :-)
	     */
	    @Test
	    public void testEven() {
	    	int result=e.even(10);
	    	assertEquals(result,10);
	    	assertEquals(result,15);
	    }

}
