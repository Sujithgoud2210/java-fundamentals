package com.stschool.java;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte teluguMarks, hindiMarks, englishMarks, scienceMarks, socialMarks, mathsMarks;
        System.out.println("enter marks for telugu ");
        teluguMarks = sc.nextByte();
        System.out.println("enter marks for hindi ");
        hindiMarks = sc.nextByte();
        System.out.println("enter marks for english ");
        englishMarks = sc.nextByte();
        System.out.println("enter marks for science ");
        scienceMarks = sc.nextByte();
        System.out.println("enter marks for social ");
        socialMarks = sc.nextByte();
        System.out.println("enter marks for maths ");
        mathsMarks = sc.nextByte();
        Short totalMarks;
        double averageMarks;
        totalMarks = (short) (teluguMarks + hindiMarks + englishMarks + scienceMarks + socialMarks + mathsMarks);
        averageMarks = (float)totalMarks / 6;
        System.out.println("totals marks = " + totalMarks);
        System.out.println("averageMarks marks = " + averageMarks);
        sc.close();
    }
}
