package com.JavaPrograms.RahulShetty;

public class ArraySumOfElements {
    public static void main(String[] args) {
        int[] ar = {4, 5, 8, 9};
        System.out.println(ArraySumOfElements.sumOfArrayElements(ar));

    }

    public static int sumOfArrayElements(int[] ar) {
        int sum = 0;
        for (int i : ar) {
            sum = sum + i;
        }
        return sum;
    }
}
