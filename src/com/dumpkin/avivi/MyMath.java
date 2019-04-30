//
// MyMath library with static overloaded methods
//

package com.dumpkin.avivi;

public class MyMath {

    public static final double PI = 3.14159_26535_89793_23846;
    public static final double E = 2.71828_18284_59045_23536;

    //summ of integer and double args
// ___________________________________________
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    //substract of integer and double args
// ___________________________________________
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    //divide of integer and double args
// ___________________________________________
    public static int divide(int a, int b) {
        if (b != 0) return a / b;
        else return 0;
    }

    public static double divide(double a, double b) {
        if (b != 0) return a / b;
        else return 0;
    }

    //multiply of integer and double args
// ___________________________________________
    public static long mult(int a, int b) {
        return a * b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

}
