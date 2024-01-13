package com.shreyash.Java.Loops.Patterns;

import java.util.Scanner;

public class InvertedPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while(row<=n){
            int col = 1;
            while (col <= n-row){
                System.out.print(" ");
                col++;
            }
            while(col <= n){
                System.out.print("* ");
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
