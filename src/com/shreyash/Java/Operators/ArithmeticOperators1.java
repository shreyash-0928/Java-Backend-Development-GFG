package com.shreyash.Java.Operators;

public class ArithmeticOperators1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(y/x);

        int z = (x+y*10);
        System.out.println(z);
        z = x++;                                // z = x;
                                                // x = x+1;
        System.out.println(z +" "+x);           // 10 11

        z = ++x;                                // x = x+1
                                                // z = x
        System.out.println(z +" "+x);           // 12 12


        int a = 3;
        System.out.println((a++)+""+((a--)));
        System.out.println((5^2^5)^2);
        int n = 1000000;
        System.out.println(n*(n+1)/2);
        System.out.println(null == null);
        System.out.println(~2);

//        int arr[] = {1,2};
//        int arr1[] = {1,2};
//        System.out.println(arr == arr1);
    }
}
