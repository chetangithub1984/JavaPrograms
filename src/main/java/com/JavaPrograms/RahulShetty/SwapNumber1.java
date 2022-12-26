package com.JavaPrograms.RahulShetty;

public class SwapNumber1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int temp = 0;
       /* temp = a;
        a = b ;
        b = temp;
        System.out.println(a);
        System.out.println(b);*/

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);

    }
}
