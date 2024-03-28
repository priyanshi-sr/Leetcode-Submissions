class Solution {
    public boolean isPerfectSquare(int n) {
        return(Perfect(n));
    }
     public  static boolean Perfect(int n){
       if (n < 0) // Negative numbers are not perfect squares
        return false;
    
    for (long i = 1; i * i <= n; i++) {
        if (i * i == n)
            return true;
    }
    
    return false;
    }
}