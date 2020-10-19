package org.marcinfrackiewicz.algorithms.DFS;

import java.util.List;

import static org.marcinfrackiewicz.algorithms.Data.*;

public class Solution {
    public static boolean[] visited = new boolean[size];
    public static int previous = start;
    public static boolean finishedNeighbours = false;

    public static void main(String[] args) {
        dfs(start);
    }

    public static void dfs(int at) {
        if (visited[at]) {
            System.out.println("Already visited");
            System.out.println("Traceback to: " + previous);
            return;
        }
        visited[at] = true;

        List<Integer> neighbours = adjacencyList.get(at);
        System.out.println("im at: " + at);
        previous = at;
        for (int next: neighbours) {
            System.out.println("next: ");
            System.out.println(next);
            dfs(next);
            if (finishedNeighbours) {
                finishedNeighbours = false;
                System.out.println("Traceback to: " + at);
                previous = at;
            }
        }
        System.out.println("All neighbours visited in: " + at);
        finishedNeighbours = true;
    }
}
