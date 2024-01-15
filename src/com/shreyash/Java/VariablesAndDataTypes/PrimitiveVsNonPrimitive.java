package com.shreyash.Java.VariablesAndDataTypes;

public class PrimitiveVsNonPrimitive
{
    // 1. Non-primitive type variables are always references
    // 2. Memory for non-primitives is always allocated on Heap
    // 3. Memory for primitives are stored in stack memory
    // 3. Members of non-primitives get default values (like - int variable get 0, boolean get false, etc
    // 4. Any data type which are created by classes are non-primitive data types
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = x1;
        x2 = 20;
        System.out.println(x1);
        System.out.println(x2);

        // O/P = 10 20 Because they are not references they are normal variables
    }
}
