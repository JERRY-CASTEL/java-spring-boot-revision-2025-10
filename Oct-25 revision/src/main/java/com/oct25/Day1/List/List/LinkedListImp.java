package com.oct25.Day1.List.List;
import java.util.*;

public class LinkedListImp {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(List.of(1,2,3,4,5));
        ll.addFirst(0);
        ll.addLast(6);

        Integer firstElement = ll.getFirst();
        Integer lastElement = ll.getLast();

        ll.offer(7); // this will return boolean if succesfully inserted and its usefull at a limitation of size
        ll.offerFirst(-1);
        ll.offerLast(8);

        Integer peekElement = ll.peek(); // in linked List by default it will get the first element
        Integer peekFirstElement = ll.peekFirst();
        Integer peekLastElement = ll.peekLast();

        Integer pollElement = ll.poll();
        Integer pollFirstElement = ll.pollFirst();
        Integer pollLastElement = ll.pollLast();

        Integer[] arr = ll.toArray(new Integer[0]);

//        System.out.println(Arrays.toString(arr));
//        System.out.println(pollLastElement);
//        System.out.println(pollFirstElement);
//        System.out.println(pollElement);
//        System.out.println(peekLastElement);
//        System.out.println(peekFirstElement);
//        System.out.println(peekElement);
//        System.out.println(firstElement);
//        System.out.println(lastElement);
        System.out.println(ll);
    }
}
