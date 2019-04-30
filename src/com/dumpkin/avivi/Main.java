//Створити клас MyMath. В ньому створити 2-3 константи і 3-4 статичні методи.
//Константи і методи повинні бути математичного характеру.
//Визвати константи і статичні методи в методі main

package com.dumpkin.avivi;

public class Main {

    public static void main(String[] args) {

        // Exersise1 _________________________________________________

        System.out.println("divide 34.6/235: "+MyMath.divide(34.6,235d));
        System.out.println("substract 34-47: "+MyMath.subtract(34,47));
        System.out.println("mutliply 255x255: "+MyMath.mult(256,256));
        System.out.println("summ 444+222: "+MyMath.sum(444,222));
        System.out.println("constant PI is "+MyMath.PI);
        System.out.println("constant Euler's number is "+MyMath.E);
        //____________________________________________________________



    }
}
