package com.shreyash.Java.FlowControl;

import java.io.IOException;
import java.util.Scanner;

public class IfStatement3 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int n= sc.nextInt();
        if( n > 0 )
        {
            System.out.print("Positive ");
            if(n%2==0)
                System.out.print("Even\n");
            else
                System.out.print("Odd\n");
        }
        else if( n < 0 )
        {
            System.out.print("Negative ");
            if(n%2==0)
                System.out.print("Even\n");
            else
                System.out.print("Odd\n");
        }
        else
        {
            System.out.print("Zero");
        }
    }
}
