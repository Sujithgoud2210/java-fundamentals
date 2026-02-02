package com.java.fundamentals.codingquestions.level4;

import java.util.Scanner;

public class SumOfFactorialsOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++)
                fact *= i;

            sum += fact;
            temp /= 10;
        }

        System.out.println("Sum of factorials = " + sum);
    }
}
