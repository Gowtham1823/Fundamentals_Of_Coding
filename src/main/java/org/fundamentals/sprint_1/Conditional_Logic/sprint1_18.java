package org.fundamentals.sprint_1.Conditional_Logic;

import java.util.List;
import java.util.Scanner;

public class sprint1_18 {
    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();

        List<Integer> years = List.of(2024, 2023, 1900, 2000, 2100, 2400, 2028, 2026, 100, 400, 4, 1);
        checkIfLeapYear(years);
    }

    private static void checkIfLeapYear(int year) {

        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }

    private static void checkIfLeapYear(List<Integer> years){
        for(int year: years){
            if(year%4==0 && (year%100!=0 || year%400==0)){
                System.out.println(year+ ": Leap Year");
            }else{
                System.out.println(year+": Not a Leap Year");
            }
        }
    }
}
