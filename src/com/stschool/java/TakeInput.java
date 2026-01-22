package com.stschool.java;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte age, hours, minutes, seconds, months, daysInMonth;
        short year, marks, fourDigitOTP, hotelRoomNumber, pagesInABook, apartmentRoomNumber;
        int salary, sixDigitOTP, rollNumber;
        long largeNumber, numberOfStars, populationOfCountry, nationBudget;
        float rating, overs, height, petrolPrice, marksPercentage;

        System.out.print("Enter age: ");
        age = sc.nextByte();
        System.out.println("Age = " + age);

        System.out.print("Enter hours: ");
        hours = sc.nextByte();
        System.out.println("Hours = " + hours);

        System.out.print("Enter minutes: ");
        minutes = sc.nextByte();
        System.out.println("Minutes = " + minutes);

        System.out.print("Enter seconds: ");
        seconds = sc.nextByte();
        System.out.println("Seconds = " + seconds);

        System.out.print("Enter months: ");
        months = sc.nextByte();
        System.out.println("Months = " + months);

        System.out.print("Enter days in month: ");
        daysInMonth = sc.nextByte();
        System.out.println("Days in Month = " + daysInMonth);

        System.out.print("Enter year: ");
        year = sc.nextShort();
        System.out.println("Year = " + year);

        System.out.print("Enter marks: ");
        marks = sc.nextShort();
        System.out.println("Marks = " + marks);

        System.out.print("Enter four digit OTP: ");
        fourDigitOTP = sc.nextShort();
        System.out.println("Four Digit OTP = " + fourDigitOTP);

        System.out.print("Enter hotel room number: ");
        hotelRoomNumber = sc.nextShort();
        System.out.println("Hotel Room Number = " + hotelRoomNumber);

        System.out.print("Enter pages in a book: ");
        pagesInABook = sc.nextShort();
        System.out.println("Pages in a Book = " + pagesInABook);

        System.out.print("Enter apartment room number: ");
        apartmentRoomNumber = sc.nextShort();
        System.out.println("Apartment Room Number = " + apartmentRoomNumber);

        System.out.print("Enter salary: ");
        salary = sc.nextInt();
        System.out.println("Salary = " + salary);

        System.out.print("Enter six digit OTP: ");
        sixDigitOTP = sc.nextInt();
        System.out.println("Six Digit OTP = " + sixDigitOTP);

        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
        System.out.println("Roll Number = " + rollNumber);

        System.out.print("Enter large number: ");
        largeNumber = sc.nextLong();
        System.out.println("Large Number = " + largeNumber);

        System.out.print("Enter number of stars: ");
        numberOfStars = sc.nextLong();
        System.out.println("Number of Stars = " + numberOfStars);

        System.out.print("Enter population of country: ");
        populationOfCountry = sc.nextLong();
        System.out.println("Population of Country = " + populationOfCountry);

        System.out.print("Enter nation budget: ");
        nationBudget = sc.nextLong();
        System.out.println("Nation Budget = " + nationBudget);

        System.out.print("Enter rating: ");
        rating = sc.nextFloat();
        System.out.println("Rating = " + rating);

        System.out.print("Enter overs: ");
        overs = sc.nextFloat();
        System.out.println("Overs = " + overs);

        System.out.print("Enter height: ");
        height = sc.nextFloat();
        System.out.println("Height = " + height);

        System.out.print("Enter petrol price: ");
        petrolPrice = sc.nextFloat();
        System.out.println("Petrol Price = " + petrolPrice);

        System.out.print("Enter marks percentage: ");
        marksPercentage = sc.nextFloat();
        System.out.println("Marks Percentage = " + marksPercentage);

        sc.close();
    }
}
