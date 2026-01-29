package com.java.fundamentals.level3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number ");
        n = sc.nextInt();
        int first = 0;
        int second = 1;
        int next;
        System.out.print(first + " ");
        System.out.print(second + " ");
        for (int i = 3; i <= n; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        sc.close();
    }
}
