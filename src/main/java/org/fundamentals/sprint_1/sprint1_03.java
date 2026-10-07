package org.fundamentals.sprint_1;

import java.util.Scanner;

public class sprint1_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
