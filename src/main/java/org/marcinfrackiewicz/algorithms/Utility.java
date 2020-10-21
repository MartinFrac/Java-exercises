package org.marcinfrackiewicz.algorithms;

import java.util.*;

public class Data {
    public static int size = 9;
    public static int start = 3;
    public static int end = 8;
    public static List<List<Integer>> adjacencyList = new ArrayList<>();
    public static Map<Integer, List<Edge>> graphDag = new HashMap<>();
    public static final int N = 7;

    static {
        adjacencyList.add(new ArrayList<>(Arrays.asList(2, 3)));        //0
        adjacencyList.add(new ArrayList<>(Arrays.asList(2)));           //1
        adjacencyList.add(new ArrayList<>(Arrays.asList(1, 8, 0)));     //2
        adjacencyList.add(new ArrayList<>(Arrays.asList(5, 7, 0)));     //3
        adjacencyList.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));  //4
        adjacencyList.add(new ArrayList<>(Arrays.asList(3, 4)));        //5
        adjacencyList.add(new ArrayList<>(Arrays.asList(4)));           //6
        adjacencyList.add(new ArrayList<>(Arrays.asList(3, 4)));        //7
        adjacencyList.add(new ArrayList<>(Arrays.asList(2, 4)));        //8

        for (int i = 0; i < N; i++) graphDag.put(i, new ArrayList<>());
        graphDag.get(0).add(new Edge(0, 1, 3));
        graphDag.get(0).add(new Edge(0, 2, 2));
        graphDag.get(0).add(new Edge(0, 5, 3));
        graphDag.get(1).add(new Edge(1, 3, 1));
        graphDag.get(1).add(new Edge(1, 2, 6));
        graphDag.get(2).add(new Edge(2, 3, 1));
        graphDag.get(2).add(new Edge(2, 4, 10));
        graphDag.get(3).add(new Edge(3, 4, 5));
        graphDag.get(5).add(new Edge(5, 4, 7));
    }
}
