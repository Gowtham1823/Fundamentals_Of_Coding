package org.fundamentals.sprint_1.NumTheory;

import java.util.Scanner;

public class sprint1_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long computedNum = compute(n);
        if(n==computedNum){
            System.out.println("Armstrong");
        } else{
            System.out.println("Not Armstrong");
        }
    }

    public static long compute(long n){
        long sum =0;
        long pow = 0;
        long temp =n;

        while(temp>0){
            temp = temp/10;
            pow++;
        }

        while(n>0){
            long rem = n%10;
            sum+= (long) Math.pow(rem,pow);
            n = n/10;
        }

        return sum;
    }
}
