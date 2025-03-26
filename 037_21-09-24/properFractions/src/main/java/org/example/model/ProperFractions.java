package org.example.model;

// https://www.codewars.com/kata/55b7bb74a0256d4467000070/train/java

public class ProperFractions {
    public static long properFractions(long n) {
        if (n == 1) return 0;

        long result = n; 
        for (long p = 2; p * p <= n; p++) {

            if (n % p == 0) {
                while (n % p == 0) {
                    n /= p;
                }
                result -= result / p;
            }
        }

        if (n > 1) {
            result -= result / n;
        }

        return result;
    }

}
