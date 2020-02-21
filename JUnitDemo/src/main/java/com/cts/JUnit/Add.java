package com.cts.JUnit;

/**
 * Hello world!
 *
 */
public class Add 
{
	public int add(int a,int b) {
		return a+b;
	}
    public static void main( String[] args )
    {
    	Add a=new Add();
    	int sum = a.add(10, 20);
        System.out.println( "Sum is:"+sum );
    }
}
