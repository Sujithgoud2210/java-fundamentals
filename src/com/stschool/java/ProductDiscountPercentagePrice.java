package com.stschool.java;

import java.util.Scanner;

public class ProductDiscountPercentagePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productPrice, quantity;
        float discountPercentage, centralTax, stateTax, finalPrice, totalPrice, afterDiscountPrice, discountPrice, amountSaved, stateTaxAmount, centralTaxAmonut;
        centralTax = 2.5f;
        stateTax = 2.5f;
        System.out.print("enter product price = ");
        productPrice = sc.nextInt();
        System.out.print("enter discount percentage = ");
        discountPercentage = sc.nextByte();
        discountPrice = (productPrice * discountPercentage) / 100;
        afterDiscountPrice = productPrice - discountPrice;
        stateTaxAmount = (afterDiscountPrice * stateTax) / 100;
        centralTaxAmonut = (afterDiscountPrice * centralTax) / 100;
        finalPrice = afterDiscountPrice + centralTaxAmonut + stateTaxAmount;
        System.out.println("product price before discount = " + finalPrice);
        amountSaved = productPrice - finalPrice;
        System.out.println("total amount saved on product is = " + amountSaved);


    }
}
