package org.fundamentals.sprint_1;

import java.util.Scanner;

public class sprint1_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        usingForLoop(n);
        usingWhileLoop(n);
        usingGaussFormula(n);
    }

    private static void usingGaussFormula(int n) {
        long sum = ((long) n *(n+1))/2;
        System.out.println("Gauss Formula: "+sum);

    }

    private static void usingWhileLoop(int n) {
        long sum = 0;
        int i =1;
        while(i<=n){
            sum+=i;
            i++;
        }

        System.out.println("While Loop: "+sum);

    }

    private static void usingForLoop(int n) {
        long sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("For Loop: "+sum);
    }
}
