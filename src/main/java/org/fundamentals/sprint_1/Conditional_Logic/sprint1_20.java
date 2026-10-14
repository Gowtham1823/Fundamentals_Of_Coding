package org.fundamentals.sprint_1.Conditional_Logic;

import java.util.Scanner;

public class sprint1_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = checkValidTriangleType(a,b,c);
        System.out.println(result);
    }

    private static String checkValidTriangleType(int a, int b, int c) {


        // check if valid triangle

        if((a+b)>c){

            if(a==b && a==c){
                return "Equilateral Triangle";
            }

            if(a == b){
                return "Isosceles Triangle";
            }

            if(b != c && a != c){
                return "Scalene Triangle";
            }



        }

            return "Not a Valid Triangle";

    }
}
