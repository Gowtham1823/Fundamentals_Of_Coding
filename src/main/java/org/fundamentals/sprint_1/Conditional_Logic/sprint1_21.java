package org.fundamentals.sprint_1.Conditional_Logic;

import java.util.Scanner;

public class sprint1_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();

        calculatorFunc(a,op,b);
    }

    private static void calculatorFunc(int a, char op, int b) {

        switch (op){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;

            case '*' :
                System.out.println(a*b);
                break;

            case '/' :
                if(b!=0){
                    System.out.println((float)a/b);
                    break;
                } else{
                    System.out.println("Error: Divide by 0");
                    break;
                }

            case '%' :
                if(b!=0){
                    System.out.println(a%b);
                    break;
                } else{
                    System.out.println("Error: Divide by 0");
                    break;
                }

            default :
                System.out.println("Error: Invalid Operator");
                break;
        }
    }
}
