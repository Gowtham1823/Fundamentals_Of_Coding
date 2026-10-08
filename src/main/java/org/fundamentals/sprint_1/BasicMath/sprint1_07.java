package org.fundamentals.sprint_1.BasicMath;

import java.util.Scanner;

public class sprint1_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long result = findGCD(a,b);
        System.out.println("GCD: "+result);
    }

    public static long findGCD(long a, long b) {

        long out = a%b;
        if(out == 0){
            return b;
        }
        a = b;
        b = out;
        return findGCD(a, b);
    }
}
