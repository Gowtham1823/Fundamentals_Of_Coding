package org.fundamentals.sprint_1.Conditional_Logic;

import java.util.Scanner;

public class sprint1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        calculateGrade(score);
    }

    private static void calculateGrade(int score) {
        // 90-100=A, 75-89=B, 60-74=C, 50-59=D, below 50=F

        if(score >= 90 && score <=100){
            System.out.println("Grade: A");
        } else if(score >= 75 && score <=89){
            System.out.println("Grade: B");
        } else if (score >= 60 && score <=74){
            System.out.println("Grade: C");
        } else if (score >= 50 && score <=59){
            System.out.println("Grade: D");
        } else if (score <50){
            System.out.println("Grade: F");
        }
        else{
            System.out.println("Invalid Score");
        }

    }
}
