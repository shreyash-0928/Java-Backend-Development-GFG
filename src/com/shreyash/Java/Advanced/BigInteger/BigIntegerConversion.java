package com.shreyash.Java.Advanced.BigInteger;

import java.math.BigInteger;

public class BigIntegerConversion {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("100");
        int a = A.intValue();
        long b = A.longValue();
        String c = A.toString();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
