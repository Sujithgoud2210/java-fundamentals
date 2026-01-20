package com.stschool.java.fundamentals;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        int number, digit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        while(number>0)
        {
            digit=number%10;
            System.out.println(digit);
            number=number/10;
        }
    }
}
