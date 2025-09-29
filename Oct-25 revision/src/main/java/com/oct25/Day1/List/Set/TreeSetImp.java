package com.oct25.Day1.List.Set;

import java.util.List;
import java.util.TreeSet;

// Tree set will not allow null values
// Its not thread safty
public class TreeSetImp {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>(List.of(1,2,3,4,5,10,20,10));

        Integer ceilingValue = ts.ceiling(9);
        Integer floorValue = ts.floor(9);

        System.out.println(floorValue);
//        System.out.println(ceilingValue);
        System.out.println(ts);
    }
}
