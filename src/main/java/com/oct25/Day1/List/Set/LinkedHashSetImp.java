package com.oct25.Day1.List.Set;

// This maintains the insertion order

import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetImp {
    public static void main(String[] args) {

        LinkedHashSet<Integer> ls = new LinkedHashSet<>(List.of(1,2,3));


        System.out.println(ls);
    }
}
