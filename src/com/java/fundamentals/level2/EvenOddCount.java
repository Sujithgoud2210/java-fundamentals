package com.java.fundamentals.level2;

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, even = 0, odd = 0, digit;
        System.out.println("enter a number");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number = number / 10;
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
