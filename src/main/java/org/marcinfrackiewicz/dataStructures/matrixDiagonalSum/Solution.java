package org.marcinfrackiewicz.dataStructures.matrixDiagonalSum;

public class Solution {

    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{
        {7,3,1,9},
        {3,4,6,9},
        {6,9,6,6},
        {9,5,8,5}}));
    }

    public static int diagonalSum(int[][] mat) {
        int height = mat.length;
        int width = mat[0].length;
        int sum = 0;

        for (int i = 0; i < width; i++) {
            sum += mat[i][i];
            if (((height) % 2 == 1) && ((height - 1) / 2 == i)) continue;
            sum += mat[height - 1 - i][i];
        }
        return sum;
    }
}
