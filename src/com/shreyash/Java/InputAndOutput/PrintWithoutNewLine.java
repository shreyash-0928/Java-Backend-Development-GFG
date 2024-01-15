package com.shreyash.Java.InputAndOutput;

import java.util.Scanner;

public class PrintWithoutNewLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.print(a + " " + b);

    }
}
