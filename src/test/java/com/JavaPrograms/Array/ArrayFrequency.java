package com.JavaPrograms.Array;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {

	public static void main(String[] args) {

		int arr[] = {21, 3, 4, 5, 2, 8, 6,21,3};
		HashMap<Integer,Integer> map = new HashMap<>();

		for ( int number : arr) {

			if ( map.containsKey(number)) {
				map.put(number,map.get(number)+1 );
			}
			else {
				map.put(number,1);
			}
		}

		for(Map.Entry<Integer,Integer> map1 : map.entrySet()) {
			System.out.println(map1.getKey() + " " + map1.getValue());
		}
	}
}
