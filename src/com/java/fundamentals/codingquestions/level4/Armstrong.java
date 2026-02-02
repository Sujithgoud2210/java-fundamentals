package com.java.fundamentals.codingquestions.level4;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = i, sum = 0, temp = i;
            int digits = String.valueOf(i).length();

            while (temp > 0) {
                int d = temp % 10;
                int power = 1;

                for (int j = 1; j <= digits; j++)
                    power *= d;

                sum += power;
                temp /= 10;
            }

            if (sum == num)
                System.out.print(num + " ");
        }
    }
}
