package com.shreyash.Java.ArrayList.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BackwardTraversalAndSetMethod {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);


        ListIterator<Integer> it = list.listIterator(list.size());

        while (it.hasPrevious()) {
            int x = it.previous();

            it.set(x * 2);
        }

        System.out.println(list);
    }
}
