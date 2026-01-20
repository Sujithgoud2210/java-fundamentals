package com.java.fundamentals.level2;

import java.util.Scanner;

public class PalindromeNUmber {
    public static void main(String[] args) {
        int number, digit,reverse=0,original;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        original=number;
        while(number>0)
        {
            digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }
        if(original==reverse)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
