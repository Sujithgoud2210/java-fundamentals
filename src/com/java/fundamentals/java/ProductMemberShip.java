package com.java.fundamentals.java;

import java.util.Scanner;

public class ProductMemberShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productPrice, quantity;
        float discountPercentage = 0, shippingCharges, centralTax, stateTax, finalPrice, DiscountedPrice, discountAmount, stateTaxAmount, centralTaxAmount, finalBill, totalSaved, savedAmount;
        centralTax = 2.5f;
        stateTax = 2.5f;
        System.out.print("enter product price = ");
        productPrice = sc.nextInt();
        System.out.println("enter membership details");
        System.out.println(" S for silver ");
        System.out.println("G for gold");
        System.out.println("D for diamond");
        System.out.println("else you don't have membership");
        char membership = sc.next().charAt(0);
        if (membership == 'S') {
            discountPercentage = 10;
            shippingCharges = 50;
        } else if (membership == 'G') {
            discountPercentage = 15;
            shippingCharges = 20;
        } else if (membership == 'D') {
            discountPercentage = 20;
            shippingCharges = 0;
        } else {
            shippingCharges = 100;
        }
        discountAmount = (productPrice * discountPercentage) / 100;
        System.out.println("product price = " + productPrice);
        DiscountedPrice = productPrice - discountAmount;
        System.out.println("Discount Amount = " + discountAmount);
        stateTaxAmount = (DiscountedPrice * stateTax) / 100;
        centralTaxAmount = (DiscountedPrice * centralTax) / 100;
        finalPrice = DiscountedPrice + centralTaxAmount + stateTaxAmount;
        System.out.println("State Tax = " + stateTax);
        System.out.println("Central Tax = " + centralTax);
        System.out.println("Final Product Price = " + finalPrice);
        savedAmount = productPrice - finalPrice;
        System.out.print("enter quantity = ");
        quantity = sc.nextInt();
        finalBill = finalPrice * quantity + shippingCharges;
        totalSaved = quantity * savedAmount;
        System.out.println("Final  Bill = " + finalBill);
        System.out.println("Total Saved = " + totalSaved);
        sc.close();
    }
}
