package org.marcinfrackiewicz.parsing.removeOuterParentheses;

public class Solution {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("()((()))"));
    }

    public static String removeOuterParentheses(String s) {
        if (s.length() == 0) return "";
        String output = "";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (counter < 0) return "";
            if (element == '(') counter++;
            if (counter > 1) output += element;
            if (element == ')') counter--;
        }
        return output;
    }
}
