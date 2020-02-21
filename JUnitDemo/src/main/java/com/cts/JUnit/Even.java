package com.cts.JUnit;

public class Even {
	public int even(int a) {
		if(a%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		return a;
		
	}
	public static void main(String args[]) {
		Even e=new Even();
		int check=e.even(11);
		System.out.println("check="+check);
	}

}
