package com.stschool.java;

import java.util.Scanner;

public class EcommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productPrice, quantity = 0, availableStock = 100, choice;
        float discountPercentage, shippingCharges, centralTax, stateTax, finalPrice, DiscountedPrice, discountAmount = 0, stateTaxAmount, centralTaxAmount, finalBill, totalSaved, savedAmount;
        centralTax = 2.5f;
        stateTax = 2.5f;
        char continueShopping;
        do {
            System.out.println("--Welcome to E-commerce app");
            System.out.println("1.Products");
            System.out.println("2.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter product price = ");
                    productPrice = sc.nextInt();
                    System.out.println("enter membership details");
                    System.out.println(" S for silver ");
                    System.out.println("G for gold");
                    System.out.println("D for diamond");
                    System.out.println("else you don't have membership");
                    char membership = sc.next().charAt(0);
                    switch (membership) {
                        case 'S':
                            discountPercentage = 10;
                            discountAmount = (productPrice * discountPercentage) / 100;
                            shippingCharges = 50;
                            break;
                        case 'G':
                            discountPercentage = 15;
                            discountAmount = (productPrice * discountPercentage) / 100;
                            shippingCharges = 20;
                            break;
                        case 'D':
                            discountPercentage = 20;
                            discountAmount = (productPrice * discountPercentage) / 100;
                            shippingCharges = 0;
                            break;
                        default:
                            shippingCharges = 100;
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
                    if (quantity > availableStock) {
                        System.out.println("stock is not available");
                        System.out.println("available stock = " + availableStock);
                    }
                    availableStock = availableStock - quantity;
                    finalBill = finalPrice * quantity + shippingCharges;
                    totalSaved = quantity * savedAmount;
                    System.out.println("Final  Bill = " + finalBill);
                    System.out.println("Total Saved = " + totalSaved);
                    System.out.println("Thanks for shopping with us");
                    System.out.println("Do you want to continue(Y/N)");
                    break;
                case 2:
                    System.exit(0);
                    break;

            }    continueShopping = sc.next().charAt(0);
        }
            while (continueShopping == 'Y') ;
            sc.close();
        }
    }