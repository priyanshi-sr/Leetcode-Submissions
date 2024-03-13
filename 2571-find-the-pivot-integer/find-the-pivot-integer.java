class Solution {
    public int pivotInteger(int n) {
        return(Pivot(n));
    }
     public static int Pivot(int n) {
        for (int x = 1; x <= n; x++) {
            if (2 * x * x == n * (n + 1)) {
                return x;
            }
        }
        return -1;
    }
}