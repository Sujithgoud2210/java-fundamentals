package com.stschool.java.fundamentals.level1;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if(i%2==0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of given even natural number"+"="+sum );
    }
}
