package com.shreyash.Java.Operators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        String user = "geek", pwd = "GEEK";

        Scanner sc = new Scanner(System.in);
        String iu = sc.next();
        String ip = sc.next();
        if(user.equals(iu) && pwd.equals(ip))
            System.out.println(("Welcome"));
        else
            System.out.println("Try Again");
    }
}
