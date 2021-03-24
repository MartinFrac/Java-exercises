package org.marcinfrackiewicz.algorithms.selectionSort;

import org.marcinfrackiewicz.algorithms.Utility;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {5,30,2,56,3,10,-1,12};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length - 1; i++) {
            k = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            Utility.swap(i, k, array);
        }
    }
}
