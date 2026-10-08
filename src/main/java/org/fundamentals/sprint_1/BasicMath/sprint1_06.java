package org.fundamentals.sprint_1.BasicMath;

import java.util.Scanner;

public class sprint1_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        checkIfPrimeWithBreakStmt(n);
        checkIfPrimeWithContinueStmt(n);
    }

    private static void checkIfPrimeWithContinueStmt(long n) {
        if(n<=1){
            System.out.println("Output: Not Prime");
        } else if (n==2) {
            System.out.println("Output: Prime");
        }
        else {
            boolean isPrime = true;
            if(n%2==0){
                isPrime = false;

            } else{
                for(int i =3; i<=Math.sqrt(n); i++){
                    if(i%2==0){
                        continue;
                    }
                    if(n%i==0){
                        isPrime = false;
                        break;
                    }

                }
            }


            if (isPrime) {
                System.out.println("Output: Prime");
            } else {
                System.out.println("Output: Not Prime");
            }

        }

    }

    private static void checkIfPrimeWithBreakStmt(long n) {

        if(n==0 || n==1){
            System.out.println("Output: Not Prime");
        } else {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Output: Prime");
            } else {
                System.out.println("Output: Not Prime");
            }

        }
    }
}
