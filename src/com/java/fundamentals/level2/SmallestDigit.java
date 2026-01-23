package com.java.fundamentals.level2;

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, digit, small = 0;
        System.out.println("enter a number");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            if (digit < small) {
                small = digit;
            }
            number = number / 10;
        }
        System.out.println("small = " + small);
    }
}
