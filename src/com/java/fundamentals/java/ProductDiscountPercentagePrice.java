package com.java.fundamentals.java;

import java.util.Scanner;

public class ProductDiscountPercentagePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productPrice, quantity;
        float discountPercentage, centralTax, stateTax, finalPrice,  DiscountedPrice, discountAmount, stateTaxAmount, centralTaxAmount, finalBill, totalSaved, savedAmount;
        centralTax = 2.5f;
        stateTax = 2.5f;
        System.out.print("enter product price = ");
        productPrice = sc.nextInt();
        System.out.print("enter discount percentage = ");
        discountPercentage = sc.nextByte();
        System.out.println("product price = "+productPrice);
        System.out.println("discount percentage = "+discountPercentage);
        discountAmount = (productPrice * discountPercentage) / 100;
        DiscountedPrice = productPrice - discountAmount;
        System.out.println("Discount Amount = "+discountAmount);
        stateTaxAmount = (DiscountedPrice * stateTax) / 100;
        centralTaxAmount = (DiscountedPrice * centralTax) / 100;
        finalPrice = DiscountedPrice + centralTaxAmount + stateTaxAmount;
        System.out.println("State Tax = "+stateTax);
        System.out.println("Central Tax = "+centralTax);
        System.out.println("Final Product Price = "+finalPrice);
        savedAmount = productPrice - finalPrice;
        System.out.print("enter quantity = ");
        quantity = sc.nextInt();
        finalBill = finalPrice * quantity;
        totalSaved = quantity * savedAmount;
        System.out.println("Final  Bill = "+finalBill);
        System.out.println("Total Saved = "+totalSaved);
    }
}
