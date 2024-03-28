class Solution {
    public boolean isPerfectSquare(int n) {
        return(Perfect(n));
    }
     public  static boolean Perfect(int n){
        long Start = 1;
        long end = n;
        while(Start<=end){
            long mid = Start +(end-Start)/2;
            if((mid*mid)==n){
                return true;
            }
            if(mid*mid>n) {
                end = mid - 1;
            }
            else{
                Start = mid+1;

            }
        }
        return false;
    }
}