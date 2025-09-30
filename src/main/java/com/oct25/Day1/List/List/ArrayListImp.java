package com.oct25.Day1.List.List;
import java.util.ArrayList;
import java.util.List;

public class ArrayListImp {
    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(0,0);
        li.addAll(new ArrayList<>(List.of(3,4,5)));
//        li.clear();
        ArrayList<Integer> li2 = (ArrayList<Integer>) li.clone();
        boolean isContains = li.contains(100);
//        li.ensureCapacity(7); // this will set the minimum of 7 capacity in insert
        li.add(6);
        li.add(6);
        li.add(6);
        int secondIndexValue = li.get(2);
        boolean isListEmpty = li.isEmpty();
        int lastIndexOfSix = li.lastIndexOf(6);
        li.remove((Object) Integer.valueOf(0)); // this is how we should mention object
        li.remove(6); // this is remove based on the index
        li.removeAll(new ArrayList<>(List.of(6,6)));
        ArrayList<Integer> tempLiToRetain = new ArrayList<>(List.of(1,2));
        tempLiToRetain.retainAll(li);
        li.set(0, 0);
        int length = li.size();
        ArrayList<Integer> subListOfLi = new ArrayList<>(li.subList(0,3));
        Integer[] liToArray1 = li.toArray(new Integer[0]);
        li.trimToSize();

//        System.out.println(Arrays.toString(liToArray1));
//        System.out.println(subListOfLi);
//        System.out.println(length);
//        System.out.println(tempLiToRetain);
//        System.out.println(lastIndexOfSix);
//        System.out.println(isListEmpty);
//        System.out.println(secondIndexValue);
//        System.out.println(isContains);
        System.out.println(li);
//        System.out.println(li2);
    }
}
