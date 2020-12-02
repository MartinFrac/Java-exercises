package org.marcinfrackiewicz.parsing.reverseInteger;

public class Solution {
    static int value = 153436469;

    public static void main(String[] args) {
        System.out.println(reverse(value));
    }
    public static int reverse(int x) {
        int output = 0;
        while(x != 0) {
            int digit = x % 10;
            try {
                output = Math.multiplyExact(output, 10);
                output = Math.addExact(output, digit);
            } catch (ArithmeticException e) {
                return 0;
            }
            x /= 10;
        }
        return output;
    }
}
