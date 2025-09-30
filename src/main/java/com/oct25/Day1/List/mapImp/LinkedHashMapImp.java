package com.oct25.Day1.List.mapImp;

import java.util.LinkedHashMap;


//This will maintain insertion order

public class LinkedHashMapImp {

    public static void main(String[] args) {

        LinkedHashMap<Integer, Integer> lh = new LinkedHashMap<>();

        lh.put(1,2);
        lh.put(2,3);

        System.out.println(lh);


    }
}
