package com.JavaPrograms.Array;

import java.util.Arrays;

public class ArrayFrequency1 {

	public static void main(String[] args) {
		
		int arr [] = { 21,3,4,5,2,8,6 };
		int arr1 [] = new int [arr.length];
		int temp = 0;
		
		for ( int i = 0 ; i < arr.length ; i ++) {
			
			for ( int j = i + 1 ; j < arr.length ; j ++) {
				
				if ( arr[i ] > arr [j]) {
					temp = arr [i ] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
			}
			
		}
			
			for ( int u : arr) {
				System.out.print(u + " ");
			}
			
		
	}

}
