package org.fundamentals.sprint_1.Loops_Patterns;

import java.util.Scanner;

public class sprint1_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=1; i<=n; i++){
            int k = n-i;
            int l = 2*i-1;
            for(int j=i; j<=(2*n-1); j++){
                if(k!=0){
                    System.out.print(" ");
                    k--;
                } else{
                    while(l>0){
                        System.out.print("*");
                        l--;
                    }
                    k = n-i;
                }

            }
            System.out.println();
        }
    }
}
