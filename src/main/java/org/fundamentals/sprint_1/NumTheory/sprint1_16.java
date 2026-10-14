package org.fundamentals.sprint_1.NumTheory;

import java.util.Scanner;

public class sprint1_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long base = sc.nextLong();
        long power = sc.nextLong();

        basePowerExponentWithLoop(base, power);
        long result = basePowerExponentWithRecursion(base, power);
        System.out.println("With Recursion: "+ result);


    }

    private static long basePowerExponentWithRecursion(long base, long power) {

        if(power==0){
            return  1;
        }

        return base * basePowerExponentWithRecursion(base, power-1);
    }

    private static void basePowerExponentWithLoop(long base, long power) {
        long result = 1;

        for (int i = 1; i <=power ; i++) {

            result*= base;
        }

        System.out.println("result: "+result);

    }
}
