class Solution {
    public int timeRequiredToBuy(int[] arr, int s) {
        return(Tickets(arr,s));
    }
     public static int Tickets(int[] arr, int s) {
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i <= s) {
                t += Math.min(arr[i], arr[s]);
            } else {
                t += Math.min(arr[i], arr[s]-1);
            }
        }
        return t;
    }
}