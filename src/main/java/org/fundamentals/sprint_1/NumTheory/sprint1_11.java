package org.fundamentals.sprint_1.NumTheory;

import java.util.Scanner;

public class sprint1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long reversed = reverseNum(n);
        System.out.println("Reversed: "+reversed);

    }

    public static long reverseNum(long n) {
        long reversed = 0;
        while(n>0){
            long reminder = n%10;
            reversed = reversed * 10 + reminder;
            n = n/10;
        }

        return reversed;
    }
}
