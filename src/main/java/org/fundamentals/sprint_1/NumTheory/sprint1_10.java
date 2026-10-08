package org.fundamentals.sprint_1.NumTheory;

import java.util.Scanner;

public class sprint1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count =0;
        long sum=0;

        if(n==0){
            count = 1;
        }

        while(n>0){
            long rem = n % 10;
            n = n/10;
            sum+= rem;
            count++;
        }

        System.out.println("Count: "+count);
        System.out.println("Sum: "+sum);
    }
}
