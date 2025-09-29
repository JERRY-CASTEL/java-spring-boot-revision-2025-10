package com.oct25.Day1.List.List;

import java.util.List;
import java.util.Stack;

public class StackImp {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        for(int i=1;i<=5;i++){
            st.push(i);
        }

        Integer top = st.peek();
        boolean isEmpty = st.isEmpty();
        Integer popValue = st.pop();
        Integer isAvalible = st.search(5);

//        System.out.println(isAvalible);
//        System.out.println(popValue);
//        System.out.println(isEmpty);
//        System.out.println(top);
        System.out.println(st);
    }
}
