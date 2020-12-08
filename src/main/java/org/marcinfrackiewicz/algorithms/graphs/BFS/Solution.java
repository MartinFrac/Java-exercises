package org.marcinfrackiewicz.algorithms.graphs.BFS;

import java.util.*;
import static org.marcinfrackiewicz.algorithms.Utility.*;

public class Solution {

    public static void main(String[] args) {
        int[] childToParent = solve(start);
        System.out.println(reconstructPath(start, end, childToParent));
    }
    public static int[] solve(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[size];
        int[] childToParent = new int[size];

        Arrays.fill(childToParent, -1);
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            List<Integer> neighbours = undirectedGraph.get(node);

            for(int next: neighbours) {
                if(!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                    childToParent[next] = node;
                }
            }
        }
        return childToParent;
    }

    public static List<Integer> reconstructPath(int s, int e, int[] childToParent) {
         List<Integer> path = new LinkedList<>();
        for(int at = e; at != -1; at = childToParent[at]) {
            path.add(at);
        }
        Collections.reverse(path);
        if (path.get(0) == s) {
            return path;
        }
        return new LinkedList<>();
    }
}
