package com.company;

public class Exercise6 {

    public static void main(String[]args) {

        System.out.println("\nHello friend, and welcome back.\n");
        System.out.println(multadd(1.0,2.0,3.0));
        System.out.println(Math.sin(Math.PI/4) + (Math.cos(Math.PI/4)/2));
        System.out.println(expSum(1));

    }

    public static double expSum(double x) {
        return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;

    }


}
