package org.fundamentals.sprint_1;

import java.util.Scanner;

public class sprint1_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0 || n==1){
            System.out.println(n+"!= 1");
            System.out.println("Smallest Factor > 1: None");
        } else{
            // calculate factorial
            long fact = 1;
            boolean isPrime = true;

            for(int j =2; j<=n; j++){
                fact*=j;
            }

            int i=2;
            while(i<n){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
                i++;
            }

            System.out.println(n+"!= "+fact);
            if(isPrime){
                System.out.println("Smallest Factor > 1: "+i+ "(Prime)");
            } else {
                System.out.println("Smallest Factor > 1: "+i+ " (Not Prime)");
            }
        }



    }
}
