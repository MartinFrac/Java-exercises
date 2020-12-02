package org.marcinfrackiewicz.algorithms.Topsort;

import org.marcinfrackiewicz.algorithms.Edge;
import org.marcinfrackiewicz.algorithms.Utility;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topsort(Utility.directedWeighedGraph)));
    }

    public static int[] topsort(Map<Integer, List<Edge>> graph) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        int[] ordering = new int[n];
        int i = n - 1;

        for (int at = 0; at < n; at++)
            if (!visited[at]) i = dfs(i, at, visited, ordering, graph);

        return ordering;
    }

    public static int dfs(int i, int at, boolean[] visited, int[] ordering, Map<Integer, List<Edge>> graph) {
        visited[at] = true;

        List<Edge> edges = graph.get(at);

        if (edges != null)
            for (Edge edge : edges) if (!visited[edge.to]) i = dfs(i, edge.to, visited, ordering, graph);

        ordering[i] = at;
        return i - 1;
    }
}
