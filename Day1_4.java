package com.bridgelabz.sample;

import java.util.Scanner;
public class Day1_4 {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year. ");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not leap year. ");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year. ");
        } else {
            System.out.println(year + " is not a leap year. ");
        }
    }
}
