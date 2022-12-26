package com.JavaPrograms.RahulShetty;

public class AdjacentArrayDiff {
    public static void main(String[] args) {
        int[] ar = {4, 5, 15, 9, 26};
        System.out.println(AdjacentArrayDiff.maxIndexDiff(ar));
    }

    public static int maxIndexDiff(int[] ar) {
        int max = ar[0];
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i + 1] - ar[i] > max)
                max = ar[i + 1] - ar[i];
        }
        return max;
    }
}
