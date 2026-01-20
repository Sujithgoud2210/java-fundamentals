package com.stschool.java.fundamentals.level1;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int number, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        while(number>0)
        {
            number=number/10;
            count=count+1;
        }
        System.out.println("count in the given digit is : "+count);
    }
}
