package com.java.fundamentals.level2;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, digit , cube = 0, original;
        System.out.println("enter a number");
        number = sc.nextInt();
        original = number;
        while (number > 0) {
            digit = number % 10;
            cube = cube + digit * digit * digit;
            number = number / 10;
        }
        if (cube == original) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not a armstrong number");
        }
    }
}
