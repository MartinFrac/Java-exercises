package org.marcinfrackiewicz.parsing.max69Number;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maximum69Number(9996));
    }

    public static int maximum69Number(int num) {
        StringBuilder numString = new StringBuilder();
        numString.append(num);
        for (int i = 0; i < numString.length(); i++) {
            char c = numString.charAt(i);
            if (c == '6') {
                numString.replace(i, i + 1, "9");
                break;
            }
        }
        num = Integer.parseInt(numString.toString());
        return num;
    }
}
