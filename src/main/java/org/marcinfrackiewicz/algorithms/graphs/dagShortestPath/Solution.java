package org.marcinfrackiewicz.algorithms.graphs.dagShortestPath;

import org.marcinfrackiewicz.algorithms.graphs.Edge;
import org.marcinfrackiewicz.algorithms.Utility;

import static org.marcinfrackiewicz.algorithms.graphs.Topsort.Solution.topsort;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Integer[] dists = dagShortestPath(Utility.directedWeighedGraph, 2);
        System.out.println(dists[3]);
        System.out.println(Arrays.toString(dists));
    }

    public static Integer[] dagShortestPath(Map<Integer, List<Edge>> graph, int start) {
        int n = graph.size();
        int[] topsort = topsort(graph);
        Integer[] dist = new Integer[n];
        dist[start] = 0;

        for (int i = 0; i < n; i++) {

            int nodeIndex = topsort[i];
            if (dist[nodeIndex] != null) {
                List<Edge> adjacentEdges = graph.get(nodeIndex);
                if (adjacentEdges != null) {
                    for (Edge edge : adjacentEdges) {

                        int newDist = dist[nodeIndex] + edge.weight;
                        if (dist[edge.to] == null) dist[edge.to] = newDist;
                        else dist[edge.to] = Math.min(dist[edge.to], newDist);
                    }
                }
            }
        }
        return dist;
    }
}
