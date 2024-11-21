// class Solution {
//     public int climbStairs(int n) {
//         int[] dp = new int[n+1];
//         for(int i =0;i<=n;i++){
//             dp[i] = -1;

//         }
//         return(Climb(n,dp));
//     }
//     public static int Climb(int n, int[] dp) {
//         if(dp[n] != -1) return dp[n];
//         if (n < 39) {
//             if (n == 0) return 1;
//             if (n < 0) return 0;
//             return Climb(n - 1,dp) + Climb(n - 2,dp);
//         }
//         dp[n] = (int) (Math.pow((0.5 + Math.sqrt(5) / 2), n + 1) / Math.sqrt(5));
//         return dp[n];
//     }
// }
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1]; // Initialize dp array
        for (int i = 0; i <= n; i++) {
            dp[i] = -1; // Fill dp with -1 to indicate uncalculated values
        }
        return Climb(n, dp); // Call the helper function with dp array
    }

    public static int Climb(int n, int[] dp) {
        if (n == 0) return 1; // Base case: 1 way to climb 0 steps
        if (n < 0) return 0;  // Base case: no way to climb negative steps
        
        if (dp[n] != -1) return dp[n]; // Return memoized result if already calculated
        
        dp[n] = Climb(n - 1, dp) + Climb(n - 2, dp); // Recurrence relation
        return dp[n];
    }
}
