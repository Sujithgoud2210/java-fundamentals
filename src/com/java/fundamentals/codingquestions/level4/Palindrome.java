package com.java.fundamentals.codingquestions.level4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = i, rev = 0, temp = i;

            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

            if (num == rev)
                System.out.print(num + " ");
        }
    }
}
