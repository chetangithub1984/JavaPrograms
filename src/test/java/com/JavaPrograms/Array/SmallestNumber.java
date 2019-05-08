
package com.JavaPrograms.Array;


public class SmallestNumber {

	public static void main(String[] args) {
		
		int arr [] = { 2,4,5,23,56,89,1 };
		int  temp = arr[0];
		
		for (int i = 0 ; i < arr.length ; i ++ ) {
			
			for ( int j = i + 1; j < arr.length ; j ++ ) {
				
				if ( arr [i] > arr [j]) {
					temp = arr[j];
					
				}
			}
		}
		

			System.out.print(temp);
		

	}

}
