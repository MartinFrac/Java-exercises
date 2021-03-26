package org.marcinfrackiewicz.parsing.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static String string = "gfgfgdg gfdgsdsal;mvnfsdfs";

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(string));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> visited = new HashSet<>();
        int n = s.length();
        int max = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!visited.contains(s.charAt(j))){
                visited.add(s.charAt(j++));
                max = Math.max(max, j - i);
            }
            else {
                visited.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
