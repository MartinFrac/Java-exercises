package org.marcinfrackiewicz.parsing.morseCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    
    public static HashMap<String, String> ENGLISH_TO_MORSE = new HashMap<>();
    public static final String[] MORSE_ARRAY = 
            {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-", 
                ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static void main(String[] args) {
        for (int i = 0; i < MORSE_ARRAY.length; i++) {
            char c = (char) ((char)97 + i);
            ENGLISH_TO_MORSE.put(String.valueOf(c), MORSE_ARRAY[i]);
        }
        
        System.out.println(uniqueMorseRepresentation(new String[] {"gin", "zen", "gig", "msg"}));
    }

    public static int uniqueMorseRepresentation(String[] words) {
        HashSet<String> uniqueTransformations = new HashSet<>();
        int counter = 0;
        for (String word : words) {
            String morse = convertToMorse(word);
            if (!uniqueTransformations.contains(morse)) {
                uniqueTransformations.add(morse);
                counter++;
            }
        }
        return counter;
    }

    public static String convertToMorse(String word) {
        StringBuilder output = new StringBuilder();
        Arrays.stream(word.split(""))
                .forEach(e -> output.append(ENGLISH_TO_MORSE.get(e)));
        return output.toString();
    }
}
