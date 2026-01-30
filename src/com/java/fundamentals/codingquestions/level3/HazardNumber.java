package com.java.fundamentals.codingquestions.level3;

import java.util.Scanner;

public class HazardNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number = sc.nextInt();
        int sum = 0;
        int remainder = 0;
        int original = number;
        while (number > 0) {
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        if (original % sum == 0) {
            System.out.println("hazard number");
        } else {
            System.out.println("not a hazard number");
        }
        sc.close();
    }
}
