package com.shreyash.Java.InputAndOutput;

import java.io.IOException;

public class PlaceHolders {
    public static void main(String[] args)throws IOException
    {
        int x = 100, y = 200;

        System.out.format("Value of x is %d\n", x);             // %d = Integer
                                                                // %c = Character
        float z = (float)Math.PI;                               // %s = String
        System.out.println(z);                                  // %f = Floating point value
        System.out.println(y);

        System.out.format("Value of PI = %.2f\n", z);           // %.2f - means print only 2 digits after te decimal
        System.out.format("Value of PI = %5.2f\n", z);          // %5.2f - means puts extra space before the value
        System.out.format("Value of PI = %05.2f\n", z);         // %6.2f - means puts one more extra space before the value
                                                                // %05.2f - means it puts 0 instead of extra space before the value
        System.out.printf("x = %d, y = %d", x, y);

    }

}
