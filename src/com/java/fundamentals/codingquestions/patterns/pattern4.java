package com.java.fundamentals.codingquestions.patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number=sc.nextInt();
        for(int row=1;row<=number;row++)
        {
            for(int column=1;column<=row;column++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
//
//enter a number
//4
//        1
//        2 2
//        3 3 3
//        4 4 4 4
