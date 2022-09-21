package com.bridgelabz.sample;

import java.util.Scanner;

public class Command {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your first argument : ");
        int a = obj.nextInt();
        System.out.println("Enter your second argument : ");
        int b = obj.nextInt();
        int sum = a + b;
        System.out.println("Sum of argument is " + sum);
        obj.close();
    }
}
