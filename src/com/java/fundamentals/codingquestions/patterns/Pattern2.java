package com.java.fundamentals.codingquestions.patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number=sc.nextInt();
        for(int row=1;row<=number;row++)
        {
            for(int column=1;column<=number;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
