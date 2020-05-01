package com.JavaPrograms.legagyProgram;

public class FactorialProgram {
	
	static int number = 5;
	static int fact = 1;
	
	public static void main(String[] args) {
		
		for ( int i = number; i > 0 ; i --) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
