package com.JavaPrograms.RahulShetty;

public class ArraySort {
    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort();
        int arr[] = {2, 4, 5, 23, 56, 89, 1};
        int[] descArry = arraySort.descesdingArray(arr);
        System.out.println(" Descending array is ");
        for (int i : descArry) {
            System.out.print(i + " ");

        }
        System.out.println();
        int[] ascArry = arraySort.ascesdingArray(arr);
        System.out.println(" Ascending array is ");
        for (int i : ascArry) {
            System.out.print(i + " ");

        }
    }

    public int[] descesdingArray(int[] ar) {
        int temp = ar[0];
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar;
    }

    public static int[] ascesdingArray(int[] ar) {
        int temp = ar[0];
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar;
    }
}
