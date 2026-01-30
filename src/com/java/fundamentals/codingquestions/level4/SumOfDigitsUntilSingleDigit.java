package com.java.fundamentals.codingquestions.level4;

import java.util.Scanner;

public class SumOfDigitsUntilSingleDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number=sc.nextInt();
        int digit;

        while(number>=10){
            int sum=0;
            while (number>0){
                digit=number%10;
                sum=sum+digit;
                number=number/10;
            }
            number=sum;
        }
        System.out.println(number);
        sc.close();
    }
}
