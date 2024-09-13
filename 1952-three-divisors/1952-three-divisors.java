class Solution {
    public boolean isThree(int n) {
        
            List<Integer> divisors = findDivisors(n);
            if (divisors.size() == 3) {
                return true;
            }
        
        return false;
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