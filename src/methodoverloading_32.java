package com.company;

public class methodoverloading_32 {

    // static method
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        x = 566; // this change won't affect original 'a' because of pass by value
        return z;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c;

        // call static method directly
        c = logic(a, b);
        System.out.println("Result: " + c);
        System.out.println("a = " + a + " b = " + b); // 'a' and 'b' unchanged

        int a1 = 2;
        int a2 = 3;
        int c1;

        c1 = logic(a1, a2);
        System.out.println("Result: " + c1);
        System.out.println("a1 = " + a1 + " a2 = " + a2);
    }
}
