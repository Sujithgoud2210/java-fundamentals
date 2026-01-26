package com.java.fundamentals.level2;

import java.util.Scanner;

public class PrimeUptoN {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number = sc.nextInt();
        for (int N = 1; N <= number; N++) {
            int count=0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    count++;
                }
            }
                if (count == 2) {
                    System.out.println(number + " ");
                }
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number");
//        int N = sc.nextInt();
//        for (int n = 1; n <= N; n++) {
//            int count = 0;
//            for (int i = 1; i <= n; i++) {
//                if (n % i == 0) {
//                    count++;
//                }
//            }
//
//            if (count == 2)
//                System.out.print(n + " ");
//        }
//    }
}
