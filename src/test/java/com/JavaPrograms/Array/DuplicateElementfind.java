package com.JavaPrograms.Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementfind {

	public static void main(String[] args) {
		
		//Initialize array  
        int [] arr = {2,1, 2, 3, 4, 2, 7, 8, 8, 3};  
     
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited && count > 1)  
             System.out.println("duplicate element is " + arr[i]);
        }  
  
       


	}

}
