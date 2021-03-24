package org.marcinfrackiewicz.algorithms.insertionSort;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {5,30,2,56,3,10,-1,12};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int j = 0;
        int t = 0;
        for (int i = 1; i < array.length; i++) {
            j = i;
            t = array[j];
            while (j > 0 && t < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = t;
        }
    }
}
