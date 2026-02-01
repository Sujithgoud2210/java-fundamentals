package com.java.fundamentals.codingquestions.patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number = sc.nextInt();

        for (int row = 1; row <= number; row++) {
            for (int space = number - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
//enter a number
//5
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *