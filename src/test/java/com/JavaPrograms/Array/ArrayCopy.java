package com.JavaPrograms.Array;

import java.util.Random;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int arr [] [] = new int [2][2];
		int arr1[] [] = new int [2] [2];
		
		
		Random rand = new Random();
		
		for ( int i = 0 ; i <arr.length ; i ++) {
			
			for ( int j = 0 ; j <arr[0].length ; j ++ ) {
				
				arr[i][j] = rand.nextInt(200);
			}
		}
		
		System.out.println("first arr is given below"); 
		
		for ( int row [] : arr ) {
			for (int col : row ) {
				System.out.print(col + "   ");
			}
			System.out.println();
		}
		
	for ( int i = 0 ; i <arr.length ; i ++) {
			
			for ( int j = 0 ; j <arr[0].length ; j ++ ) {
				
				arr1[i][j] = arr[i][j];
			}
		}
	
	System.out.println("second arr is given below"); 
	
	for ( int row [] : arr1 ) {
		for (int col : row ) {
			System.out.print(col + "   ");
		}
		System.out.println();
	}

	}

}
