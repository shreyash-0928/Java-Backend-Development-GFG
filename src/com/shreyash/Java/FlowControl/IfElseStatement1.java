package com.shreyash.Java.FlowControl;

import java.io.IOException;
import java.util.Scanner;

public class IfElseStatement1 {
    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");

        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
