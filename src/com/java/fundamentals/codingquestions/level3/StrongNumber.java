package com.java.fundamentals.codingquestions.level3;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,original,digit;
        System.out.println("enter a number");
        number=sc.nextInt();
        original=number;
        int sum=0;
        while (number>0){
            digit=number%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            number= number/10;
        }
        if (sum==original){
            System.out.println("strong number");
        }else {
            System.out.println("not a strong number");
        }
    }
}
