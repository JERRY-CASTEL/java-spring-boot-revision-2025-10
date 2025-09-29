package com.oct25.Day1.List.Set;

import java.util.HashSet;
import java.util.List;


// This will store only one null value
// This will not matain insertion order
public class HashSetImp {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(List.of(100,1,2,3,4));

        hs.add(4);

        boolean isAvalible = hs.contains(-1);


//        System.out.println(isAvalible);
        System.out.println(hs);

    }
}
