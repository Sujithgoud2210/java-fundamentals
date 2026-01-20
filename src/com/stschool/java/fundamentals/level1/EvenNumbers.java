package com.stschool.java.fundamentals.level1;
import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.print(i+" ");
        }
    }
}