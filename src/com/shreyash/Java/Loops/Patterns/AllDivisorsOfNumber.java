package com.shreyash.Java.Loops.Patterns;

import java.util.Scanner;

public class AllDivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            if(n%i == 0){
                System.out.println(i + " ");
            }
            i=i+1;
        }

    }
}
