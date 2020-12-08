package org.marcinfrackiewicz.dataStructures.flipAndInvertImage;

import org.marcinfrackiewicz.algorithms.Utility;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{0, 0, 1}, {1, 1, 0}, {1, 0, 1}})));
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int width = A[0].length;
        int height = A.length;
        int half = (width / 2) - 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < width; j++) {
                if (j <= half) {
                    Utility.swap(j, width - j - 1, A[i]);
                }
                if (A[i][j] == 1) {
                    A[i][j] = 0;
                } else {
                    A[i][j] = 1;
                }
            }
        }
        return A;
    }
}
