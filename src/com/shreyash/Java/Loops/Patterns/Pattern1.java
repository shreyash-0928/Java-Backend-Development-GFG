package com.shreyash.Java.Loops.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int row = 1;
        int n = 4;
        while(row <= n){
            int col = 1;
            while(col <= n){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
