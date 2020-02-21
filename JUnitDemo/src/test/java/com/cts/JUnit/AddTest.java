package com.cts.JUnit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cts.JUnit.Add;


/**
 * Unit test for simple App.
 */
public class AddTest 
{
	private Add a=new Add();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd()
    {
    	int result=a.add(10, 20);
        assertEquals( result,30);
    }
}
