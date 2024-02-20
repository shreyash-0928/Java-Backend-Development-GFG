package com.shreyash.Java.ArrayList.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class addMethod {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        ListIterator<Integer> ite = list1.listIterator();

        while (ite.hasNext()) {
            ite.add(5);
            ite.next();
        }
        System.out.println(list1);
    }
}
