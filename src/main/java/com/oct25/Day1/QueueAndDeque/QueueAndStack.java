package com.oct25.Day1.List.QueueAndDeque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAndStack {

    public static void main(String[] args) {

        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> stc = new Stack<>();

        stc.push(10);
        int topValue = (int) stc.peek();

        System.out.println(topValue);
    }

}
