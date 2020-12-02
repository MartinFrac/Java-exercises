package org.marcinfrackiewicz.algorithms.quickSort;

import org.marcinfrackiewicz.algorithms.Utility;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {5,30,2,56,3,10,-1,12};
        int n = array.length;
        sort(array, 0, n - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                Utility.swap(i, j, arr);
            }
        }
        Utility.swap(i+1, high, arr);
        return i + 1;
    }
}
