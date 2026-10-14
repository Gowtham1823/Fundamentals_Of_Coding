package org.fundamentals.sprint_1.Conditional_Logic;

import java.util.Scanner;

public class sprint1_22 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        float T = sc.nextFloat();
        char scale = sc.next().charAt(0);

        if(scale == 'C'){
            float F = T*((float) 9 /5)+32;
            System.out.println("F= "+F);
            float K = (float) (T + 273.15);
            System.out.println("K= "+K);
        } else if(scale == 'F'){
            float C = (T - 32)* ((float) 5/9);
            System.out.println("C= "+C);
            float K = (float) (C + 273.15);
            System.out.println("K= "+K);
        } else if (scale == 'K') {
            float C = (float) (T - 273.15);
            System.out.println("C= "+C);
            float F = C*((float) 9 /5)+32;
            System.out.println("F= "+F);
        } else{
            System.out.println("Incorrect Scale");
        }
    }
}
