package org.fundamentals.sprint_1.Conditional_Logic;

import java.util.Scanner;

public class sprint1_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int citizen = sc.nextInt();
        int disqualified = sc.nextInt();

        if(age>=18 && citizen==1 && disqualified!=1){
            System.out.println("Eligible");
        } else if(age<18 && citizen!=1 && disqualified==1){
            System.out.println("Not Eligible - Too young, Not a citizen, Disqualified");
        }


        else if (age>=18 && citizen!=1 && disqualified!=1) {
            System.out.println("Not Eligible - Not a citizen");
        } else if (age>=18 && citizen!=1 && disqualified==1) {
            System.out.println("Not Eligible - Not a citizen, Disqualified");
        }

        else if (age>=18 && citizen==1 && disqualified==1) {
            System.out.println("Not Eligible - Disqualified");
        }
         else if (age<18 && citizen==1 && disqualified!=1) {
            System.out.println("Not Eligible - Too young");
        } else if (age<18 && citizen==1 && disqualified==1) {
            System.out.println("Not Eligible - Too young & Disqualified");
        }
    }
}
