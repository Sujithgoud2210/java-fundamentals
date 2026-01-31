package com.java.fundamentals.codingquestions.patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter number");
        num=sc.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
//enter number
//5
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *