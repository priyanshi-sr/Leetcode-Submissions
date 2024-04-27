class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        return(Prime(n,primes));
    }public static int Prime(int n, int[] primes){
         long[] ug = new long[n];
        int[] ind = new int[primes.length];
        ug[0] = 1;
        for (int i = 1; i < n; i++) {
            long next = Long.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                next = Math.min(next, (long) primes[j] * ug[ind[j]]);
            }
            for (int j = 0; j < primes.length; j++) {
                if (primes[j] * ug[ind[j]] == next) {
                    ind[j]++;
                }
            }

            ug[i] = next;
        }

        return (int)ug[n - 1];
    }

}