package org.fundamentals.sprint_1.NumTheory;

import java.util.Scanner;

public class sprint1_09 {
    public static void main(String[] args) {
        long start = 0;
        long prev = 1;


        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        for (int i = 1; i <=n ; i++) {
            System.out.print(start+" ");
            long out = start + prev;
            start = prev;
            prev = out;

        }
    }
}
