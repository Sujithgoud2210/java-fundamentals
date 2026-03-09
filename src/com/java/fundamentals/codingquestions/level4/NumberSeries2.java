package com.java.fundamentals.codingquestions.level4;

import java.util.Scanner;

public class NumberSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int num = 0;
        for (int i = 1; i <= n; i++) {
            num = num * 10 + 1;
            System.out.print(num + " ");
        }
    }
}
