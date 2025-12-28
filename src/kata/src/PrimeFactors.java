package kata.src;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        int candidate = 2;
        while (n > 1) {
            System.out.println(candidate);
            while (n % candidate == 0) {
                primes.add(candidate);
                n /= candidate;
            }
            candidate++;
        }
        return primes;
    }

    public static List<Integer> generateOpt(int n) {
        System.out.println("Candidate | number ");
        List<Integer> primes = new ArrayList<Integer>();
        for (int candidate = 2; n > 1; candidate++) {
            for (; n %candidate==0; n /= candidate) {
                System.out.println(candidate+" | "+n);
                primes.add(candidate);
            }
        }
        return primes;
    }
}
