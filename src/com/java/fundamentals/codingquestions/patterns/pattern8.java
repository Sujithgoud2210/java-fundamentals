package com.java.fundamentals.codingquestions.patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number = sc.nextInt();
        for (int row = 0; row < number; row++) {
            for (int space = 0; space < number-row-1; space++) {
                System.out.print(" ");
            }
            for (int column = 0; column < 2*row+1; column++) {
                System.out.print("*"+ " ");
            }
            for (int space = 0; space < number-row-1; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
