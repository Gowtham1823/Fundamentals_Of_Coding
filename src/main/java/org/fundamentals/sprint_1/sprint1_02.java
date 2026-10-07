package org.fundamentals.sprint_1;


import java.util.Scanner;

public class sprint1_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        calculateArithmeticOperations(A, B);
        swapWithTempVariable(A, B);
        swapWithoutTempVariable(A, B);
    }

    private static void swapWithoutTempVariable(long a, long b) {

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap without temp: A="+a+" B="+b);
    }

    private static void swapWithTempVariable(long a, long b) {
        long temp = 0L;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Swap with temp: A="+a+" B="+b);
    }

    private static void calculateArithmeticOperations(long A, long B) {
        System.out.println("Sum= "+(A+B)+","+" Diff= "+(A-B)+", "+"Product= "+(A*B)+", "+"Quotient= "+(A/B));
    }
}
