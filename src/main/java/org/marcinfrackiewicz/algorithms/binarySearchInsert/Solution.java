package org.marcinfrackiewicz.algorithms.binarySearchInsert;

public class Solution {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6,8}, 6));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target < nums[mid]) right = mid - 1;
            else if (target > nums[mid]) left = mid + 1;
            else return mid;
        }
        if (target > nums[mid]) mid += 1;
        return mid;
    }
}
