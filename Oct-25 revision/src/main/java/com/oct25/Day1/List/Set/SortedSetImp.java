package com.oct25.Day1.List.Set;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetImp {

    public static void main(String[] args) {

        SortedSet<Integer> ss = new TreeSet<>(List.of(1,-1,0,10,5));

        System.out.println(ss);

    }
}
