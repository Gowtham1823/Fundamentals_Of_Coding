package org.fundamentals.sprint_1.NumTheory;

import java.util.*;

public class sprint1_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> divisors = new ArrayList<>();
        divisors = findDivisorsOfNumber(n);
        for (long l: divisors){
            System.out.print(l+" ");
        }
    }

    private static List<Long> findDivisorsOfNumber(long n) {

        List<Long> divisors = new ArrayList<>();
        for(long i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                divisors.add(i);
                if(n/i!=i){
                    divisors.add(n/i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors;
    }
}
