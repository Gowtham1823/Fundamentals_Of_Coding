package org.fundamentals.sprint_1;

import java.util.Scanner;

public class sprint1_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = sprint1_07.findGCD(a,b);

        long lcm = (a*b)/gcd;
        System.out.println(lcm);
    }
}
