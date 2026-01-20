package com.stschool.java.fundamentals.level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number, result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }
    }
}
