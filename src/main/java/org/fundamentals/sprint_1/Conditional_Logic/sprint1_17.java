package org.fundamentals.sprint_1.Conditional_Logic;

import java.util.Scanner;

public class sprint1_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int out = findLargest(a,b,c);
        System.out.println("Largest Number: " + out);
    }

    public static int findLargest(int a, int b, int c){

        int largest = Integer.MIN_VALUE;

        if(a == b && a == c){
            largest = a;
        }

        if(a>=b){
            if(a>=c){
                largest = a;
            } else{
                largest = c;
            }
        } else if (b>=c) {
            largest = b;
        }

        return largest;

    }
}
