package org.fundamentals.sprint_1.Loops_Patterns;

import java.util.Scanner;

public class sprint1_26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;

        for(int i=start; i<=end; i++){
            boolean isPrime = checkIfPrime(i);
            if(isPrime){
                count++;
                System.out.print(i+" ");
            }
        }

        if(count==0){
            System.out.println("None");
        }

    }

    private static boolean checkIfPrime(int n) {
        if(n==0 || n==1){
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;

    }
}
