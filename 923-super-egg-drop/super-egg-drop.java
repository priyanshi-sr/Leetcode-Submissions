class Solution {  
    public int superEggDrop(int e, int n) {  
        int[][] dp = new int[n + 1][e + 1];  
        for (int[] a : dp) {  
            Arrays.fill(a, -1);  
        }  
        return Egg(n, e, dp);  
    }  

    public static int Egg(int n, int e, int[][] dp) {  
        if (n == 0) return 0;           
        if (n == 1) return 1;            
        if (e == 1) return n;           
        
        if (dp[n][e] != -1) {  
            return dp[n][e];  
        }  

        int ans = Integer.MAX_VALUE;  
        int lo = 1;
        int hi =n;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            int left = Egg(mid - 1, e - 1, dp);  
            int right = Egg(n - mid, e, dp);  
            int t = Math.max(left, right) + 1;  
            ans = Math.min(ans, t);  
            if(left<right) {
                lo = mid +1;
            }
            else{
                hi = mid-1;
            }
            
        }  

        return dp[n][e] = ans;  
    }  
}