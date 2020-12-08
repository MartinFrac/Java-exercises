package org.marcinfrackiewicz.algorithms;

import org.marcinfrackiewicz.algorithms.graphs.Edge;

import java.util.*;

public class Utility {
    public static int size = 9;
    public static int start = 3;
    public static int end = 8;
    public static List<List<Integer>> undirectedGraph = new ArrayList<>();
    public static Map<Integer, List<Edge>> directedWeighedGraph = new HashMap<>();
    public static final int N = 7;

    static {
        undirectedGraph.add(new ArrayList<>(Arrays.asList(2, 3)));        //0
        undirectedGraph.add(new ArrayList<>(Arrays.asList(2)));           //1
        undirectedGraph.add(new ArrayList<>(Arrays.asList(1, 8, 0)));     //2
        undirectedGraph.add(new ArrayList<>(Arrays.asList(5, 7, 0)));     //3
        undirectedGraph.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));  //4
        undirectedGraph.add(new ArrayList<>(Arrays.asList(3, 4)));        //5
        undirectedGraph.add(new ArrayList<>(Arrays.asList(4)));           //6
        undirectedGraph.add(new ArrayList<>(Arrays.asList(3, 4)));        //7
        undirectedGraph.add(new ArrayList<>(Arrays.asList(2, 4)));        //8

        for (int i = 0; i < N; i++) directedWeighedGraph.put(i, new ArrayList<>());
        directedWeighedGraph.get(0).add(new Edge(0, 1, 3));
        directedWeighedGraph.get(0).add(new Edge(0, 2, 2));
        directedWeighedGraph.get(0).add(new Edge(0, 5, 3));
        directedWeighedGraph.get(1).add(new Edge(1, 3, 1));
        directedWeighedGraph.get(1).add(new Edge(1, 2, 6));
        directedWeighedGraph.get(2).add(new Edge(2, 3, 1));
        directedWeighedGraph.get(2).add(new Edge(2, 4, 10));
        directedWeighedGraph.get(3).add(new Edge(3, 4, 5));
        directedWeighedGraph.get(5).add(new Edge(5, 4, 7));
    }

    public static void swap(int x, int y, int[] array) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
