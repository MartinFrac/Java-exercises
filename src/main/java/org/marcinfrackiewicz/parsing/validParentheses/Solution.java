package org.marcinfrackiewicz.parsing.validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    private Map<Character, Character> map;

    public Solution() {
        map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String test = "[()]}";
        System.out.println(solution.isValid(test));
    }

    boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (map.containsKey(c)) {
                char top = stack.empty() ? '#' : stack.pop();
                if (top != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
