package com.JavaPrograms.legagyProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 3;
		int flag = 0;
		
		if ( number == 0 || number == 1) {
			System.out.println("number is not prime");
		}
		
		else {
			
			for (int i = 2 ; i <= number/2 ; i ++) {
				if ( number % i == 0) {
					System.out.println("number is not prime");
					flag = 1;
				}
			}
			
			if ( flag == 0 ) {
				System.out.println("number is prime");
			}
		}
		
		

	}

}
