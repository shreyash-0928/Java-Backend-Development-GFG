package com.shreyash.Java.Operators;

import java.util.Scanner;

public class NthTermOfAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();
        System.out.println(Nth_term(a,d,n));
    }

    private static int Nth_term(int a, int d, int n) {

        int ans = a + (n-1)*d;
        return ans;
    }
}
