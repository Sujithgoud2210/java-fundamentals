package com.java.fundamentals.level2;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, digit, max = 0;
        System.out.println("enter a number");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number = number / 10;
        }
        System.out.println("max = " + max);
    }
}
