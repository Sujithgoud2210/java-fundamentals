package com.java.fundamentals.level3;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("factors are ");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Number of factors = " + count);
    }
}
