package com.company;

public class Exercise1 {

    public static void PrintEurope(String day, int date, String month, int year ) {
        //European date.
        System.out.print("European format: \n");
        System.out.printf("%s, %d, %s, %d", day, date, month, year);
        System.out.println("\n");
    }
    public static void PrintAmerican(String day,  String month,int date, int year) {
        //American Date.
        System.out.print("American format: \n");
        System.out.printf("%s, %s, %d, %d", day, month, date, year );
        System.out.println("\n");
    }
    public static void main(String[] args) {
        // Date Message.
        PrintAmerican("Saturday", "September", 4, 2021);
        PrintEurope("Saturday", 4, "September", 2021);
    }

}
