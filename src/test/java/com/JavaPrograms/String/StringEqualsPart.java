package com.JavaPrograms.String;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class StringEqualsPart {

	public static void main(String[] args) {
		
		String s = "aaaabbbbcccc";
		
		int StringLength = s.length();
		
		int  n = 3; int temp = 0;
		int equalparts = StringLength/n;		
		
		String [] parts = new String [n];
		
		if (StringLength%n != 0 ) {
			System.out.println("String can not be divided into equal parts");
		}
		
		else {
			
			for ( int i = 0 ; i < StringLength ; i = i + equalparts) {
				
				String part = s.substring(i, i +equalparts);
				parts[temp] = part;
				temp++;
			}
		}
		
		for ( String s1 : parts) {
			System.out.println(s1);
		}

	}

}
