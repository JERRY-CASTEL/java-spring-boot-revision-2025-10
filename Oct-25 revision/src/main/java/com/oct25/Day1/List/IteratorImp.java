package com.oct25.Day1.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorImp {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(List.of(4,3,1,7));

        Iterator<Integer> it = arr.iterator();
        ListIterator<Integer> listIt = arr.listIterator();

        while(listIt.hasNext()){
            listIt.next();
            listIt.set(10);
        }

//        while(it.hasNext()){
//            System.out.println(it.next());
////            it.remove();
//        }
//        System.out.println(it.next());
//        System.out.println(it.next());

        System.out.println(arr);
    }

}
