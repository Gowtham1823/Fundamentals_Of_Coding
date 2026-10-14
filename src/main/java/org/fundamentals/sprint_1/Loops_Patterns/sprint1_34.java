package org.fundamentals.sprint_1.Loops_Patterns;

import java.util.Scanner;

public class sprint1_34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long sum =0;
        long temp = num;
        while(temp>0){
            sum+=temp%10;
            temp = temp/10;
        }

        if(num%sum==0){
            System.out.println("Harshad");
        } else{
            System.out.println("Not Harshad");
        }
    }
}
