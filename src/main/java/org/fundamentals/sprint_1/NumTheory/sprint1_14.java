package org.fundamentals.sprint_1.NumTheory;

import java.util.Scanner;

public class sprint1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;

        for (int i = 1; i < Math.sqrt(n); i++) {

            if(n%i==0){
                sum+=i;

                if(n/i!=i && n/i!=n){
                    sum+=n/i;
                }
            }
        }

        if(sum==n){
            System.out.println("Perfect Number");
        } else{
            System.out.println("Not a Perfect Number");
        }
    }
}
