package org.fundamentals.sprint_1.Loops_Patterns;

import java.util.Scanner;

public class sprint1_27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();

        long oddSum = 0;

        for(long i=start; i<=end; i++){
            if(i%2!=0){
                oddSum+=i;
            }
        }

        System.out.println("OddSum: "+oddSum);
    }
}
