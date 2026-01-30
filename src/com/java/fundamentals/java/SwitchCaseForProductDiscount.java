package com.java.fundamentals.java;

import java.util.Scanner;

public class SwitchCaseForProductDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productPrice, quantity;
        float discountPercentage, shippingCharges, centralTax, stateTax, finalPrice, DiscountedPrice, discountAmount = 0, stateTaxAmount, centralTaxAmount, finalBill, totalSaved, savedAmount;
        centralTax = 2.5f;
        stateTax = 2.5f;
        System.out.print("enter product price = ");
        productPrice = sc.nextInt();
        System.out.println("enter membership details");
        System.out.println(" S for silver ");
        System.out.println("G for gold");
        System.out.println("D for diamond");
        System.out.println("else you dont have membership");
        char membership = sc.next().charAt(0);
        switch (membership){
            case 'S' :
                discountPercentage = 10;
                discountAmount = (productPrice * discountPercentage) / 100;
                shippingCharges = 50;
                break;
            case 'G' :
                discountPercentage = 15;
                discountAmount = (productPrice * discountPercentage) / 100;
                shippingCharges = 20;
                break;
            case 'D' :
                discountPercentage = 20;
                discountAmount = (productPrice * discountPercentage) / 100;
                shippingCharges = 0;
                break;
            default:  shippingCharges = 100;
            break;
        }
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
