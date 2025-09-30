package com.oct25.Day1.List.mapImp;

// TreeMap is always key sorted
// most operation is log(n)

import java.util.TreeMap;

public class TreeMapImp {

    public static void main(String[] args) {

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        tm.put(2,1);
        tm.put(1,2);

        System.out.println(tm);

    }

}
