package org.marcinfrackiewicz.parsing.isIntegerPalindrome;

public class Solution {

    public static void main(String[] args) {
        isPalindromeInt(1001);
        isPalindromeString(252);
    }

    public static boolean isPalindromeString(int x) {
        if(x<0) return false;
        String input = String.valueOf(x);
        int length = input.length();
        for (int i = 0, j = length - 1; i < (length/2); i++) {
            if (input.charAt(i)!=input.charAt(j)) return false;
            j--;
        }
        return true;
    }

    public static boolean isPalindromeInt(int x) {
        if(x<0) return false;
        int reversed = 0;
        int original = x;
        while(x != 0) {
            int digit = x % 10;
            try {
                reversed = Math.multiplyExact(reversed, 10);
                reversed = Math.addExact(reversed, digit);
            } catch (ArithmeticException e) {
                return false;
            }
            x /= 10;
        }
        if (reversed == original) return true;
        return false;
    }
}
