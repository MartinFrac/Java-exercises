package org.marcinfrackiewicz.kata;

import java.util.Arrays;

public class SplitStrings {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdef")));
    }

    public static String[] solution(String s) {
        String[] array;
        int size = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
        array = new String[size];
        for (int i = 0, j = 0; j < size; i+=2, j++) {
            String value = String.valueOf(s.charAt(i));
            if (i+1 >= s.length())
                value += '_';
            else
                value += s.charAt(i+1);
            array[j] = value;
        }
        return array;
    }
}
