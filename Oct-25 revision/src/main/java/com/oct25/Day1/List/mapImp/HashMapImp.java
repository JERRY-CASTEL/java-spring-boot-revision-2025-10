package com.oct25.Day1.List.mapImp;


import java.util.HashMap;



public class HashMapImp {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,3);

        boolean isKeyContain = hm.containsKey(1);
        boolean isValueContain = hm.containsValue(1);
        Integer retriveValue = hm.get(1);

        System.out.println(retriveValue);
//        System.out.println(isValueContain);
//        System.out.println(isKeyContain);
//        System.out.println(hm.entrySet()); [1=1, 2=2, 3=3]
        System.out.println(hm);
    }
}

