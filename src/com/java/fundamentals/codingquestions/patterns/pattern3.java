package com.java.fundamentals.codingquestions.patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number=sc.nextInt();
        for(int row=1;row<=number;row++)
        {
            for(int column=1;column<=row;column++){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
//enter a number
//5
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5