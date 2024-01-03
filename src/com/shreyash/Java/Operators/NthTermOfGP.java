package com.shreyash.Java.Operators;

import java.util.Scanner;

public class NthTermOfGP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int r = s.nextInt();
        int n = s.nextInt();
        System.out.println(Nth_term(a,r,n));
    }

    private static int Nth_term(int a, int r, int N) {

        int ans = a*(int)(Math.pow(r,N-1));
        return ans;
    }
}
