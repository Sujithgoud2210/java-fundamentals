package com.stschool.java.fundamentals.level1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        for (int i = number; i >= 1; i--)
            System.out.println(i);
    }
}
