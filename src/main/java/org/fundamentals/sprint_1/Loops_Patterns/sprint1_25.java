package org.fundamentals.sprint_1.Loops_Patterns;

import java.util.Scanner;

public class sprint1_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
