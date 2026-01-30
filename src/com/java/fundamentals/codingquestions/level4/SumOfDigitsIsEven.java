package com.java.fundamentals.codingquestions.level4;

import java.util.Scanner;

public class SumOfDigitsIsEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number=sc.nextInt();
        int digit;
        for (int n=1;n<number;n++){
            int temp=number;
            int sum=0;
        while(temp>0){
            digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
           if(sum%2==0){
               System.out.println(n);
           }
           else{
               System.out.println("no numbers");
           }
        }
        sc.close();
    }
}
