package org.fundamentals.sprint_1.Loops_Patterns;

import java.util.Scanner;

public class SPRINT1_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int space = cols-2;

        for(int i=1;i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || i==rows){
                    System.out.print("*");
                } else{
                    if(j==1 || j==cols){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
