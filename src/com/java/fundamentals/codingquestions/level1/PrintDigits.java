package com.java.fundamentals.codingquestions.level1;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        int number, digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }
    }
}
