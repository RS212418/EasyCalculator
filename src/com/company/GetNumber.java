package com.company;

import java.util.Scanner;

public class GetNumber {

    public static int getTwoNumbers(int a, int b) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        a = input.nextInt();
        System.out.println("Enter another number");
        b = input.nextInt();
        System.out.println("Would you like to: add, multiply, subtract, divide or ?");
        String function = input.next();
        try {
            if (function == "add") {
                return a + b;
            }
            if (function == "multiply") {
                return a * b;
            }
            if (function == "subtract") {
                return a - b;
            }
            if (function == "divide") {
                return a / b;
            }
        } catch (Exception e) {
            System.out.println("There was an error");
        }
        return a;
    }
}