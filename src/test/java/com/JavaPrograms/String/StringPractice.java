package com.JavaPrograms.String;

import java.util.Arrays;

public class StringPractice {

    public static void main(String args []){

        String str = "kayak";
        String rev = "";
        char charaary [] = str.toCharArray();

        for ( int i = (charaary.length-1) ; i >= 0 ; i --) {
            rev = rev + charaary[i];
        }

        if ( str.equalsIgnoreCase(rev)) {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");

        }

    }
}
