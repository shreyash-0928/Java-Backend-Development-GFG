package com.shreyash.Java.Advanced.BigInteger;

import java.math.BigInteger;

public class BigIntegerOperations {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("54");
        BigInteger B = new BigInteger("54");
        BigInteger C = A.add(B);
//      BigInteger C = A.multiply(B);
//      BigInteger C = A.divide(B);
//      BigInteger C = A.subtract(B);
//      BigInteger C = A.remainder(B);
//      BigInteger C = A.compareTo(B); [> or <]
        System.out.println(C);

    }
}
