
package com.JavaPrograms.Array;


public class ThirdLargestNumber {

	public static void main(String[] args) {
		
		int arr [] = { 2,4,5,23,56,89 };
		int  temp;
		
		for (int i = 0 ; i < arr.length ; i ++ ) {
			
			for ( int j = i + 1; j < arr.length ; j ++ ) {
				
				if ( arr [i] > arr [j]) {
					temp = arr [i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		System.out.println(arr.length);
		
		for (int rg : arr ) {
			System.out.print(rg + " ");
			
		}

	}

}
