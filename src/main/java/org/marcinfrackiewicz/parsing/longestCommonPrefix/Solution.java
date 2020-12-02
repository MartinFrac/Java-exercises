package org.marcinfrackiewicz.parsing.longestCommonPrefix;

public class Solution {

    static String[] array = {"flower","flow","flight"};
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(array));
    }

    public static String longestCommonPrefix(String[] strs) {
        String output = "";
        int counter = 0;
        if (strs == null || strs.length == 0) {
            return "";
        }
        char current;
        while (strs[0].length() > counter) {
            current = strs[0].charAt(counter);
            for (int i = 0; i < strs.length; i++) {
                if ((strs[i].length() <= counter) || (current!=strs[i].charAt(counter))) {
                    return output;
                }
            }
            output += strs[0].charAt(counter);
            counter++;
        }
        return output;
    }
}
