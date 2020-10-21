package org.marcinfrackiewicz.dataStructures.removeElement;

import org.marcinfrackiewicz.algorithms.Utility;

public class Solution {

    static int[] array = {3, 2, 2, 3};
    static int value = 3;

    public static void main(String[] args) {
        System.out.println(removeElement(array, value));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = n -1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == val) {
                if (i < j) {
                    Utility.swap(i,j,nums);
                }
                j--;
            }
        }
        return ++j;
    }
}
