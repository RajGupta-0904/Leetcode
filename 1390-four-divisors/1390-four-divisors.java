// import java.util.*;

class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            List<Integer> divisors = findDivisors(n);
            if (divisors.size() == 4) {
                for (int d : divisors) {
                    sum += d;
                }
            }
        }
        return sum;
    }

    static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
