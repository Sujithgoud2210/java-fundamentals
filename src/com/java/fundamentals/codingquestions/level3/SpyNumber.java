package com.java.fundamentals.codingquestions.level3;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number = sc.nextInt();
        int sum = 0;
        int product=1;
        int remainder = 0;
        while (number > 0) {
            remainder = number % 10;
            sum = sum + remainder;
            product=product*remainder;
            number = number / 10;
        }
        if (sum == product) {
            System.out.println("spy number");
        } else {
            System.out.println("not a spy number");
        }
        sc.close();
    }
}
