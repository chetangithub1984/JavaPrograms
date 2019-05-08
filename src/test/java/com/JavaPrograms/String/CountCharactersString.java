package com.JavaPrograms.String;

import java.util.Arrays;

public class CountCharactersString {

	public static void main(String[] args) {
    
		String s1 = "Chetan Patel";
		
		int count = 0 ;
		
		for ( int i = 0 ; i < s1.length() ; i ++) {
			
		char er = s1.charAt(i);
		
		if ( er  != ' ') {
			
			count ++;
			
		}
		}
		System.out.println(count);
		}
	

}
