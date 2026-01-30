package com.java.fundamentals.codingquestions.patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number = sc.nextInt();
        int num = 1;
        for (int row = 1; row <= number; row++) {
            for (int space = number - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
