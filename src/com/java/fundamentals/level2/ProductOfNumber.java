package com.java.fundamentals.level2;

import java.util.Scanner;

public class ProductOfNumber {
    public static void main(String[] args) {
        int number, digit, product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            product = product * digit;
            number = number / 10;
        }
        System.out.println(product);
    }
}
