package com.JavaPrograms.legagyProgram;

public class NumberSwap {

	public static void main(String[] args) {
	int a = 1;
	int b = 7;
/*	int temp;
	
	temp = a;
	a = b;
	b = temp;
	System.out.println(a);
	System.out.println(b);*/
	
	a = a + b;
	b = a- b;
	a = a-b;
	System.out.println(a);
	System.out.println(b);

	}

}
