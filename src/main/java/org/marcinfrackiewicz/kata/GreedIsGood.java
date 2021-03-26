package org.marcinfrackiewicz.kata;

import java.util.HashMap;
import java.util.Map;

public class GreedIsGood {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{1,1,1,3,1}));
    }

    public static int greedy(int[] dice){
        Map<Integer, Integer> diceToScore = Map.of(
                5, 50,
                1, 100,
                32, 200,
                33, 300,
                34, 400,
                35, 500,
                36, 600,
                31, 1000
        );
        Map<Integer, Integer> diceToCount = new HashMap<>(Map.of(
                1, 0,
                2, 0,
                3, 0,
                4, 0,
                5, 0,
                6, 0
        ));
        int sum = 0;
        for (int value: dice) {
            diceToCount.merge(value, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : diceToCount.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if (v >= 3) {
                sum += diceToScore.get(k + 30);
                v -= 3;
                diceToCount.put(k, v);
            }
            if (v > 0) {
                sum += diceToScore.getOrDefault(k, 0) * v;
            }
        }
        return sum;
    }
}
