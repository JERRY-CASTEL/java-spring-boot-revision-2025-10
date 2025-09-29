package com.oct25.Day1.List.Set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class customCompare implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        boolean isO1Odd = o1 % 2 != 0;
        boolean isO2Odd = o2 % 2 != 0;

        if (isO1Odd && !isO2Odd) {
            return -1;
        }


        if (!isO1Odd && isO2Odd) {
            return 1;
        }
        return o1.compareTo(o2);
    }
}
public class ComparatorImp {

    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<>(List.of(3,2,6,1,4,0));
        li.sort(new customCompare());
        System.out.println(li);

    }

}
