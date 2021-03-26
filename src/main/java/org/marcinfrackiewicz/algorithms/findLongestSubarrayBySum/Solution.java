package org.marcinfrackiewicz.algorithms.findLongestSubarrayBySum;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findLongestSubarrayBySum(new int[]{1,2,1,5,3,1,2,1,1,1,1}, 4)));
    }

    public static int[] findLongestSubarrayBySum(int[] array, int sum) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int[] output = new int[]{-1, -1};

        while(right < array.length) {
            currentSum += array[right];
            while (left < right && currentSum > sum) {
                currentSum -= array[left++];
            }
            if (currentSum == sum && (output[1] - output[0] < right - left)) {
                output[0] = left;
                output[1] = right;
            }
            right++;
        }
        return output;
    }
}
