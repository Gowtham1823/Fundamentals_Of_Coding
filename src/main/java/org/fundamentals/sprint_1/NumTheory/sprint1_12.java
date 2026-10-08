package org.fundamentals.sprint_1.NumTheory;

import java.util.Scanner;

public class sprint1_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if(n==sprint1_11.reverseNum(n)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
}
