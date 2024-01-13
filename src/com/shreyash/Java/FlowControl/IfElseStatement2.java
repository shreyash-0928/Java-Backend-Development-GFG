package com.shreyash.Java.FlowControl;

import java.io.IOException;
import java.util.Scanner;

public class IfElseStatement2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");

        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println(n * (n + 1) / 2);
    }
}
