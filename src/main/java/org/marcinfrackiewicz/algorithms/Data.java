package org.marcinfrackiewicz.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    public static int size = 9;
    public static int start = 3;
    public static int end = 8;
    public static List<List<Integer>> adjacencyList = new ArrayList<>();

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
    }
}
